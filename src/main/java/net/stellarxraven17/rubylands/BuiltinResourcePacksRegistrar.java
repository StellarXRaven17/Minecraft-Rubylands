package net.stellarxraven17.rubylands;

import net.neoforged.neoforge.event.AddPackFindersEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.ModList;
import net.neoforged.fml.ModContainer;

import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackResources;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.PathPackResources;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.server.packs.PackLocationInfo;
import net.minecraft.server.packs.PackSelectionConfig;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

@EventBusSubscriber(modid = RdMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class BuiltinResourcePacksRegistrar {

    private static final PackEntry[] PACKS = new PackEntry[] {

        // Add more like: new PackEntry("retro_ui", "Retro UI", true)
    	
        new PackEntry("programmer_art", "Omprogrammert", false),
		// Programmer art patch, makes the game look more like Cypress.
        //new PackEntry("32x", "Half-Ver", false),
        // Potential 32-bit/medival styled visuals, most likely gonna ask Mariood if I can use HalfVer for it.
        //(DO NOT UNCOMMENT UNTIL THE DIRECTORY EXISTS!!!)
    };

    @SubscribeEvent
    public static void onAddPackFinders(AddPackFindersEvent event) {
        System.out.println("[ResourcePacks] AddPackFindersEvent fired for type: " + event.getPackType());
        
        if (event.getPackType() != PackType.CLIENT_RESOURCES) {
            System.out.println("[ResourcePacks] Not client resources, skipping");
            return;
        }

        Optional<? extends ModContainer> containerOpt = ModList.get().getModContainerById(RdMod.MODID);
        if (containerOpt.isEmpty()) {
            System.out.println("[ResourcePacks] Could not find mod container for " + RdMod.MODID);
            return;
        }

        // Use getFilePath() to get the mod file path
        Path modFileRoot = containerOpt.get().getModInfo().getOwningFile().getFile().getFilePath();
        System.out.println("[ResourcePacks] Mod file root: " + modFileRoot);
        
        // Check if we're in development (classes directory) or production (JAR file)
        String pathStr = modFileRoot.toString();
        if (pathStr.contains("build" + System.getProperty("file.separator") + "classes")) {
            // Development environment - look in src/main/resources
            Path projectRoot = modFileRoot;
            // Navigate up to find project root (contains src folder)
            while (projectRoot != null && !Files.exists(projectRoot.resolve("src"))) {
                projectRoot = projectRoot.getParent();
            }
            if (projectRoot != null) {
                Path srcResources = projectRoot.resolve("src").resolve("main").resolve("resources");
                if (Files.exists(srcResources)) {
                    modFileRoot = srcResources;
                    System.out.println("[ResourcePacks] Development mode - using: " + modFileRoot);
                }
            }
        } else if (pathStr.endsWith(".jar")) {
            // Production environment - JAR file, need to access resources inside JAR
            System.out.println("[ResourcePacks] Production mode - JAR file detected");
            
            try {
                // Create a FileSystem to access the JAR contents
                java.net.URI jarUri = java.net.URI.create("jar:" + modFileRoot.toUri());
                java.nio.file.FileSystem jarFs = java.nio.file.FileSystems.newFileSystem(jarUri, java.util.Map.of());
                
                for (PackEntry entry : PACKS) {
                    Path jarPackRoot = jarFs.getPath("resourcepacks", entry.folderName());
                    System.out.println("[ResourcePacks] Looking for pack in JAR at: " + jarPackRoot);
                    
                    if (!Files.exists(jarPackRoot)) {
                        System.out.println("[ResourcePacks] Pack directory does not exist in JAR: " + jarPackRoot);
                        continue;
                    }
                    
                    String id = RdMod.MODID + ":" + entry.folderName();
                    Component title = Component.literal(entry.displayName());
                    
                    System.out.println("[ResourcePacks] Registering JAR pack: " + id + " (" + entry.displayName() + ")");
                    
                    try {
                        PackLocationInfo location = new PackLocationInfo(id, title, PackSource.DEFAULT, Optional.empty());
                        PackSelectionConfig config = new PackSelectionConfig(entry.alwaysEnabled(), Pack.Position.TOP, false);
                        
                        Pack.ResourcesSupplier supplier = new Pack.ResourcesSupplier() {
                            @Override
                            public PackResources openPrimary(PackLocationInfo packLocationInfo) {
                                return new PathPackResources(location, jarPackRoot);
                            }
                            
                            @Override
                            public PackResources openFull(PackLocationInfo packLocationInfo, Pack.Metadata metadata) {
                                return new PathPackResources(location, jarPackRoot);
                            }
                        };
                        
                        Pack pack = Pack.readMetaAndCreate(location, supplier, event.getPackType(), config);
                        
                        if (pack != null) {
                            event.addRepositorySource(consumer -> {
                                consumer.accept(pack);
                                System.out.println("[ResourcePacks] JAR pack accepted by repository: " + id);
                            });
                            System.out.println("[ResourcePacks] Successfully registered JAR pack: " + id);
                        } else {
                            System.out.println("[ResourcePacks] Failed to create JAR pack: " + id);
                        }
                    } catch (Exception e) {
                        System.out.println("[ResourcePacks] Exception while registering JAR pack " + id + ": " + e.getMessage());
                        e.printStackTrace();
                    }
                }
            } catch (Exception e) {
                System.out.println("[ResourcePacks] Failed to open JAR filesystem: " + e.getMessage());
                e.printStackTrace();
            }
            return; // Exit early for JAR handling
        } else {
            // Production environment - directory-based mod file
            System.out.println("[ResourcePacks] Production mode - using: " + modFileRoot);
        }

        for (PackEntry entry : PACKS) {
            Path packRoot = modFileRoot.resolve("resourcepacks").resolve(entry.folderName());
            System.out.println("[ResourcePacks] Looking for pack at: " + packRoot);
            
            if (!Files.exists(packRoot)) {
                System.out.println("[ResourcePacks] Pack directory does not exist: " + packRoot);
                continue;
            }

            String id = RdMod.MODID + ":" + entry.folderName();
            Component title = Component.literal(entry.displayName());

            System.out.println("[ResourcePacks] Registering pack: " + id + " (" + entry.displayName() + ")");

            try {
                // Create PackLocationInfo and PackSelectionConfig
                PackLocationInfo location = new PackLocationInfo(id, title, PackSource.DEFAULT, Optional.empty());
                PackSelectionConfig config = new PackSelectionConfig(entry.alwaysEnabled(), Pack.Position.TOP, false);
                
                // Create a proper Pack.ResourcesSupplier implementation
                Pack.ResourcesSupplier supplier = new Pack.ResourcesSupplier() {
                    @Override
                    public PackResources openPrimary(PackLocationInfo packLocationInfo) {
                        return new PathPackResources(location, packRoot);
                    }
                    
                    @Override
                    public PackResources openFull(PackLocationInfo packLocationInfo, Pack.Metadata metadata) {
                        return new PathPackResources(location, packRoot);
                    }
                };
                
                Pack pack = Pack.readMetaAndCreate(
                    location,
                    supplier,
                    event.getPackType(),
                    config
                );
                
                if (pack != null) {
                    event.addRepositorySource(consumer -> {
                        consumer.accept(pack);
                        System.out.println("[ResourcePacks] Pack accepted by repository: " + id);
                    });
                    System.out.println("[ResourcePacks] Successfully registered pack: " + id);
                } else {
                    System.out.println("[ResourcePacks] Failed to create pack: " + id);
                }
            } catch (Exception e) {
                System.out.println("[ResourcePacks] Exception while registering pack " + id + ": " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    private record PackEntry(String folderName, String displayName, boolean alwaysEnabled) {}
}

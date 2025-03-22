package dev.geco.gsit.service;

import dev.geco.gsit.GSitMain;
import org.bukkit.entity.Player;

import java.util.function.Consumer;

public class UpdateService {

    public UpdateService(GSitMain gSitMain) {
    }

    public void checkForUpdates() {
    }

    public void checkForUpdates(Player player) {
    }

    private void getSpigotVersion(Consumer<String> versionConsumer) {
    }

    private void checkVersion() {
    }

    private String getShortVersion(String version) { return version.replaceAll("[\\[\\] ]", ""); }

}

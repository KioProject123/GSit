package dev.geco.gsit.service;

import dev.geco.gsit.GSitMain;

import java.util.UUID;

public class ToggleService {

    public ToggleService(GSitMain gSitMain) {
    }

    public void createDataTables() {
    }

    public void clearEntitySitToggleCache(UUID entityUuid) {
    }

    public boolean canEntityUseSit(UUID entityUuid) {
        return true;
    }

    public boolean canPlayerUsePlayerSit(UUID playerUuid) {
        return true;
    }

    public boolean canPlayerUseCrawl(UUID playerUuid) {
        return true;
    }

    public void setEntityCanUseSit(UUID entityUuid, boolean canUseSit) {
    }

    public void setPlayerCanUsePlayerSit(UUID playerUuid, boolean canUsePlayerSit) {
    }

    public void setPlayerCanUseCrawl(UUID playerUuid, boolean canUseCrawl) {
    }

}

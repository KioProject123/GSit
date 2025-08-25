package dev.geco.gsit.service;

import dev.geco.gsit.GSitMain;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

abstract public class MessageService {

    public MessageService(GSitMain gSitMain) {
    }

    public void loadMessages() {
    }

    abstract public void sendMessage(@NotNull CommandSender target, String message, Object... replaceList);

    abstract public void sendActionBarMessage(@NotNull Player target, String message, Object... replaceList);

}

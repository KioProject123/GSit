package dev.geco.gsit.service.message;

import dev.geco.gsit.GSitMain;
import dev.geco.gsit.service.MessageService;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PaperMessageService extends MessageService {

    public PaperMessageService(GSitMain gSitMain) {
        super(gSitMain);
    }

    public void sendMessage(@NotNull CommandSender target, String message, Object... replaceList) {
    }

    public void sendActionBarMessage(@NotNull Player target, String message, Object... replaceList) {
    }

}

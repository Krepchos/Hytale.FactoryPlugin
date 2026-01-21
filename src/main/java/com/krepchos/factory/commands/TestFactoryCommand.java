package com.krepchos.factory.commands;

import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.command.system.basecommands.AbstractPlayerCommand;
import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.server.core.entity.entities.player.pages.PageManager;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.server.core.universe.world.World;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import com.krepchos.factory.pages.HelloWorldPage;
import com.krepchos.factory.pages.TextFieldPage;

import javax.annotation.Nonnull;

public class TestFactoryCommand extends AbstractPlayerCommand {
    public TestFactoryCommand() {
        super("factory", "Opens a styled dialog");
    }

    @Override
    protected void execute(
            @Nonnull CommandContext context,
            @Nonnull Store<EntityStore> store,
            @Nonnull Ref<EntityStore> ref,
            @Nonnull PlayerRef playerRef,
            @Nonnull World world
    ) {
        var player = (Player) store.getComponent(ref, Player.getComponentType());
        var page = new TextFieldPage(playerRef);
        assert player != null;
        var pageManager = player.getPageManager();
        pageManager.openCustomPage(ref, store, page);
    }
}

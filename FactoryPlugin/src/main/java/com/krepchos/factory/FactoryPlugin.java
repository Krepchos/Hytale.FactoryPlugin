package com.krepchos.factory;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.krepchos.factory.commands.TestFactoryCommand;

import javax.annotation.Nonnull;

public class FactoryPlugin extends JavaPlugin {
    public FactoryPlugin(@Nonnull JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {

        getCommandRegistry().registerCommand(new TestFactoryCommand());

        //getLogger().at(Level.INFO).log("Commands registered: /testui, /dialog, /form, /info, /tutorial1, /tutorial2, /tutorial3");
    }
}

/*
 * Copyright 2013 Dominic Masters and Jordan Atkins
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.domsplace.Villages.Commands.SubCommands.AdminCommands;

import com.domsplace.Villages.Bases.Base;
import com.domsplace.Villages.Bases.BukkitCommand;
import com.domsplace.Villages.Bases.SubCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class VillageAdminDebug extends SubCommand {  
    public VillageAdminDebug() {
        super("village", "admin", "debug");
        this.setPermission("admin.debug");
    }
    
    @Override
    public boolean cmd(BukkitCommand bkcmd, CommandSender sender, Command cmd, String label, String[] args) {
        Base.DebugMode = !Base.DebugMode;
        debug(getPlugin().getName() + " Debug Mode Enabled!");
        sendMessage(sender, "Turned Debug Mode " + ChatImportant + (Base.DebugMode ? "On" : "Off"));
        return true;
    }
}

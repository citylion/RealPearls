package com.devotedmc.ExilePearl.command;

import com.devotedmc.ExilePearl.ExilePearl;
import com.devotedmc.ExilePearl.ExilePearlApi;
import com.devotedmc.ExilePearl.Lang;
import com.devotedmc.ExilePearl.util.Permission;

import java.util.UUID;

public class CmdProbe extends PearlCommand {

	public CmdProbe(ExilePearlApi pearlApi) {
		super(pearlApi);
		this.aliases.add("pearlprobe");

		this.setHelpShort("Probes pearl times");

		this.permission = Permission.SET_KILLER.node;
		this.visibility = CommandVisibility.SECRET;
	}

	@Override
	public void perform() {

		ExilePearl pearl = plugin.getPearlFromItemStack(player().getInventory().getItemInMainHand());
		if(pearl == null) {
			msg(Lang.pearlMustBeHoldingPearl);
			return;
		}

		msg("Pearl free on:" + pearl.getFreeOn().getTime());
		msg("Current time is: " + System.currentTimeMillis());

	}
}

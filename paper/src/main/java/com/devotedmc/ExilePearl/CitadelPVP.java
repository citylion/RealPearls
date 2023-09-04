package com.devotedmc.ExilePearl;

import org.bukkit.Bukkit;
import org.quartz.SchedulerException;
import red.civ.scarcity.Scarcity;
import red.civ.scarcity.quartz.GameEnd;

public class CitadelPVP {


	public static long getTimeMapEnd() {

		try{
			Bukkit.getLogger().severe("Time map end according to Scarcity plugin is " + GameEnd.getDate());
			return GameEnd.getDate().getTime();
		}
		catch (Exception e){
			return 0;
		}

	}
}

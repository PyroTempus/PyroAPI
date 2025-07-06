package me.PyroAPI.Events.PyroWeatherPro;

import org.bukkit.World;

import me.PyroAPI.Events.PyroBaseEvent;

public class PyroWeatherStartEvent extends PyroBaseEvent {

	private String stormId;
	private World world;

	public PyroWeatherStartEvent(String stormId, World world) {
		this.stormId = stormId;
		this.world = world;
	}

	public String getStormId() {
		return stormId;
	}

	public World getWorld() {
		return world;
	}
	
}

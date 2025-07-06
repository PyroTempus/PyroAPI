package me.PyroAPI.Events.PyroWeatherPro;

import org.bukkit.World;

import me.PyroAPI.Events.PyroBaseEvent;

public class PyroWeatherEndEvent extends PyroBaseEvent {

	private String stormId;
	private World world;

	public PyroWeatherEndEvent(String stormId, World world) {
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

package me.PyroAPI.Events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public abstract class PyroBaseEvent extends Event {
	
	private static final HandlerList HANDLERS = new HandlerList();
	  
	public static HandlerList getHandlerList() {
		return HANDLERS;
	}
	  
	public HandlerList getHandlers() {
		return HANDLERS;
	}
}

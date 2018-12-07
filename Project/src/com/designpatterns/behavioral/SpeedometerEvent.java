package com.designpatterns.behavioral;

import java.util.EventObject;

public class SpeedometerEvent extends EventObject {
	/**
	 * This static variable is recommended for class, but is not used for the demo
	 */
	private static final long serialVersionUID = 1L;
	private int speed;
	
	public SpeedometerEvent(Object source, int speed) {
		super(source);
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}

}

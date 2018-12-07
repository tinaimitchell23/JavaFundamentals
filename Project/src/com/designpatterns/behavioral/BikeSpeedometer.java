package com.designpatterns.behavioral;

import java.util.ArrayList;
import java.util.List;

public class BikeSpeedometer {
	
private int currentSpeed;
private List<SpeedometerListener> listeners;

	public BikeSpeedometer () {
	currentSpeed = 0;
	listeners = new ArrayList<SpeedometerListener>();
}

	public void setCurrentSpeed(int speed) {
		this.currentSpeed = speed;
		
		// Tell all observers so they know speed has changed
		fireSpeedChanged(); // method defined below
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	public void addSpeedometerListener(SpeedometerListener obj) {
		listeners.add(obj);
	}
	
	public void removeSpeedometerListener(SpeedometerListener obj) {
		listeners.remove(obj);
	}
	
	protected void fireSpeedChanged() {
		SpeedometerEvent speedEvent = new SpeedometerEvent(this, getCurrentSpeed());
		
		for (SpeedometerListener listen : listeners) {
			listen.speedChange(speedEvent);
		}
	}

}

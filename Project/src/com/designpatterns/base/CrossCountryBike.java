package com.designpatterns.base;

public class CrossCountryBike extends MountainBike{
	public CrossCountryBike(WheelInterface wheel) {
		this(wheel, BikeInterface.Color.CHROME);
	}
	public CrossCountryBike(WheelInterface wheel, BikeInterface.Color color) {
		super(wheel, color);
	}

}

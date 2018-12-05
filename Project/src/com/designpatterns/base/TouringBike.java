package com.designpatterns.base;

public class TouringBike extends RoadBike {
	public TouringBike(WheelInterface wheel) {
		this(wheel, BikeInterface.Color.BLACK);
	}
	public TouringBike(WheelInterface wheel, BikeInterface.Color color) {
		super(wheel, color);
	}
	
	@Override
	public float getPrice() {
		return 570.00f;
	}

}

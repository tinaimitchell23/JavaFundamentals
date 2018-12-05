package com.designpatterns.base;

public interface BikeInterface {
	public enum Color {UNPAINTED, CHROME, BLACK, BLUE, RED };
	public WheelInterface getWheel();
	public BikeInterface.Color getColor();
	public void paint(BikeInterface.Color color);
	public float getPrice();
	
	
	public void cleanFrame();
	public void airTires();
	public void testRide();
	
	
}

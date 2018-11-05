package com.fundamentals.java;

public class Condo extends House {
	private boolean hasBalcony;

	public void sethasBalcony(boolean hasBalcony) {
		this.hasBalcony = hasBalcony;
	}

	public boolean gethasBalcony() {
		return hasBalcony;

	}

	@Override
	public void openDoor() {
		System.out.println("I opened a wooden door");
	}

}

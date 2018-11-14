package com.fundamentals.java;

public class House implements HomeInterface, PlumbingInterface{

	private String windows;

	private String doors;

	private boolean hasStairs;

	public void setWindows(String value) {
		this.windows = value;
	}

	public String getWindows() {
		return windows;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getDoors() {
		return doors;
	}

	public void setHasStairs(boolean value) {
		hasStairs = value;
	}

	public boolean getHasStairs() {
		return hasStairs;
	}

	public void openDoor() {
		System.out.println("I opened a Steel Door");
	}

	public void closeDoor() {
	}



	public static void myHouse() {
		House myHouse = new House();
		// myHouse.doors = "Red Doors";
		myHouse.setDoors("Red Doors");
		
		House mySecondHome = new House();
		mySecondHome.doors = "Purple Doors";
		
		House myThirdHome = myHouse;
		myHouse = mySecondHome;
		
		House[] houseArray = new House[] { myHouse, mySecondHome, myThirdHome};
		
		 System.out.println(myHouse.getDoors()); // 5 Red doors, 1 Null, ? Purple Doors
		 System.out.println(mySecondHome.getDoors()); // Purple Doors
		 System.out.println(myThirdHome.getDoors()); // 4 Purple Doors, 1 Red Doors, 1 Null
		
		int i = 0;
		do {
			System.out.print(houseArray[i].getDoors());
			i ++;
		} while(i < houseArray.length);
	}

	public static void mySongExample() {
		
	}

	@Override
	public void decorate() {
		// TODO Auto-generated method stub
		System.out.println("Decorate House");
		
	}

	@Override
	public void installPlumbing() {
		// TODO Auto-generated method stub
		System.out.println("Installing Plumbing");
		
	}

	@Override
	public void supplementWork() {
		// TODO Auto-generated method stub
		System.out.println("Supplement Work");
	}
}

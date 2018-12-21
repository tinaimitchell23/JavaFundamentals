package com.java.project;

public class SmallWidget extends AbstractWidget {
	public SmallWidget(SurfaceColor color) {
		super(color);
		this.serialNumber = SerialNumbers.getInstance().getNextSerial(SerialNumbers.productTypes.SmallWidget);
	}
	
	public String getGears() {
		return "2 Gears";
	}
	
	public String getLevers() {
		return "1 Lever";
	}
	
	public String getSprings() {
		return "3 Springs";
	}


}

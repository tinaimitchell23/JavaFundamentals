package com.java.project;

public class MediumWidget extends AbstractWidget {
	public MediumWidget(SurfaceColor color) {
		super(color);
		this.serialNumber = SerialNumbers.getInstance().getNextSerial(SerialNumbers.productTypes.MediumWidget);
	}
	
	public String getGears() {
		return "4 Gears";
	}
	
	public String getLevers() {
		return "3 Levers";
	}
	
	public String getSprings() {
		return "5 Springs";
	}


}

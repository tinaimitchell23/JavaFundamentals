package com.java.project;

public class LargeWidget extends AbstractWidget{
	public LargeWidget(SurfaceColor color) {
		super(color);
		this.serialNumber = SerialNumbers.getInstance().getNextSerial(SerialNumbers.productTypes.LargeWidget);
	}
	public String getGears() {
		return "9 Gears";
	}
	public String getLevers() {
		return "2 Levers";
	}
	public String getSprings() {
		return "4 Springs";
	}

}

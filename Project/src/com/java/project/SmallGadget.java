package com.java.project;

import java.util.ArrayList;
import java.util.List;

public class SmallGadget extends AbstractGadget{
	public SmallGadget() {
		this(SurfaceColor.PAINTED);
	}

	public SmallGadget(SurfaceColor color) {
		super(color);
		this.serialNumber = SerialNumbers.getInstance().getNextSerial(SerialNumbers.productTypes.SmallGadget);
	}
	
	public List<WidgetInterface>getWidgets(SurfaceColor color){
		List<WidgetInterface>myList = new ArrayList<>();
		myList.add(new MediumWidget(color));
		myList.add(new SmallWidget(color));
		return myList;
	}
	
	public int getSwitches() {
		return 1;
	}
	
	public int getButtons() {
		return 2;
	}
	
	public int getLights() {
		return 0;
	}
	
	public String getPowerSource() {
		return "Battery Powered";
	}
	
	public float getPrice() {
		return 19.99F;
	}

}

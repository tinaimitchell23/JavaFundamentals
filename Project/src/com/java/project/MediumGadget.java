package com.java.project;

import java.util.ArrayList;
import java.util.List;

public class MediumGadget extends AbstractGadget {
	public MediumGadget() {
		this(SurfaceColor.PAINTED);
	}

	public MediumGadget(SurfaceColor color) {
		super(color);
		this.serialNumber = SerialNumbers.getInstance().getNextSerial(SerialNumbers.productTypes.MediumGadget);
	}
	
	public List<WidgetInterface>getWidgets(SurfaceColor color){
		List<WidgetInterface>myList = new ArrayList<>();
		myList.add(new LargeWidget(color));
		myList.add(new MediumWidget(color));
		myList.add(new MediumWidget(color));
		myList.add(new SmallWidget(color));
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
		return 3;
	}
	
	public String getPowerSource() {
		return "Solar Powered";
	}
	
	public float getPrice() {
		return 35.99F;
	}

}

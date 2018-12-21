package com.java.project;

import java.util.ArrayList;
import java.util.List;

public class LargeGadget extends AbstractGadget{
	public LargeGadget() {
		this(SurfaceColor.PAINTED);
	}

	public LargeGadget(SurfaceColor color) {
		super(color);
		this.serialNumber = SerialNumbers.getInstance().getNextSerial(SerialNumbers.productTypes.LargeGadget);
	}
	
	public List<WidgetInterface>getWidgets(SurfaceColor color){
		List<WidgetInterface>myList = new ArrayList<>();
		myList.add(new LargeWidget(color));
		myList.add(new LargeWidget(color));
		myList.add(new LargeWidget(color));
		myList.add(new MediumWidget(color));
		myList.add(new MediumWidget(color));
		myList.add(new MediumWidget(color));
		myList.add(new MediumWidget(color));
		myList.add(new MediumWidget(color));
		myList.add(new MediumWidget(color));
		myList.add(new SmallWidget(color));
		myList.add(new SmallWidget(color));
		myList.add(new SmallWidget(color));
		return myList;
	}
	
	public int getSwitches() {
		return 2;
	}
	
	public int getButtons() {
		return 4;
	}
	
	public int getLights() {
		return 5;
	}
	
	public String getPowerSource() {
		return "Generator";
	}
	
	public float getPrice() {
		return 49.99F;
	}

}

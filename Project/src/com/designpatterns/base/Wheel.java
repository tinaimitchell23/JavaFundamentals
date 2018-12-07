package com.designpatterns.base;

import com.designpatterns.behavioral.Bearings;
import com.designpatterns.behavioral.Spokes;
import com.designpatterns.behavioral.WheelVisitorInterface;

public abstract class Wheel implements WheelInterface {
	private int size;
	private boolean isWide;
	
	private Spokes spokes;
	private Bearings bearings;
	
	public Wheel(int size, boolean isWide) {
		this.size = size;
		this.isWide = isWide;
	}
	
	public void acceptVisitor(WheelVisitorInterface visitor) {
		spokes.acceptVisitor(visitor);
		bearings.acceptVisitor(visitor);
		visitor.visit(this);
	}
	
	@Override
	public int getSize() {
		return size;
	}
	
	@Override
	public boolean isWide() {
		return isWide;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " (" +size+ ")";
	}

}

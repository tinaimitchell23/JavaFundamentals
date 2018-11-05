package com.fundamentals.java;

public class CockerSpaniel  extends Dog{
	private boolean longEars;
	public void setHasLongEars(boolean value) {
		longEars = value;
	}
	
	@Override
	public void smell() {
		super.smell();
		System.out.println("Dogs can smell far");
	}
	
}

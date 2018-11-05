package com.fundamentals.data;

public class Apple {
	public void display(String type, int count) {
		display(type, count, "Green");
	}
	
	public void display(String type, int count, String color) {
		System.out.println("I would like "+count+" "+type+" apples that are "+color);
	}
	
	public String display(String type, String color) {
		return "I would like 6 " +type+" apples that are "+color;
	}
}

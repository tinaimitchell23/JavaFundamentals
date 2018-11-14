package com.fundamentals.data;

public class Quiz2 {
	
	public class Animal {
		
		public void sound() {
			System.out.print("Animal is making a sound");
		}
	}
	
	public class Tiger extends Animal {
		
		@Override
		public void sound () {
			System.out.println("Roar");
		}
	}
	
	public class Cat extends Tiger {
		
		@Override
		public void sound () {
			System.out.println("Meow");
		}
	}
	
	public static final int MY_VALUE = 5;
	public static int MY_OTHER_VALUE;
	
	static {
		MY_OTHER_VALUE = 10;
		int total = MY_VALUE * MY_OTHER_VALUE; // total should be 50
		System.out.println(total);
	}
	
	public class EmpInfo {
		private String name;
		private int age;
		private String number;
		
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}
		
		public String getNumber() {
			return number;
		}
		
		public void setName(String newName) {
			name = newName;
		}
		
		public void setAge(int newAge) {
			age = newAge;
		}
		
		public void getNumber(String string) {
			number = string;
		}
	}
	
	public class RunEncap {
		
		public void main(String args[]) {
			EmpInfo encap = new EmpInfo ();
			encap.setName("Bruce");
			encap.setAge(23);
			encap.getNumber("5550123");
			
			System.out.println("Name :" + encap.getName());
			System.out.println("Age :" + encap.getAge());
			System.out.println("Number :" + encap.getNumber());
			}
		}
	}
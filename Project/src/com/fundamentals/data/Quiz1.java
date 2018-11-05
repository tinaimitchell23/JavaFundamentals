package com.fundamentals.data;

public class Quiz1 {
	
	public void divisibleByThree() {
		for (int i = 0; i < 30; i ++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public void evenNumbers() {
		for(int i = 0; i < 100; i ++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public void oddNumbers() {
		for(int i = 0; i < 100; i ++) {
			if(i % 2 == 0) {
				if (i == 0) {
					continue;
				}
				System.out.println(i - 1);
			}
		}
	}
	
	public void grade(char value) {
		switch(value) {
		case 'E':
		}
	}

}

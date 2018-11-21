package com.fundamentals.data;

public class Pterodactyl extends Dinosaur {

	public Pterodactyl(String teeth, String skin) {
		super(teeth, skin);
	}

	@Override
	public void move() {
		System.out.println("All pterodactylas fly");
	}
}

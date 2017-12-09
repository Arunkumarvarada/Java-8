package com.java4u.dp.proxy;

public class RealImage implements Image {

	private String filename;

	public RealImage(String filename) {

		this.filename = filename;
		laodFromDisk(filename);
	}

	private void laodFromDisk(String filename) {
		System.out.println("Loading ... " + filename);

	}

	@Override
	public void display() {
		System.out.println("Displaying ... " + filename);

	}

}

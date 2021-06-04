package com.gmail.kshev.volod;

public class Rectangle_P {
	
	private int width;
	private int height;
	
	
	
	
	Rectangle_P () {
	this.width = 17;
	this.height = 18;
	}
	
	Rectangle_P (int width, int height) {
		this.width = width;
		this.height = height;
		
	}

	@Override
	public String toString() {
		return "Периметр прямокутника = " + 2*(width+height) + " см";
	}
	
	

}

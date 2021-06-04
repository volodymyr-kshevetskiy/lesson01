package com.gmail.kshev.volod;

public class Rectangle {
	
	private int width;
	private int height;
	
	
	
	
	Rectangle () {
	this.width = 17;
	this.height = 18;
	}
	
	Rectangle (int width, int height) {
		this.width = width;
		this.height = height;
		
	}

	@Override
	public String toString() {
		return "Площа прямокутника = " + width*height + "см2";
	}
	
	
	
	

}

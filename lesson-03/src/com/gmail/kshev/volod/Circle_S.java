package com.gmail.kshev.volod;

public class Circle_S {
	
	
	private int diametr;
	
	
	
	
	Circle_S () {
	
	this.diametr = 44;
	}
	
	Circle_S (int diametr) {
		
		this.diametr = diametr;
		
		

}

	@Override
	public String toString() {
		return "Площа кола = " + (3.14 * ((diametr/2)*(diametr/2)) + " см2");
	}}


package com.gmail.kshev.volod;

public class Application {
	public static void main(String[] args) {
		
		Rectangle square1 = new Rectangle ();
		Rectangle square2 = new Rectangle (23, 34);
		
		Rectangle_P p1 = new Rectangle_P ();
		Rectangle_P p2 = new Rectangle_P (32, 15);
		
		Circle_S s1 = new Circle_S ();
		Circle_S s2 = new Circle_S (20);
		
		Circle_L l1 = new Circle_L ();
		Circle_L l2 = new Circle_L (5); 
		
		
		
		System.out.println(square1);
		System.out.println(p2);
		System.out.println(s1);
		System.out.println(l2);
		
	}


}

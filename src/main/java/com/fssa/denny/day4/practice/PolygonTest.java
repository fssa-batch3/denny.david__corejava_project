package com.fssa.denny.day4.practice;

public class PolygonTest {
	public static void main(String[] args) {
		Polygon rec;
		try {
			
			rec = new Rectangle (10, 5);
			System.out.println(rec.calculateArea());
			System.out.println(rec.circumference());
			
			
			
			RightAngledTriangle ratt = new RightAngledTriangle(20.0, 10.0);
			System.out.println(ratt.calculateArea());
			System.out.println(ratt.circumference());
			
			
;			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
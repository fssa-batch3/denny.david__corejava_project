package com.fssa.denny.day4.practice;

public abstract class Polygon {
	protected int numberOfSides;
	
	public Polygon() {
		
		
	}
	
	
	
	public Polygon (int numberOfSides) throws Exception {
		if (numberOfSides < 3) {
			throw new Exception("Invalid number of sides to create a polygon ");
		}
		else {
			this.numberOfSides = numberOfSides;
		}
	}
	
	
	public abstract double calculateArea();
	
	public abstract double circumference();
}
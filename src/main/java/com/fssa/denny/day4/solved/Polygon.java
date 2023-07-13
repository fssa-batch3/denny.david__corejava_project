package com.fssa.denny.day4.solved;

public abstract class Polygon {
	protected int numberOfSides;
	
	public Polygon (int numberOfSides) throws Exception {
		if (numberOfSides < 3) {
			throw new Exception("Invalid number of sides to create a polygon ");
		}
		else {
			this.numberOfSides = numberOfSides;
		}
	}
	
	
	public abstract double calculateArea();
}
public class Square extends Rectangle {
	
	public Square(double side_length) throws Exception {
		super(side_length, side_length);
	}

}
public class AnotherClass extends Square {  // This line will give compiler error

}
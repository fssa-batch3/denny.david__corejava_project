package com.fssa.denny.day10.misc;



class Divider {
	public static int divisor(int a, int b) throws IllegalArgumentException{
		if(b==0) {
			throw new IllegalArgumentException("Divisor should not be zero");
		}
		int c = a/b;
		return c;
	}
}
public class ExceptionHandling {
public static void main(String[] args) {
	Divider.divisor(5,0);
}
}

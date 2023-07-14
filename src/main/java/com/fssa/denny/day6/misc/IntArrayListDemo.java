package com.fssa.denny.day6.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class IntArrayListDemo {
	public static void main(String[] args) {
		String[] arr = {"3","denny","5","6"};
//		List<Integer> arrInt = new ArrayList<>(Arrays.asList(arr));
		List<String> arrInt = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(arrInt);
		arrInt.remove(String.valueOf(3));
		System.out.println(arrInt);
		
		
	}
}
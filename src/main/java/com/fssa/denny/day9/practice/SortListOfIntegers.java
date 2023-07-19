package com.fssa.denny.day9.practice;
import java.util.*;

public class SortListOfIntegers {
   public static void main(String[] args) {
	 ArrayList<Integer> Elements = new ArrayList<Integer>();
	 Elements.add(8);
	 Elements.add(9);
	 Elements.add(45);
	 Elements.add(12);
	 Elements.add(1);
	 
	 Collections.sort(Elements);
	 System.out.println(Elements);
   }
   
   
}

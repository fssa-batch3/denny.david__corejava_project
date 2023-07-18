package com.fssa.denny.day7.practice;

import java.util.*;

public class RemoveTheDuplicates {
   public static void main(String[] args) {
	   ArrayList<Integer> RemoveDuplicate = new ArrayList<Integer>();
	   RemoveDuplicate.add(65);
	   RemoveDuplicate.add(100);
	   RemoveDuplicate.add(65);
	   RemoveDuplicate.add(265);
	   RemoveDuplicate.add(75);
	   
	   Set<Integer> RemoveTheDuplicate = new HashSet<Integer>(RemoveDuplicate);
	   System.out.print(RemoveTheDuplicate);
   }
}

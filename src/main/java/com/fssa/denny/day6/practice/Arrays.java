package com.fssa.denny.day6.practice;


import java.util.ArrayList;


public class Arrays{
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Chennai");
		cityList.add("Mumbai");
		
	    // remove duplicates from the list
		for(int i=0; i<cityList.size()-1; i++) {
		  for(int j=0; j<cityList.size()-1; j++) {
			if(cityList.get(i).equals(cityList.get(j))) {
				// find
				   cityList.remove(j);
				   continue;
				    	
	          }	
			}
			
		   
		    
		}
        	System.out.println(cityList);
//		for(String str: cityList) {
//			cityList.remove(3);
//			// System.out.println(cityList);
//		}
		
		
		}
		
	}
	
 
 

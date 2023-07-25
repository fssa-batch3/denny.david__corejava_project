package com.fssa.denny.day7.practice;

import java.time.LocalDate;

class Task {
	private int id;
	private String name;
	private LocalDate deadline;
	
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
	  this.id = id;
	}
	public String getname1() {
		return name;
	}
	public void setname1(String name) {
	  this.name = name;
	}
	
	public LocalDate getdeadline1() {
		return deadline;
	}
	public void setdeadline1(LocalDate deadline) {
		this.deadline = deadline;
	}
	
	public boolean compare(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		return false;
	}
	
      
}
public class RemoveDuplicateTask {
   public static void main(String[] args) {
	Task details = new Task();
	details.setid(2);
	details.setname1("Denny");
	details.setname1("Denny");
	details.setdeadline1(LocalDate.of(2017, 11, 10));
	

}
}

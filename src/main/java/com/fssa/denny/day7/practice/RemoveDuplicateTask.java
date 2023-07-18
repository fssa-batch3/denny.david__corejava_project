package com.fssa.denny.day7.practice;

import java.util.*;
import java.time.*;

class Task {
	private int id;
	private String name;
	private LocalDate deadline;
	
	
	public int getid(int id) {
		return getid(id);
	}
	public void setid(int id) {
	  this.setid(id);
	}
	public String getname1(String name) {
		return getname1(name);
	}
	public void setname1(String name) {
	  this.setname1(name);
	}
	
	public LocalDate getdeadline1() {
		return deadline;
	}
	public void setdeadline1(Localdate deadline) {
		this.deadline = deadline;
	}
	@Override 
	public boolean check(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
	}
	
      
}
public class RemoveDuplicateTask {
   public static void main(String[] args) {
	Task details = new Task();
	details.setid(2);
	details.setname1("Denny");
	details.setname1("Denny");
	details.setdeadline(LocalDate.of(2017, 11, 10));

}
}

package com.fssa.denny.day9.practice;

import java.util.*;
import java.time.*;
import java.util.ArrayList;



public class Practice2 {

	public static void main(String[] args) {
		List<Task> arr = new ArrayList<Task>();
		arr.add(new Task(3, "Coding", LocalDate.of(2022, 10, 22)));
		arr.add(new Task(5, "Product Design", LocalDate.of(2022, 10, 01)));
		arr.add(new Task(1, "Software Design", LocalDate.of(2022, 10, 07)));
		arr.add(new Task(3, "Coding", LocalDate.of(2022, 10, 22)));

		Collections.sort(arr);
		System.out.println(arr);
	}

}

class Task implements Comparable<Task> {
	

	private int id;
	private String name;
	private LocalDate deadline;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	Task(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}

	@Override
	public int compareTo(Task o) {
		if (this.deadline.isEqual(o.getDeadline())) {
			return 0;
		} else {
			if (this.deadline.isBefore(o.getDeadline())) {
				return -1;
			} else {
				return 1;
			}
		}
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", deadline=" + deadline + "]";
	}

}
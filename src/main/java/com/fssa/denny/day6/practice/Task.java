package com.fssa.denny.day6.practice;

import java.util.ArrayList;

public class Task {
	public static void main(String[] args) {
		// Create an ArrayList to store task details
		Task1 task = new Task1();
		ArrayList<Task1> tasks = new ArrayList<>();

		// Add tasks to the list
		Task1 task1 = new Task1();
		task1.taskName = "Task 1";
		task1.priority = 1;
		tasks.add(task1);

		Task1 task2 = new Task1();
		task2.taskName = "Task 2";
		task2.priority = 2;
		tasks.add(task2);

		Task1 task3 = new Task1();
		task3.taskName = "Task 3";
		task3.priority = 3;
		tasks.add(task3);

		// Search for a task by name
		boolean found = Task1.findTaskByName("Task 2", tasks);

		// Print the result
		if (found) {
			System.out.println("Task found: " + "Task 2");
		} else {
			System.out.println("Task not found: " + "Task 2");
		}
	}
}

class Task1 {

	String taskName;
	int priority;

	public static boolean  findTaskByName(String name, ArrayList<Task1> tasks) {
		for (Task1 e : tasks) {
			if (e.taskName.equals(name)) {
				return true;
			}
		}
		return false;
	}
}

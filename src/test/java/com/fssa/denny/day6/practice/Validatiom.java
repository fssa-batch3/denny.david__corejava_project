package com.fssa.denny.day6.practice;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Validatiom {

	@Test
	public static boolean validate(Task task) throws IllegalArgumentException {
		// Check whether the object is null or not
		if (task == null) {
			throw new IllegalArgumentException("Argument is null");
		}
		validateTaskName(task.taskName);
		validatePriority(task.priority);
		return true;
	}

	// validate the TaskName if it's empty or null throw exception or return true
	@Test
	public static boolean validateTaskName(String taskname) throws IllegalArgumentException {
		if (taskname == null || "".equals(taskname.trim()) || taskname.length() < 3) {
			throw new IllegalArgumentException("Task name cannot be null or empty");
		}
		return true;
	}

	// Validate priority
	@Test
	public static boolean validatePriority(int priority) throws IllegalArgumentException {
		if (priority < 0 || priority > 4000) {
			throw new IllegalArgumentException("Task priority is not valid");
		}
		return true;
	}

}

package com.fssa.denny.day6.practice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.Test;

public class TestTaskName {

	@Test
	public void TestName() {
		try {
			Assertions.assertTrue(ValidateTasks.validateName("Learn java"));
		} 
		catch (IllegalArgumentException e) {
			Assertions.assertEquals("Task name cannot be null or empty", e.getMessage());
		}
	}
	@Test
	public void TestCategory() {
		try {
			Assertions.assertTrue(ValidateTasks.validatecategory(7));
		}
		catch (IllegalArgumentException e) {
			Assertions.assertEquals("Task priority is not valid", e.getMessage());
		}
	}

}

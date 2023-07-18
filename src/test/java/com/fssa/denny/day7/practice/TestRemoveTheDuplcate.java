package com.fssa.denny.day7.practice;

import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;
import com.fssa.denny.day7.practice.*;

public class TestRemoveTheDuplcate {
    @Test 
    public void testid() {
    	try {
    	Assertions.assertTrue(validatetest.validatetestid("08"));
    	}
    	catch (IllegalArgumentException e){
    		Assertions.assertEquals("Your id should not be null",e.getMessage());
    	}
    }
    @Test
    public void testName() {
    	try {
    	Assertions.assertTrue(validatetest.validatetestNmae("Barath"));
    	}
    	catch (IllegalArgumentException e){
    		Assertions.assertEquals("Your Name should not be null",e.getMessage());
    	}
    }
    @Test
     public void testDeadline() {
    		try {
    			Assertions.assertTrue(validateTest.validatedeadline("2023-12-03"));
    		}
    		catch (IllegalArgumentException e) {
    			Assertions.assertEquals("You should not give your date as null",e.getMessage());
    		}
    	}
    }




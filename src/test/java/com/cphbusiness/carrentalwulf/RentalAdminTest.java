/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cphbusiness.carrentalwulf;

import java.io.FileNotFoundException;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import static org.junit.Assert.*;
	

/**
 *
 * @author thor
 */
public class RentalAdminTest {
	RentalAdmin rentalAdmin;
	CarFactory myCarFactory;
	String filename;
	HashMap<String, Car> myCars;
	

	
	public RentalAdminTest() {
	}
	
	@Before
	public void setUp() {
		rentalAdmin = new RentalAdmin("kurt");
		myCarFactory = new CarFactory();
		
		filename = "data/ncars4.csv";
//		filename = "/var/lib/jenkins/workspace/CarRentalWulf/src/main/java/com/cphbusiness/carrentalwulf/ncars4.csv";

	}

	@Test
	public void testSomeMethod() throws FileNotFoundException {
		HashMap<String, Car> foundCars = rentalAdmin.createCarsFromFile(filename);
		int expected = 10;
		int found = foundCars.size();
		assertTrue(found==expected);
	}

	/**
	 * Test of createCarsFromFile method, of class RentalAdmin.
	 */
	@Test
	public void testCreateCarsFromFile() throws Exception {
		System.out.println("createCarsFromFile");
		String filename = "";
		RentalAdmin instance = null;
		HashMap<String, Car> expResult = null;
		HashMap<String, Car> result = instance.createCarsFromFile(filename);
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}
	
}

package com.cphbusiness.carrentalwulf;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class RentalAdmin extends Employee{

	public RentalAdmin(String name) {
		super(name);
	}

	public HashMap<String, Car> createCarsFromFile(String filename) throws FileNotFoundException {
		CarFactory myCarFactory = new CarFactory();
		HashMap<String, Car> myImpCars = myCarFactory.createCarsFromFile(filename);
		for (Map.Entry<String, Car> entry : myImpCars.entrySet()) {
			String key = entry.getKey();
			Car value = entry.getValue();
			System.out.println(value);
		}
		boolean retVal = true;
		return myImpCars;
	}


	
}

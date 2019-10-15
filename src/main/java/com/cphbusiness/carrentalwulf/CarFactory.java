package com.cphbusiness.carrentalwulf;

import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import Util.IdFactory;


public class CarFactory {
	public HashMap<String, Car> myCars;

	public CarFactory() {
		myCars = new HashMap<>();
	}

	public HashMap<String, Car> createCarsFromFile(String filename) throws FileNotFoundException {
		// public Car(String make, String model, String type, int mpg, int weight)
		// Audi;A4 1.8T 4dr;4;170;22;31;3252;104
		

		File fh = new File(filename);
		Scanner myScanner = new Scanner(fh);
		while(myScanner.hasNextLine()){
			String line =  myScanner.nextLine();
			String[] lineArr = line.split(";");
			String id = IdFactory.getRegNr();
			String make = lineArr[0];
			String[] makeStuff = lineArr[1].split(" ");
			String model = lineArr[0];
			String type = makeStuff[0];
			int mpg = Integer.parseInt(lineArr[4]);
			int weight = Integer.parseInt(lineArr[6]);
			Car c = new Car(make,model,type,mpg,weight);
			myCars.put(c.getRegNr(),c);
			System.out.println("CAR" + c);
		}
		return myCars;
	}
	
}

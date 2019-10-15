package com.cphbusiness.carrentalwulf;
import Util.IdFactory;
public class Car {
	
	private String regNr;
	private String make;
	private String model;
	private String type;
	private int mpg;
	private int weight;
	private double kmPrL;
	
	public Car(String make, String model, String type, int mpg, int weight) {
		this.regNr = IdFactory.getRegNr();
		this.make = make;
		this.model = model;
		this.model = type;
		this.weight = weight;
		this.kmPrL = 0;
	}
	
	public String getRegNr() {
		return regNr;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	public int getmpg() {
		return mpg;
	}
	
	@Override
	public String toString() {
		String mString ="";
		mString+= "REG: " +  this.regNr + " BIL: " + this.make + " KMPRL: " + getmpg();
		System.out.println(mString);
		return mString;
		
	}
	
	
	
}

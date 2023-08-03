package com.lumen.newset;

public abstract  class  Vehicle {
	String model;
	String brand;
	double price;
	public Vehicle(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	abstract void getMileage();
	abstract void showType();
	
	
	
	
	void printDetails() {
		System.out.println("Model name :"+model);
		System.out.println("brand name: "+brand);
		System.out.println("price"+price);
	}
	
}


package com.lumen.newset;

public class Car extends Vehicle {
	public Car(String model, String brand, double price) {
		super(model, brand, price);
	}

	@Override
	void getMileage() {
		System.out.println("It covers good mileage");

	}

	@Override
	void showType() {
		System.out.println(model+"car"+"has this milege");
	}
	void showAcessories(String []carAcess) {
		for(String item:carAcess) {
			System.out.println(item);
		}
	
	
			
		}
				
	}






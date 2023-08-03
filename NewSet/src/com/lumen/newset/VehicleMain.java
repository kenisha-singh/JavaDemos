package com.lumen.newset;

public class VehicleMain {

	public static void main(String[] args) {
		  
		Vehicle vehicle=new Bike("sports","Ktm",121213);
		vehicle.printDetails();
		vehicle.getMileage();
		vehicle.showType();
		
		Bike bike=(Bike) vehicle;
		
		bike.showType();
		
		vehicle=new Car("XUV","Mahi",10000);
		
		vehicle.printDetails();
		
		Car car=(Car) vehicle;
		
		car.getMileage();
		car.showType();
		car.showAcessories(new String[]{"cover","super"});
		
	}

}


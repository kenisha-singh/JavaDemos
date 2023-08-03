package com.lumen.quest1;

public class ScientificCalculator extends BasicCalculator implements Scientific {
	

	public void square (int x) {
	
		System.out.println("square"+Math.pow(x, 2));
		
	}

	public void cube(int x) {
System.out.println("cube"+Math.pow(x, 3));		
	}

	@Override
	public void sqtr(int x) {
		// TODO Auto-generated method stub
		
	}

}


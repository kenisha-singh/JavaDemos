package com.lumen.basic;

public class Prime {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int number =33;
			for(int i=2;i<number;i++){
				if(number%i==0) {
					System.out.println("Entered Number is not prime");
					return;
				}
			}
			System.out.println("Entered Number is prime");
		}

	}



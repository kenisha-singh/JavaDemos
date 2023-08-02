package com.lumen.basic;

public class EvenNumbers {

	public static void main(String[] args) {
		int number = 20;
		System.out.println("List of even numbers from  0 to " +number+ ":"); 
        for(int i = 0;i<=number;i++) {
        	if(i%2==0) {
        		System.out.println(i + " ");
        	}
        }
	}

}

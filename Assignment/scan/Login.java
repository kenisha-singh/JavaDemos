package com.lumen.scan;

import java.util.Scanner;

public class Login {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String[] username= {"Kenisha","Kashish","Ken","Kash","lok"};
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter username:");
			String name=sc.next();
			boolean flag=true;
			for(String i:username) {
				if(i.equals(name)) {
					flag=false;
					System.out.println("You are logged in successfully");
				}
				
			}
			if(flag)
				System.out.println("Invalid Username");

		}
		

	}



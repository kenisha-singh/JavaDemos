package com.lumen.basic;
import java.util.Scanner;
public class Login {
	

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String[] userNames = {"Ken","kenisha","Hari"};
			Scanner scanner =new Scanner(System.in);
			System.out.println("enter ur name");
			String name=scanner.next();
			int flag=0;
			for(String travName:userNames) {
				if(travName.equalsIgnoreCase(name)) {
					flag=1;
					System.out.println("you are entered into login page");
					flag=1;
					break;
				}
			}
			
			if(flag==0)System.out.println("ypu are not registered with us");
			
		}

	}




package com.lumen.scan;
import java.util.Scanner;

public class PrimeS {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        for (int i = 1; i <= 20; i++) {
	            boolean isPrime = true;

	            for (int j = 2; j < i; j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime && i != 1) {
	                System.out.println(i);
	            }
	        }

	        scanner.close();
	    }
	}



package com.lumen.basic;

public class CountDuplicates {
	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 4, 5, 5, 5, 6};
	        int count = 0;
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                    break;
	                }
	            }
	        }
	        System.out.println("The number of duplicates in the array is: " + count);
	    }
	}



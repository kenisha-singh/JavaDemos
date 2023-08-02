package com.lumen.basic;

public class Greater {

	public static void main(String[] args) {
		int [] arr = new int[] { 25,30,60,78};
		int max = arr[0];
		for (int i =0; i<arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		
		System.out.println("largest element present  in given array" + max);
		

	}

}

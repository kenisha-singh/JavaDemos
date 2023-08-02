package com.lumen.basic;
import java.util.Arrays;

public class ReverseArray {
	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] original = {90,-9,85,88,4,4,9,98,8,45,41,65};
			int[] reverse =new int[original.length];
			
			for(int i=0;i<original.length;i++) {
				reverse[original.length-i-1]=original[i];
			}
			
			System.out.println(Arrays.toString(reverse));
		}

	}



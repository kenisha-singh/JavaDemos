package com.lumen.basic;

public class SumAvg {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int sum =0;
		  double avg = 0;
		  for( int i =0; i<arr.length;i++) {
			  sum+=arr[i];
		  }
    avg =  (double) sum/arr.length; 
    System.out.println(" The summ of all digits is "+sum);
    System.out.println("the average of digit is"+avg);
    
	}

}
 
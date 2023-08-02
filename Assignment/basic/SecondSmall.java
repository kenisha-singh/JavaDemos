package com.lumen.basic;

public class SecondSmall {

	public static int getSecondSmall(int[] a, int  total) {
		int temp;
		for( int i =0; i< total; i++)
		{
			for (int j = i+1; j<total; j++)
			{
				if(a[i]>a[j])
				{
					
				temp = a[i];
				a[i]= a[j];
				a[j] = temp;
				}
		}
	}
	return a[1];
}
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	System.out.println("Second smallest "+getSecondSmall(a,6));
	
}
 }
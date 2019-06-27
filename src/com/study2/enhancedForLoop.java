package com.study2;

public class enhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Enhanced forLoop; little bit different normal for;
		
		
		int[] bucky= {2,3,4,15,87,35,43};
		
		int sum=0;
		
		for (int x: bucky) {
			
			sum+=x;
			
		
		}
		
		System.out.println("Sum of the array elements is "+sum);
		
	}

}

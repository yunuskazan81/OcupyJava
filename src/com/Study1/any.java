package com.Study1;

import java.util.Random;

public class any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int Index[]= {3,5,18,46,92};
		int sum=0;
		
		
		    System.out.println("Index\tValue");
		
		for (int counter=0; counter<Index.length; counter++) {
			
			System.out.println(counter + "\t"+ Index[counter]);
			
		}

		for (int x=0; x<Index.length; x++) {
			
			
			sum+= Index[x];
		}
		
		System.out.println("\n "
				+ " Sum of the numbers are in array bracket is "+ sum );
		
		
		*/
		
		
		
		Random rand= new Random();
		
		
		int freg[]= new int[9];
		
		
		for (int use=1; use<100; use ++) {
			
			
			++freg[1+rand.nextInt(8)];
			
		}
		
		System.out.println("Face\tFrequency");
		
		
		for (int face=1; face<freg.length; face++) {
			
			
			System.out.println(face+ "\t"+ freg[face]);
			
		}
		
		
		
	}

}

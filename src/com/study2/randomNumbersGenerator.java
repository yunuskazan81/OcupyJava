package com.study2;

import java.util.Random;

public class randomNumbersGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random num= new Random();
		
		
		int numbers=0;
		
		for (int counter=1; counter<=10; counter++) {
			
			
			numbers= 1+ num.nextInt(7); // inside pharanthesis; indicates (0,1,2,3,4,5,6,7) numbers. nextInt() --> capture numbers randomly;
				
			System.out.println(numbers+ " ");
								
								// if you put print code out of the for loop; you will only get one random number and each time you will get

								// different number. just try and see. and only phranathesis numbers you will see not another else numbers.so 0-7
								// but we added 1+ before the random, so we will get starting 1 because of this.
			
			
		}
		
		
		
	}

}

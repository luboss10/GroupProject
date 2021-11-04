package com.syntax.class10;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// Create an array on double values using scanner and calculate the sum of all stored elements in that array.
		
		double[] elem;
		double sum = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many elements in the array?");
		elem = new double[scan.nextInt()];
		
		System.out.println("Enter the elements of the array (double)");
		
		for(int i = 0; i < elem.length; i++) {
			elem[i] = scan.nextDouble();
			sum = sum + elem[i]; 
		}
		
		System.out.println("The sum of your array is " + sum);
		scan.close();
	}

}

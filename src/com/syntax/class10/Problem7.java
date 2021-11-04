package com.syntax.class10;

import java.util.Scanner;

public class Problem7 {
	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		
		int number;
		Scanner scan = new Scanner(System.in);
		
		boolean flag = false;
		System.out.println("Please enter a number to check if it's prime:");
		number = scan.nextInt();
		
		if(number <= 1)
			System.out.println("Prime number must be greater than one");
		
		for(int i = 2; i < number; i++) {
			if(number%i != 0) {
				continue;
			} else {
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println(number + " is composite.");
		else
			System.out.println(number + " is prime");
		scan.close();
	}
}

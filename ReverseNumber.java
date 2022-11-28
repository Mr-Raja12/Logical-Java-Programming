package com.bl.logicalprogram;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
	int number;
	System.out.println("Enter a number");
	Scanner userinput=new Scanner(System.in);
	number=userinput.nextInt();
	/**
	 * Uses modulo operator to get the last digit
	 * The digit will be stored in remainder
	 */
	while(number>0)
	{
		int remainder = number % 10;  
		number = number/10; 
		System.out.println("The reverse number is  "+remainder);
	}
  }
}

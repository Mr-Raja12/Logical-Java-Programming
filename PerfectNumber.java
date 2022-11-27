package com.bl.logicalprogram;

public class PerfectNumber {
	public static void main(String[] args) {
		/**
		 * A number whose sum of factors (excluding the number itself) 
		 * is equal to the number is called a perfect number    	
		 */
    int number = 496, sum = 0;
    for (int i = 1; i < number; i++)
    {
        if (number % i == 0)
            sum = sum + i;
    }
    if (sum == number)
        System.out.println (number + " Is a perfect number");
    else
        System.out.println (number + " Is not a perfect number");
    }
	
}


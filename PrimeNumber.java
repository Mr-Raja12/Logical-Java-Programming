package com.bl.logicalprogram;

import java.util.Scanner;

public class PrimeNumber {
    /**
     * Calling the check prime number method
     * Stored the user input value in number variable
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner Scanner = new Scanner(System.in);
        int number = Scanner.nextInt();
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.checkPrimeNumber(number);
    }
     /**
      * Created a method to initialize the number
      * @param number
      */
    public void checkPrimeNumber(int number){
        int count = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.print("Number is prime");
        }
        else{
            System.out.print("Number is not prime");
        }
    }
}



package com.bl.logicalprogram;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner Number = new Scanner(System.in);
        int num = Number.nextInt();
        PrimeNumber primeNo = new PrimeNumber();
        primeNo.checkPrimeNumber(num);
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



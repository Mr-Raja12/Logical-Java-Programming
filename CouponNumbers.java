package com.bl.logicalprogram;
import java.util.Random;
public class CouponNumbers {
	/*
	*Purpose: Given N distinct Coupon Numbers, how many random numbers do you need to generate that distinct coupon number?
	**/
	public static void main(String[] args) {
        int winnerCouponNo = 123456;
        int couponNumber = 0;
        int couponCount = 0;
     
        while (couponNumber != winnerCouponNo){
            couponNumber = generateCoupon();
            couponCount++;
            System.out.println(couponNumber);
        }
        System.out.println("winner coupon : " + couponNumber);
        System.out.println("No of coupons to match winner:" + couponCount);
    }

    static int generateCoupon(){
        int number = 0;
        Random random = new Random();
        while (number < 100000){
        	number = random.nextInt(999999);
        }
        return number;
    }
}



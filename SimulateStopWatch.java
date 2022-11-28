package com.bl.logicalprogram;
import java.util.Scanner;
public class SimulateStopWatch {
	/**
	 * Started the Stopwatch and End the Stopwatch
	 * Measure the elapsed time between start and end
	 */
	static double start = 0, stop = 0;

    static void startTime(){
        start = System.currentTimeMillis();
        System.out.println("started at: " + start);
    }

    static void stopTime(){
        stop = System.currentTimeMillis();
        System.out.println("stopped at: " + stop);
    }
   /**
    * Printed the elapsed time.
   */
    static void elapsedTime(){
        System.out.println("elapsed time is: " + (stop - start)  / 1000);
    }
    public static void main(String[] args){
        Scanner Time = new Scanner(System.in);
        System.out.println("Enter to start");
        Time.next();
        startTime();
        System.out.println("Enter to stop");
        Time.next();
        stopTime();
        elapsedTime();
    }
}



package day3;

import java.util.Scanner;

public class Loops05 {

    public static void main(String[] args) {

        //Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ).
        // Print sum of all numbers.

        Scanner scann = new Scanner(System.in);


        String secim;
        int sum=0 ;


       do {
           System.out.println("enter a number and for quit enter q");
           secim = scann.nextLine();

           if (!secim.equalsIgnoreCase("q")) {
               int number = Integer.parseInt(secim);
               sum += number;

           }
       } while (!secim.equalsIgnoreCase("q")) ;

        System.out.print("sum of numbers: " + sum);
    }
}

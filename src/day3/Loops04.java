package day3;

import java.util.Scanner;

public class Loops04 {

    public static void main(String[] args) {
      //  Calculate the sum of digits of a number given by user

        Scanner scann = new Scanner(System.in);
        System.out.println("enter a number ");
        int number = scann.nextInt();
        int sum=0;

        while (number>0) {

            int rakam=number%10;
            sum+=rakam;
            number=number/10;
        }
        System.out.println("the sum of digits is: " +sum);



    }
}

package day3;

import java.util.Scanner;

public class Loops03 {

    public static void main(String[] args) {

        //Take 10 integers from keyboard using loop and print their average value on the screen.

        Scanner scann = new Scanner(System.in);
        int number;
        int sum=0;
        for (int i = 0; i < 2; i++) {
            System.out.println(i+1+". number enter");
            number = scann.nextInt();
            sum+=number;
        }
        double avarage= (double) sum/2;
        System.out.println("the avarage is: " + avarage);

    }
}

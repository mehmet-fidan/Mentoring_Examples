package day1;

import java.util.Locale;
import java.util.Scanner;

public class ifelse4 {

    // Write a program to check whether an entered
    // character is lowercase ( a to z ) or uppercase ( A to Z ).
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter");
        String str = scan.nextLine();

        if (Character.isLowerCase(str.charAt(0))) {
            System.out.println("it is a lowercase string");
        } else if (Character.isUpperCase(str.charAt(0))) {
            System.out.println("it is  a uppercase string");
        } else {
            System.out.println("it is not a letter");
        }

    }
}

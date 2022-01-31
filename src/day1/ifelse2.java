package day1;

import java.util.Scanner;

public class ifelse2 {

    public static void main(String[] args) {

        // take a number that is between 0 and 100 from the user,
        // if the number is between 0 and 10 write the following sentences "es ist eine einstellige Zahl"
        //if the number is between 10 and 100 write the following statement "es ist eine zweistellige Zahl"
        // if the number is 100 write the following statement "es ist ein hundert and eine dreistellige Zahl"

        Scanner scan = new Scanner(System.in);
        System.out.println("geben Sie eine Zahl ein");
        int dieZahl =scan.nextInt();


      //  int dieZahl = (int) (Math.random()*101);
        System.out.println("die Zahl ist= " +dieZahl);
       if (dieZahl<10) {
           System.out.println("es ist eine einstellige Zahl");
       } else if (dieZahl<100) {
           System.out.println("es ist eine zweistellige Zahl");
       } else {
           System.out.println("es ist einhundert and eine dreistellige Zahl");
       }

    }
}

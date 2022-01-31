package day1;

public class ifelse1 {

    public static void main(String[] args) {

        int number =(int) (Math.random()*10);
        // int number = 5;
        System.out.println(number);
        if (number>0) {
            System.out.println("Erstes Feld funktioniert");
        }
        if (number>3) {
            System.out.println("Zweites Feld funktioniert");
        }
        if (number>7) {
            System.out.println("Drittes Feld funktioniert");
        }

        if (number<3) {
            System.out.println("erstes Feld funktioniert");
        } else if (number<6) {
            System.out.println("zweites Feld funktioniert");
        } else if (number<9) {
            System.out.println("drittes Feld funktioniert");
        } else {
            System.out.println("keines dieser Felder funktioniert");
        }

    }
}

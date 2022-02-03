package day3;

public class Loops02 {

    public static void main(String[] args) {

        //Loopun icine continue koydugumuzda. if sartindaki durum disinda calisir .
        // program if sartinda islem yapmaz.
         for (int i = 0; i <5; i++) {
             for (int j = 0; j <6 ; j++) {
                 if (i==j) {
                     continue;
                 }
                 System.out.println(i + ", "+j+" ");
             }
        }
        //Loopun icine break koydugumuzda. if sarti saglaninca program looptan cıkar.
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <6 ; j++) {
                if (i==j) {
                    break;
                }
                System.out.println(i + ", "+j+" ");
            }
        }

    }
}

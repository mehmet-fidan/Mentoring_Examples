package day3;

import java.util.ArrayList;
import java.util.List;

public class Loops01 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList(List.of(1,2,3,4,5));

        for (int i = 0; i < list.size(); i=i+2) {
            System.out.print(i+", ");
        }
        System.out.println("------");

        for (Integer eleman : list) {
            System.out.print(eleman+", ");
        }
        System.out.println("------");

        int count =0;
        while(count<0) {
            System.out.print(list.get(count));
            count++;
        }
        System.out.println("-------");

        do {
            System.out.println(count);
            count++;
        } while(count<1);

    }
}

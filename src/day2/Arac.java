package day2;

import java.util.ArrayList;

public class Arac {

    String isim;
    int yolcuKapasitesi;
    ArrayList<Insan> yolcular = new ArrayList<>();
    static int yolcuSayisi;


    public Arac(String isim, int yolcuKapasitesi) {
        this.isim = isim;
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    public void aracBin(Insan yolcu) {

        if (yolcuKapasitesi > yolcuSayisi) {
            yolcular.add(yolcu);
            yolcuSayisi++;
            System.out.println(yolcu.isim + " bindi");
        } else {
            System.out.println("yerimiz kalmadi");
        }
    }

    public void aracIn(Insan yolcu) {
        if (yolcular.contains(yolcu)) {
            yolcular.remove(yolcu);
            yolcuSayisi--;
            System.out.println(yolcu.isim + " indi");
        } else {
            System.out.println(yolcu.isim + " Bu isimde bir yolcu yok");
        }

    }

    public void yolcuListesi() {
        System.out.print("Yolcu Listesi: ");
        for (Insan yolcu : yolcular) {
            System.out.print(yolcu + ", ");
        }

    }

    @Override
    public String toString() {
        return "isim='" + isim + '\'' +
                ", yolcuKapasitesi=" + yolcuKapasitesi +
                ", yolcular=" + yolcular +
                '}';
    }
}

package day2;

public class Main {

    public static void main(String[] args) {


        Arac a1 = new Arac("Minibus", 3);
        Insan i1 = new Insan("Ali");
        Insan i2 = new Insan("Deli");
        Insan i3 = new Insan("Veli");
        Insan i4 = new Insan("Haki");
        Insan i5 = new Insan("Baki");

        a1.aracBin(i1);
        a1.aracBin(i2);
        a1.aracBin(i3);
        a1.aracBin(i4);
        a1.aracIn(i2);
        a1.aracBin(i5);
        a1.yolcuListesi();

    }
}

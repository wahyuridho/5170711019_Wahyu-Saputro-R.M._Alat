package pbo10;

import java.util.Scanner;

public class Alat {

    protected double hargaBeli(String kata) {
        Scanner get = new Scanner(System.in);
        double angka;
        System.out.print("Input " + kata + " : Rp.");
        angka = get.nextDouble();
        return angka;
    }

    protected String Merk(String kata) {
        String text;
        Scanner get = new Scanner(System.in);
        System.out.print("Input " + kata + " : ");
        text = get.next();
        return text;
    }

}

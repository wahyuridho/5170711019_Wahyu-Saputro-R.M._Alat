package pbo10;

import java.util.Scanner;

public class AlatMandi extends Alat {

    public String wujud(String kata) {
        String text;
        Scanner get = new Scanner(System.in);
        System.out.print("Input " + kata + " : ");
        text = get.next();
        return text;
    }

    public String warna(String kata) {
        String text;
        Scanner get = new Scanner(System.in);
        System.out.print("Input " + kata + " : ");
        text = get.next();
        return text;
    }
}

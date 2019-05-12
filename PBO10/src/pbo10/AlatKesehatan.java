package pbo10;

import java.util.Scanner;

public class AlatKesehatan extends Alat{
    public String jenis(String kata) {
        String text;
        Scanner get = new Scanner(System.in);
        System.out.print("Input " + kata + " : ");
        text = get.next();
        return text;
    }
    public String manfaat(String kata) {
        String text;
        Scanner get = new Scanner(System.in);
        System.out.print("Input " + kata + " : ");
        text = get.next();
        return text;
    }

}

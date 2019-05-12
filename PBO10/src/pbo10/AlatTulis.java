package pbo10;

import java.util.Scanner;

public class AlatTulis extends Alat {

    public String fungsi(String kata) {
        String text;
        Scanner get = new Scanner(System.in);
        System.out.print("Input " + kata + " : ");
        text = get.next();
        return text;
    }

    public int dimensi() {
        Scanner get = new Scanner(System.in);
        int dimention = 0,panjang,lebar;
        System.out.print("Input P & L(cm): ");
        panjang = get.nextInt();
        lebar = get.nextInt();
        dimention = panjang*lebar;
        System.out.println("Dimensi Barang : "+dimention+" cm^2");
        return dimention;
    }

}

package pbo10;

import java.util.Scanner;

public class PBO10 {

    public static void main(String[] args) {
        AlatMandi in = new AlatMandi();
        AlatTulis gin = new AlatTulis();
        AlatKesehatan gets = new AlatKesehatan();
        int pilih, jmlb;
        double harga[] = new double[100], dimensi[] = new double[100];
        String merk[] = new String[100], wujud[] = new String[100];
        String warna[] = new String[100], fungsi[] = new String[100];
        String jenis[] = new String[100], manfaat[] = new String[100];
        Scanner get = new Scanner(System.in);
        System.out.println(" = = = Menu = = =");
        System.out.println(" 1. Alat Mandi ");
        System.out.println(" 2. Alat Tulis ");
        System.out.println(" 3. Alat Kesehatan ");
        pilih = inputAngka(" Jenis Alat");
        if (pilih == 1) {
            jmlb = inputAngka("Jumlah Barang");
            for (int i = 0; i < jmlb; i++) {
                System.out.println("Barang ke-" + (i + 1));
                harga[i] = in.hargaBeli("Harga");
                merk[i] = in.Merk("Merk");
                wujud[i] = in.warna("Warna");
                warna[i] = in.warna("Warna");
            }
            for (int i = 0; i < jmlb; i++) {
                System.out.println("------------------------------");
                System.out.println(" Harga : " + harga[i]);
                System.out.println(" Merk : " + merk[i]);
                System.out.println(" Wujud : " + wujud[i]);
                System.out.println(" Warna : " + warna[i]);
            }
        } else if (pilih == 2) {
            jmlb = inputAngka("Jumlah Barang");
            for (int i = 0; i < jmlb; i++) {
                System.out.println("Barang ke-" + (i + 1));
                harga[i] = gin.hargaBeli("Harga");
                merk[i] = gin.Merk("Merk");
                fungsi[i] = gin.fungsi("Fungsi");
                dimensi[i] = gin.dimensi();
            }
            for (int i = 0; i < jmlb; i++) {
                System.out.println("------------------------------");
                System.out.println(" Harga : " + harga[i]);
                System.out.println(" Merk : " + merk[i]);
                System.out.println(" Fungsi : " + fungsi[i]);
                System.out.println(" Dimensi : " + dimensi[i] + "cm^2");
            }
        } else if (pilih == 3) {
            jmlb = inputAngka("Jumlah Barang");
            for (int i = 0; i < jmlb; i++) {
                System.out.println("Barang ke-" + (i + 1));
                harga[i] = gets.hargaBeli("Harga");
                merk[i] = gets.Merk("Merk");
                jenis[i] = gets.jenis("Jenis");
                manfaat[i] = gets.manfaat("Manfaat");
            }
            for (int i = 0; i < jmlb; i++) {
                System.out.println("------------------------------");
                System.out.println(" Harga : " + harga[i]);
                System.out.println(" Merk : " + merk[i]);
                System.out.println(" Jenis : " + jenis[i]);
                System.out.println(" Manfaat : " + manfaat[i]);
            }
        } else {
            System.out.println(" Eror");
        }
    }

    private static int inputAngka(String kata) {
        Scanner get = new Scanner(System.in);
        int angka;
        System.out.print("Input " + kata + " : ");
        angka = get.nextInt();
        return angka;
    }
}

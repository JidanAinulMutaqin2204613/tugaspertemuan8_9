package soal1;

import java.util.Scanner;

/**
 *
 * @author Jidan Ainul Mutaqin
 */
public class Main {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inputan memasukkan ketiga sisi
        System.out.print("Masukkan sisi1: ");
        double side1 = input.nextDouble();
        System.out.print("Masukkan sisi2: ");
        double side2 = input.nextDouble();
        System.out.print("Masukkan sisi3: ");
        double side3 = input.nextDouble();

        // Inputan meminta warna dan apakah segotoga terisi
        System.out.print("Masukkan warna: ");
        String warna = input.next();
        System.out.print("Apakah segitiga terisi (true/false): ");
        boolean terisi = input.nextBoolean();

        // Membuat objek Segitiga
        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setWarna(warna);
        segitiga.setTerisi(terisi);

        // Output
        System.out.println(segitiga.toString());
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Terisi: " + segitiga.isTerisi());
    }
}

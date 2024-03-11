/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1method;

import java.util.Scanner;

public class Soal1method { 
    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan tiga angka
        System.out.print("Masukkan angka pertama: ");
        int angka1 = bilangan.nextInt();
        // Memeriksa apakah angka pertama adalah ribuan
        checkRibuan(angka1);

        System.out.print("Masukkan angka kedua: ");
        int angka2 = bilangan.nextInt();
        // Memeriksa apakah angka kedua adalah ribuan
        checkRibuan(angka2);

        System.out.print("Masukkan angka ketiga: ");
        int angka3 = bilangan.nextInt();
        // Memeriksa apakah angka ketiga adalah ribuan
        checkRibuan(angka3);
    }

    // Method untuk memeriksa apakah suatu angka adalah ribuan
    public static void checkRibuan(int angka) {
        // Memeriksa apakah angka memiliki nilai antara 1000 dan 9999
        if (angka >= 1000 && angka <= 9999) {
            System.out.println(angka + " adalah angka ribuan.");
        } else {
            System.out.println(angka + " bukan angka ribuan.");
        }
    }
}
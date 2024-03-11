/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2method;

import java.util.Scanner;
public class Soal2method {
    public static void main(String[] args){
        Scanner bilangan = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan batas awal
        System.out.print("Masukkan batas awal: ");
        int batasAwal = bilangan.nextInt();
        // Memastikan batas awal >= 1
        while (batasAwal < 1) {
            System.out.println("Batas awal harus lebih besar dari atau sama dengan 1.");
            System.out.print("Masukkan batas awal: ");
            batasAwal = bilangan.nextInt();
        }

        // Meminta pengguna untuk memasukkan batas akhir
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = bilangan.nextInt();
        // Memastikan batas akhir <= 100
        while (batasAkhir > 100) {
            System.out.println("Batas akhir harus kurang dari atau sama dengan 100.");
            System.out.print("Masukkan batas akhir: ");
            batasAkhir = bilangan.nextInt();
        }

        // Memeriksa dan mencetak bilangan prima dan komposit dalam rentang tertentu
        System.out.println("Bilangan prima " + batasAwal + " sd " + batasAkhir + " adalah: ");
        cetakBilanganPrima(batasAwal, batasAkhir);

        System.out.println("\nBilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah: ");
        cetakBilanganKomposit(batasAwal, batasAkhir);
    }

    // Method untuk mencetak bilangan prima dalam rentang tertentu
    public static void cetakBilanganPrima(int batasAwal, int batasAkhir) {
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method untuk mencetak bilangan komposit dalam rentang tertentu
    public static void cetakBilanganKomposit(int batasAwal, int batasAkhir) {
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (!isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method untuk memeriksa apakah suatu angka adalah bilangan prima
    public static boolean isPrima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}

            

    
    
    

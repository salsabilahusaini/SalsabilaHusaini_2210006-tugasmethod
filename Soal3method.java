/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3method;

import java.util.Scanner;
public class Soal3method {
    public static void main(String[] args) {

        Scanner bilangan = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan nilai N
        System.out.print("Masukkan nilai N (1-1000): ");
        int N = bilangan.nextInt();
        
        // Memastikan bahwa nilai N berada dalam rentang yang valid
        while (N < 1 || N > 1000) {
            System.out.println("N harus berada dalam rentang antara 1 dan 1000.");
            System.out.print("Masukkan nilai N (1-1000): ");
            N = bilangan.nextInt();
        }

        // Memanggil method cetakPolaBintang dengan nilai N sebagai parameter
        cetakPola(N);
    }

    // Method untuk mencetak pola bintang sesuai dengan nilai N
    public static void cetakPola(int N) {
        for (int i = 1; i <= N; i++) {
            // Mencetak i bintang pada setiap baris
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Pindah ke baris berikutnya setelah selesai mencetak bintang
            System.out.println();
        }
    }
}


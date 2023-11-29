/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas6;

import java.util.Scanner;

/**
 *
 * @author dzikr
 */
public class TabelPerkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan ukuran tabel perkalian (nxn) dengan n<=10");
        System.out.print("Nilai n : ");
        int n = input.nextInt();

        // TODO code application logic here
        if (n > 10) {
            System.out.println("Nilai n tidak boleh lebih dari 10");
        } else {
            // Membuat tabel perkalian dengan ukuran n x n 

            System.out.println("Tabel perkalian ukuran " + n + " x " + n + ":");

            //Baris Horizontal angka perkalian 
            System.out.print("     ");
            for (int a = 0; a < n; a++) {
                System.out.printf("%5d", a+1);
            }
            System.out.println();
            //Kolom Vertical angka perkalian dan baris hasil
            for (int b = 0; b < n; b++) {
                System.out.printf("%5d", b+1);
                for (int c = 0; c < n; c++) {
                    System.out.printf("%5d", (b+1) * (c+1));
                }
                System.out.println();
            }
        }
    }
}

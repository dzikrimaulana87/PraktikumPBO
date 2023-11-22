/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6;

import java.util.Scanner;

/**
 *
 * @author dzikr
 */
public class WhileDoLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1. Bilangan ganjil saja");
        System.out.println("2. Bilangan genap saja");

        System.out.print("Masukkan pilihan:");
        int pilihan = input.nextInt();

        System.out.print("Masukkan nilai awal: ");
        int mulai = input.nextInt();
        System.out.print("Masukkan nilai akhir: ");
        int akhir = input.nextInt();
        // TODO code application logic here
        int i = mulai;
        while (i <= akhir) {
            if (pilihan == 1) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }

            } else {
                if (i % 2 == 0 && i != 0) {
                    System.out.println(i);
                }
            }
            i++;
        }
    }

}

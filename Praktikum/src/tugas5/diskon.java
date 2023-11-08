/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas5;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author dzikr
 */
public class diskon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double diskon;
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat("#,###");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga belanjaan : ");
        float harga = input.nextFloat();

        if (harga < 50000) {
            diskon = 0.05;
        } else {
            diskon = 0.2;
        }

        System.out.print("Besar pembelian: " + df.format(harga)+"\n");
        System.out.print("Besar potongan: " + df.format(harga * diskon)+"\n");
        System.out.print("Besar pembelian: " + df.format(harga - harga * diskon)+"\n");

    }

}

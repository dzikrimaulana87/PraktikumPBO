/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas7;

/**
 *
 * @author dzikr
 */
import java.util.Scanner;

import java.util.Scanner;

public class tokoKelontong {

    public static void main(String[] args) {
        // Mendefinisikan array untuk kode barang, nama barang, dan harga
        try (Scanner scanner = new Scanner(System.in)) {
            String[] kodeBarang = {"a101", "a102", "a103", "a104", "a105", "a106", "a107", "a108", "a109", "a110",
                "a111", "a112", "a113", "a114", "a115", "a116", "a117", "a118", "a119", "a120"};

            String[] namaBarang = {"Gula Pasir", "Beras", "Minyak Goreng", "Sabun Mandi", "Shampoo",
                "Pasta Gigi", "Teh Celup", "Kopi Bubuk", "Susu Kental Manis", "Mie Instan",
                "Sarden Kaleng", "Kacang Tanah", "Sereal", "Biskuit", "Saus Tomat",
                "Mie Telur", "Tepung Terigu", "Garam Beryodium", "Sikat Gigi", "Kembang Gula"};

            double[] hargaBarang = {15000.00, 25000.00, 20000.00, 5000.00, 15000.00,
                10000.00, 12000.00, 18000.00, 12000.00, 3000.00,
                8000.00, 10000.00, 15000.00, 12000.00, 10000.00,
                5000.00, 8000.00, 7000.00, 5000.00, 12000.00};

            // Meminta input dari pengguna
            System.out.print("Masukkan jumlah item barang yang akan dibeli: ");
            int jumlahItem = scanner.nextInt();

            scanner.nextLine(); // Membersihkan newline yang tersisa dari input sebelumnya

            String[] kodeBeli = new String[jumlahItem];
            int[] jumlahBeli = new int[jumlahItem];

            System.out.println("Masukkan detail belanja:");
            for (int i = 0; i < jumlahItem; i++) {
                System.out.print("Item ke-" + (i + 1) + "\nKode Barang: ");
                kodeBeli[i] = scanner.nextLine();

                System.out.print("Jumlah Beli: ");
                jumlahBeli[i] = scanner.nextInt();
                scanner.nextLine(); // Membersihkan newline yang tersisa dari input sebelumnya
            }

            // Menampilkan data belanjaan dan total harga
            System.out.println("\nDetail Belanja:");
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.printf("%-5s%-15s%-25s%-15s%-15s%-15s\n", "No", "Kode Barang", "Nama Barang", "Harga Barang", "Jumlah Beli", "Jumlah Bayar");
            System.out.println("---------------------------------------------------------------------------------------------");

            double totalHarga = 0;
            for (int i = 0; i < jumlahItem; i++) {
                int index = cariIndex(kodeBarang, kodeBeli[i]);
                if (index != -1) {
                    double subtotal = hargaBarang[index] * jumlahBeli[i];
                    System.out.printf("%-5d%-15s%-25sRp %-15.2f%-15dRp %.2f\n", i + 1, kodeBarang[index], namaBarang[index],
                            hargaBarang[index], jumlahBeli[i], subtotal);

                    totalHarga += subtotal;
                } else {
                    System.out.println("Item dengan kode " + kodeBeli[i] + " tidak ditemukan.");
                }
            }
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.printf("%-60sRp %.2f\n", "Total Harga:", totalHarga);
            System.out.println("---------------------------------------------------------------------------------------------");

        }
    }

    // Method untuk mencari index suatu nilai dalam array
    private static int cariIndex(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i;
            }
        }
        return -1; // Mengembalikan -1 jika tidak ditemukan
    }
}

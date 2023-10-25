/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author dzikr
 */
public class MatematikaInheritance {
    public static void main(String[] args) {
        //karena Matematika2 sudah memiliki semua elemen Matematika, cukup panggil dari Matematika2
        Matematika2 matematika2 = new Matematika2();

        // Memanggil method dari Matematika
        int hasilPertambahan = matematika2.pertambahan(20, 10);
        int hasilPengurangan = matematika2.pengurangan(10, 5);
        int hasilPerkalian = matematika2.perkalian(10, 3);
        int hasilmodulus = matematika2.modulus(7,5);
        float hasilPembagian = matematika2.pembagian(21, 2);

        System.out.println("Pertambahan : 20 + 10 = " + hasilPertambahan);
        System.out.println("Pengurangan : 10 - 5 = " + hasilPengurangan);
        System.out.println("Perkalian : 10 * 3 = " + hasilPerkalian);
        System.out.println("Pembagian : 21 / 2 = " + hasilPembagian);
        System.out.println("Modulus : 7%5 = " + hasilmodulus);
    }
}


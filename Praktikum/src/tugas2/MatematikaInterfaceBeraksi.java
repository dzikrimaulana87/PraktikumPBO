/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author dzikr
 */
public class MatematikaInterfaceBeraksi {

    public static void main(String[] args) {

        MatematikaInterfaceClass operasi = new MatematikaInterfaceClass();
        int hasilPertambahan = operasi.pertambahan(20, 10);
        int hasilPengurangan = operasi.pengurangan(10, 5);
        int hasilPerkalian = operasi.perkalian(10, 3);
        int hasilPembagian = operasi.pembagian(21, 2);

        System.out.println("Pertambahan : 20 + 10 = " + hasilPertambahan);
        System.out.println("Pengurangan : 10 - 5 = " + hasilPengurangan);
        System.out.println("Perkalian : 10 * 3 = " + hasilPerkalian);
        //Hasil 10 merupakan permintaan dari module
        System.out.println("Pembagian : 21 / 2 = " + hasilPembagian);
    }

}

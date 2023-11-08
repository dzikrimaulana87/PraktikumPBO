/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas5;

import java.util.Scanner;

/**
 *
 * @author dzikr
 */
public class nilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("NPM: ");
        String npm = input.nextLine();
        System.out.print("\nNama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("\nNilaiKehadiran: ");
        float nilaiKehadiran = input.nextFloat();
        System.out.print("\nNilaiTugas: ");
        float nilaiTugas = input.nextFloat();
        System.out.print("\nNilai UTS: ");
        float nilaiUts = input.nextFloat();
        System.out.print("\nNilai UAS: ");
        float nilaiUas = input.nextFloat();
        String ket;
        char grade;
        float rerata = (nilaiKehadiran+nilaiTugas+nilaiUts+nilaiUas)/4;

        float nilaiAkhir = 0.1f * nilaiKehadiran + 0.2f * nilaiTugas + 0.3f * nilaiUts + 0.4f * nilaiUas;

        if (nilaiAkhir>100 || nilaiAkhir<0){
            System.out.println("Input salah");
            return;
        }else if (nilaiAkhir > 75) {
            ket = "ISTIMEWA";
            grade = 'A';
        } else if(nilaiAkhir > 65)  {
            ket = "BAIK";
            grade = 'B';

        }else if(nilaiAkhir > 55)  {
            ket = "CUKUP";
            grade = 'C';

        }else if(nilaiAkhir > 45)  {
            ket = "KURANG";
            grade = 'D';

        }else{
            ket = "SANGAT KURANG";
            grade = 'E';
        }

        System.out.println("#####################################");

        System.out.println("NPM MAHASISWA: " + npm);
        System.out.println("Nama MAHASISWA: " + nama);
        System.out.println("Nilai Rata-rata: "+rerata);
        System.out.println("Grade: "+grade);
        System.out.println("Keterangan: "+ket);

    }

}

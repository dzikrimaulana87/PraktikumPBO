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
public class AnakAyam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah;
        System.out.print("Berapa anak ayam dalam kandang? : ");
        jumlah = input.nextInt();
        // TODO code application logic here

        for (int i = jumlah; i >= 1; i--) {

            System.out.println("Anak ayam turunlah " + jumlah);
            jumlah--;
            if (jumlah >= 1) {
                System.out.println("Mati satu tinggallah " + jumlah + "\n");
            } else {
                System.out.println("Mati satu tinggal induknya");

            }
        }
    }

}

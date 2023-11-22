/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas6;

/**
 *
 * @author dzikr
 */
public class GanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumGanjil = 0;
        int sumGenap = 0;
        int nilaiAtas = 20;
        // TODO code application logic here

        System.out.println("Bilangan Genap:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.print(i + " ");
                sumGenap++;
            }
        }

        System.out.println("\n\nBilangan Ganjil:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sumGanjil++;
            }
        }

        System.out.println("\n\nJumlah angka genap = " + sumGenap);
        System.out.println("Jumlah angka ganjil = " + sumGanjil);

    }

}

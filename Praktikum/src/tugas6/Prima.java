/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas6;

/**
 *
 * @author dzikr
 */
public class Prima {

    public static void main(String[] args) {
        int sumPrima = 0;
        int batasAtas = 20;

        System.out.println("Deret bilangan prima:");
        for (int i = 0; i <= batasAtas; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
                sumPrima++;
            }
        }

        System.out.println("\nDeret bilangan bukan prima:");
        for (int i = 0; i <= batasAtas; i++) {
            if (!isPrima(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nJumlah bilangan prima: " + sumPrima);
        System.out.println("Sedangkan jumlah bilangan non-prima: " + (batasAtas+1 - sumPrima));

    }

    // Method untuk mengecek apakah sebuah bilangan adalah bilangan prima
    private static boolean isPrima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}

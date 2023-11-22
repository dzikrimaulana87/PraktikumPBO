/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas6;

/**
 *
 * @author dzikr
 */
public class DescAlfabet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char huruf = 'z';

        System.out.println("Alfabet Descending");
        for (int i = 0; i < 26; i++) {
            System.out.print(huruf + " ");
            huruf--;
        }
        System.out.println();

    }

}

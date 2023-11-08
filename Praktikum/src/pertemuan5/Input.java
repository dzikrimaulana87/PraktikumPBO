/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5;

import java.util.Scanner;

/**
 *
 * @author dzikr
 */
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nama: ");

        String nama = input.nextLine();
        System.out.print("prodi : ");
        String prodi = input.nextLine();
        System.out.print("semester: ");
        int semester = input.nextInt();
        System.out.print("target: ");
        float target = input.nextFloat();

        System.out.println("\n########################################\n");
        System.out.println("Nama: " + nama);
        System.out.println("prodi: " + prodi);
        System.out.println("semester: " + semester);
        System.out.println("target: " + target);
        
        System.out.print("Lanjut s2? (ya/tidak): ");
        String pil = input.nextLine();
        
        if(pil == "ya"){
            System.out.println("Oke Lanjutkan");
        }

    }

}

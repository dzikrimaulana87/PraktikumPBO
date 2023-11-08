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
public class indeksMasaTubuh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float imt, bb, tb;
        String status;
        
        System.out.print("Masukkan berat badan (kg): ");
        bb = input.nextFloat();
        System.out.print("\nMasukkan tinggi badan (m): ");
        tb = input.nextFloat();
        
        imt = bb / (tb * tb);
        
        if(imt > 40 ){
            status = "Sangat gemuk";
        }else if(imt>29.9){
            status = "Gemuk";
        }else if(imt>24.9){
            status = "Berat badan lebih";
        }else if(imt>18.4){
            status = "Berat badan ideal";
        }else{
            status = "Berat badan kurang";
        }
        
        System.out.println("Berdasarkan nilai imt Anda "+imt+" dan status Anda: "+status);
    }

}

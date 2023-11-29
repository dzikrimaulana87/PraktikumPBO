/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan7;
import java.util.Scanner;

/**
 *
 * @author dzikr
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] buku = new String[5];
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan buku pesanan");
        
        for(int i=0; i<5;i++){
            System.out.print("Buku ke"+(i+1)+" : ");
            buku[i] = input.nextLine();
        }
        
        for(String data: buku){
            int i = 0;
            System.out.println("Buku ke-"+(i+1));
            System.out.println(data);
            i++;
        }
        
    }
    
}

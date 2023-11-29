/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author dzikr
 */
public class ArrayMultidimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[][] nama = {
            {"Pak", "BU", "Mbak"},
            {"Joko", "Susi", "Dini"},
            {"Memukul", "Menulis", "Membaca"}
        };
        // TODO code application logic here
        
        for(int i = 0; i<3; i++){
            System.out.println(nama[0][i] + " " +nama[1][i]+ " "+nama[2][i]);
            
        }
    }
    
}

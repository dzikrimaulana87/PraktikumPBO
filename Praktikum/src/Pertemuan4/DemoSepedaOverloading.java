/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author dzikr
 */
public class DemoSepedaOverloading {
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda("Hitam");
        Sepeda sepeda2 = new Sepeda("Putih", 69);
        
        System.out.println("Sepeda 1 Parameter");
        int gir1 = sepeda1.getGir();
        System.out.println("gir: "+gir1);
        System.out.println(sepeda1.warna+"\n");
        
        
        
        System.out.println("Sepeda 2 Parameter");
        int gir2 = sepeda2.getGir();
        System.out.println("gir: "+gir2);
        System.out.println(sepeda2.warna);
        
    }
   
            
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author dzikr
 */
public class DemoCircle {

    public static void main(String[] args) {
        Circle cr = new Circle(2, 3, 4);
        Circle cr1 = new Circle(4, 5);

        System.out.println("Lingkaran 3 Parameter");
        System.out.println("Keliling Lingkaran: " + cr.keliling());
        System.out.println("Luas Lingkaran : " + cr.luas());

        System.out.println("Lingkaran Konstruktor 2 Parameter");
        System.out.println("Keliling Lingkaran : " + cr1.keliling());
        System.out.println("Luas Lingkaran : " + cr1.luas());
    }
}

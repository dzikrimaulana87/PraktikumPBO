/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author dzikr
 */
public class PersegiPanjang {

    int panjang, lebar;
    float luas;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public float Luas() {
        luas = panjang * lebar;
        return luas;
    }

    public void info() {
        System.out.println("Panjang Persegi Panjang : " + panjang);
        System.out.println("Lebar Persegi Panjang : " + lebar);
        System.out.println("Luas Persegi Panjang : " + Luas());
    }

}

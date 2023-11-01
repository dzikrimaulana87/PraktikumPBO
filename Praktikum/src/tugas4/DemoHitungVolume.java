/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author dzikr
 */
public class DemoHitungVolume {

    public static void main(String[] args) {

        HitungVolume hitung = new HitungVolume();
        System.out.println("Volume kubus dengan panjang sisi 6 adalah " + hitung.volume(6) + "\n");
        System.out.println("Luas Permukaan kubus dengan panjang sisi 6 adalah " + hitung.luaspermukaan(6) + "\n");

        System.out.println("Volume balok dengan p,l,t (9,3,5) adalah "+hitung.volume(9,3,5) + "\n");
        System.out.println("Luas Permukaan kubus dengan p,l,t (9,3,5) adalah " + hitung.luaspermukaan(9,3,5) + "\n");

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author dzikr
 */
public class Nilai {
    private String nim;
    private String nama;
    private int nilaiAbsen;
    private int nilaiTugas;
    private int nilaiUTS;
    private int nilaiUAS;

    public Nilai(String nim, String nama, int absen, int tugas, int uts, int uas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAbsen = absen;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
    }

    public void CetakNilai() {
        int nilaiAkhir = (int) (0.1 * nilaiAbsen + 0.2 * nilaiTugas + 0.3 * nilaiUTS + 0.4 * nilaiUAS);
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Absen[10%] : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + nilaiTugas);
        System.out.println("Nilai UTS [30%] : " + nilaiUTS);
        System.out.println("Nilai UAS [40%] : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}

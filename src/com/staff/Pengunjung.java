package com.staff;
import  com.hewan.*;

public class Pengunjung {
    public String nama;
    public int umur;
    String tiketId;
    private double uang;
    protected String hewanKesukaan;

    public Pengunjung(String nama, int umur, String tiketId, double uang, String hewanKesukaan) {
        this.nama = nama;
        this.umur = umur;
        this.tiketId = tiketId;
        this.uang = uang;
        this.hewanKesukaan = hewanKesukaan;
    }

    public void tampilkanInfo() {
        System.out.println("=== Info Pengunjung ===");
        System.out.println("Nama           : " + nama);
        System.out.println("Umur           : " + umur);
        System.out.println("Tiket ID       : " + tiketId);
        System.out.println("Uang           : Rp" + String.format("%.2f", uang));
        System.out.println("Hewan Kesukaan : " + hewanKesukaan);
        System.out.println("=======================");
    }

    public void lihatHewanKesukaan() {
        System.out.println(nama + " menyukai hewan: " + hewanKesukaan);
    }

    public void lihatHewan(Hewan hewan) {
        System.out.println(nama + " melihat hewan: " + hewan.getNamaHewan()); // menggunakan method agar bisa mengakses variabel dengan
    }

    public void pilihHewanFavorit(Hewan hewan) {
        System.out.println(nama + " memilih hewan favorit: " + hewan.getNamaHewan());
    }

    public void tour(Penjaga tourGuide){
        System.out.println( this.nama + "sedang dipandu oleh " + tourGuide.nama); // ini coba akses variabel dengan access modifiers default
    }
}

package com.hewan;

public class Merak extends Hewan {
    public String jenisMerak;
    public Merak(int jumlahKaki, int umur, String namaHewan, char jenisKelamin, String jenisMerak) {
        super(jumlahKaki, umur, namaHewan, jenisKelamin);
        this.jenisMerak = jenisMerak;
    }

    public void suara() {
        System.out.println(namaHewan + " bersuara: Kwaaak!");
    }

    public void pamerBulu() {
        System.out.println(namaHewan + "memamerkan bulu - bulu");
    }
}
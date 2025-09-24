package com.hewan;

public class Gajah extends Hewan{
    public String jenisGajah;
    public Gajah(int jumlahKaki, int umur, String namaHewan, char jenisKelamin, String jenisGajah){
        super( jumlahKaki, umur, "Gajah", jenisKelamin);
        this.jenisGajah = jenisGajah;
    }

    public void berjalan() { // ini test protected dipackage yang sama
        super.berjalan();
    }

    public void makan() { // ini test protected dipackage yang sama
        super.makan();
    }

    public void minum() { // ini test protected dipackage yang sama
        super.minum();
    }
}

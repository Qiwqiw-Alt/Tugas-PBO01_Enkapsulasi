package com.hewan;

public class Harimau extends Hewan {
    public String jenisHarimau;
    public Harimau(int jumlahKaki, int umur, String namaHewan, char jenisKelamin, String jenisHarimau) {
        super(jumlahKaki, umur, "Harimau", jenisKelamin);
        this.jenisHarimau = jenisHarimau;
    }

    public void makan() {
        super.makan();
    }

    public void minum() {
        super.minum();
    }

    public void suara() {
        System.out.println(namaHewan + " mengaum: Rawrrr!"); // ini test protected dipackage yang sama
    }

    public void berburu() {
        System.out.println(namaHewan + " sedang berburu mangsa."); // ini test protected dipackage yang sama
    }
}

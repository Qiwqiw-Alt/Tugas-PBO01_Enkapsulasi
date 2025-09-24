package com.hewan;

public class Hewan {
    private int jumlahKaki;
    public int umur;
    protected String namaHewan;
    char jenisKelamin;

    public Hewan(int jumlahKaki, int umur, String namaHewan, char jenisKelamin) {
        this.jumlahKaki = jumlahKaki;
        this.umur = umur;
        this.namaHewan = namaHewan;
        this.jenisKelamin = jenisKelamin;
    }

    public int getUmur(){ //Karena variabel umur itu private maka dibutuhkan getter agar bisa diakses diluar class
        return this.umur;
    }

    public String getNamaHewan() {
        return namaHewan; // ini dibuat agar variabel dengan attribut protected bisa diakses dipackage yang berbeda
    }

    public void berjalan(){
        System.out.println(namaHewan + " berjalan.");
    }

    public void makan() {
        System.out.println(namaHewan + " makan");
    }

    public void minum(){
        System.out.println(namaHewan + " minum");
    }
}

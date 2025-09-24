package com.staff;
import com.hewan.*;
import java.util.*;

public class Penjaga {
    String nama;
    String staffId;
    protected int tahunPengalaman;
    protected String shift;
    private List<String> lokasiPenjagaan;  // lokasi yang dijaga misal ada kandang

    public Penjaga(String nama, String staffId, int tahunPengalaman, String shift) {
        this.nama = nama;
        this.staffId = staffId;
        this.tahunPengalaman = tahunPengalaman;
        this.shift = shift;
        this.lokasiPenjagaan = new ArrayList<>();
    }

    public void beriMakan(Hewan hewan) {
        System.out.println(nama + " memberi makan " + hewan.getNamaHewan());
    }

    public void tambahLokasi(String lokasi) {
        lokasiPenjagaan.add(lokasi);
        System.out.println(nama + " menambahkan lokasi penjagaan: " + lokasi);
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Staff ID: " + staffId);
        System.out.println("Tahun Pengalaman: " + tahunPengalaman);
        System.out.println("Shift: " + shift);
        System.out.println("Lokasi Penjagaan: " + lokasiPenjagaan);
    }

    public void hapusLokasi(String lokasi) {
        lokasiPenjagaan.remove(lokasi);
        System.out.println(nama + " menghapus lokasi penjagaan: " + lokasi);
    }
}

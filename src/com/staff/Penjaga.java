package com.staff;
import com.hewan.*;
import java.util.ArrayList;
import java.util.List;

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
        System.out.println("=== Info Penjaga ===");
        System.out.println("Nama             : " + nama);
        System.out.println("Staff ID         : " + staffId);
        System.out.println("Tahun Pengalaman : " + tahunPengalaman);
        System.out.println("Shift            : " + shift);
        System.out.print("Lokasi Penjagaan :");
        if (lokasiPenjagaan.isEmpty()) {
            System.out.println("  (Belum ada lokasi penjagaan)");
        } else {
            System.out.print("  ");
            for (int i = 0; i < lokasiPenjagaan.size(); i++) {
                System.out.print(lokasiPenjagaan.get(i));
                if (i < lokasiPenjagaan.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public void hapusLokasi(String lokasi) {
        lokasiPenjagaan.remove(lokasi);
        System.out.println(nama + " menghapus lokasi penjagaan: " + lokasi);
    }
}

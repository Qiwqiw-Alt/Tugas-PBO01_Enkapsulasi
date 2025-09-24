package com.hewan;
import java.util.*;
import com.staff.Penjaga;

public class Kandang {
    private String lokasi;
    private int kapasitas;
    private List<Hewan> hewanDiKandang;
    public Penjaga penjagaKandang;


    public Kandang(String lokasi, int kapasitas) {
        this.lokasi = lokasi;
        this.kapasitas = kapasitas;
        this.hewanDiKandang = new ArrayList<>();
    }

    public void tambahHewan(Hewan hewan) {
        if (hewanDiKandang.size() < kapasitas) {
            hewanDiKandang.add(hewan);
            System.out.println(hewan.namaHewan + " ditambahkan ke kandang di " + lokasi); // ini test protected dipackage yang sama
        }
        else {
            System.out.println("Kandang sudah penuh!");
        }
    }

    public void hapusHewan(Hewan hewan) {
        hewanDiKandang.remove(hewan);
        System.out.println(hewan.namaHewan + " dihapus dari kandang di " + lokasi); // ini test protected dipackage yang sama
    }

    public void tampilkanHewan() {
        System.out.println("Hewan di kandang " + lokasi + ":");
        for (Hewan hewan : hewanDiKandang) {
            System.out.println("- " + hewan.namaHewan); // ini test protected dipackage yang sama
        }
    }
}
package com.staff;
import com.hewan.*;

public class Main {
    public static void main(String[] args) {
        Penjaga penjaga1 = new Penjaga("Zidan", "01", 2, "Pagi");
        Pengunjung pengunjung1 = new Pengunjung("Qiqi", 19, "L0124069", 100000, "Gajah");
        Gajah gajah1 = new Gajah(4, 20, "Gajah", 'L', "Sumatra" );
        Harimau harimau1 = new Harimau(4, 5, "Harimau", 'L', "Sumatra");
        Merak merak1 = new Merak(2, 5, "Merak", 'P', "Putih Bali");

        penjaga1.tampilkanInfo();
        gajah1.umur = 21;
        System.out.println(gajah1.umur);

    }
}

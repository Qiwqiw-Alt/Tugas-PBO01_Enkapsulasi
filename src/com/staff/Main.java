package com.staff;
import com.hewan.*;

public class Main {
    public static void main(String[] args) {
        Penjaga penjaga1 = new Penjaga("Zidan", "01", 2, "Pagi");
        Pengunjung pengunjung1 = new Pengunjung("Qiqi", 19, "L0124069", 100000, "Gajah");
        Gajah gajah1 = new Gajah(4, 20, "Gajah", 'L', "Sumatra");
        Harimau harimau1 = new Harimau(4, 5, "Harimau", 'L', "Sumatra");
        Merak merak1 = new Merak(2, 5, "Merak", 'P', "Putih Bali");

        penjaga1.tampilkanInfo();
        System.out.println("");
        gajah1.umur = 21;
        System.out.println(gajah1.umur);

        System.out.println("");
        Kandang kandang1 = new Kandang("Blok A", 3);
        kandang1.tambahHewan(gajah1);
        kandang1.tambahHewan(harimau1);
        kandang1.tambahHewan(merak1);
    
        System.out.println("");
        penjaga1.tambahLokasi("Blok A");
        kandang1.penjagaKandang = penjaga1;
    
        kandang1.tampilkanHewan();
        System.out.println("");
        penjaga1.tampilkanInfo();
        System.out.println("");
        pengunjung1.tampilkanInfo();
    
        System.out.println("");
        pengunjung1.lihatHewan(gajah1);
        pengunjung1.lihatHewan(harimau1);
    
        System.out.println("");
        kandang1.hapusHewan(harimau1);
        kandang1.tampilkanHewan();
    }
}

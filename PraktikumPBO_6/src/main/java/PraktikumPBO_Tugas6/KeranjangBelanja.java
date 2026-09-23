/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO_Tugas6;

/**
 *
 * @author DIMAS
 */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> daftarProduk;

    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    // Metode baru untuk mencetak output yang banyak/detail
    public void cetakStruk() {
        double totalHargaAsli = 0;
        double totalDiskon = 0;
        double totalBayar = 0;

        System.out.println("=======================================");
        System.out.println("           STRUK PEMBELIAN             ");
        System.out.println("=======================================");

        // Looping untuk membedah setiap barang di keranjang
        for (Produk barang : daftarProduk) {
            System.out.println("Nama Barang : " + barang.getNama());
            System.out.println("Harga Asli  : Rp " + barang.getHarga());
            System.out.println("Diskon      : Rp " + barang.hitungDiskon());
            System.out.println("Harga Akhir : Rp " + barang.getHargaAkhir());
            System.out.println("---------------------------------------");

            // Menjumlahkan total keseluruhan
            totalHargaAsli += barang.getHarga();
            totalDiskon += barang.hitungDiskon();
            totalBayar += barang.getHargaAkhir();
        }

        // Output rangkuman akhir
        System.out.println("Total Harga Asli : Rp " + totalHargaAsli);
        System.out.println("Total Diskon     : Rp " + totalDiskon);
        System.out.println("TOTAL BAYAR      : Rp " + totalBayar);
        System.out.println("=======================================");
    }
}

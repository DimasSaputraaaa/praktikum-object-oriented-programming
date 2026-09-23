/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO_Tugas6;

/**
 *
 * @author DIMAS
 */
public class Produk {
    protected String nama;
    protected double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Tambahan: Getter untuk mengambil nama
    public String getNama() {
        return nama;
    }

    // Tambahan: Getter untuk mengambil harga asli
    public double getHarga() {
        return harga;
    }

    public double hitungDiskon() {
        return 0.0;
    }

    public double getHargaAkhir() {
        return harga - hitungDiskon();
    }
}

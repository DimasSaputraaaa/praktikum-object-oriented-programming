/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PraktikumPBO_Tugas6;

/**
 *
 * @author DIMAS
 */
public class Main_Tugas {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.tambahProduk(new Buku("Buku Pemrograman Java", 100000));
        keranjang.tambahProduk(new Elektronik("Mouse Wireless", 300000));
        keranjang.tambahProduk(new Pakaian("Kemeja Flanel", 200000));

        // Memanggil fungsi untuk mencetak struk lengkap
        keranjang.cetakStruk();
    }
}

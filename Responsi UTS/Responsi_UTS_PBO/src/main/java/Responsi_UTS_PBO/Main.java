/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Responsi_UTS_PBO;

/**
 *
 * @author DIMAS
 */

public class Main {
    public static void main(String[] args) {
        
        /*
         * KONSEP 1: OBJEK (OBJECT)
         * Jika Class adalah cetakan, maka Object adalah hasil kuenya (wujud nyata).
         * 'laptop' dan 'pegawai1' adalah objek nyata yang dicetak dari 
         * class Elektronik dan PegawaiTetap.
         */
        System.out.println("1. Output Produk"); 
        Elektronik laptop = new Elektronik("Laptop", 15000000, 2); 
        laptop.tampilkanInfo();
        System.out.println();

        System.out.println("2. Output Pegawai"); 
        PegawaiTetap pegawai1 = new PegawaiTetap("Dimas", 5000000, 1000000); 
        pegawai1.tampilkanInfo();
        System.out.println();

        /*
         * KONSEP 4: POLIMORFISME (POLYMORPHISM)
         * Satu nama (referensi kelas Induk), tapi bisa menampung banyak bentuk (objek kelas Anak).
         * Perhatikan: Tipe datanya adalah 'Produk' (Induk), tapi wujud objek yang 
         * dibuat (new) adalah 'Makanan' (Anak).
         */
        System.out.println("3. Output Polimorfisme"); 
        Produk produkPoli = new Makanan("Snack", 15000, "2023-12-30"); 
        Pegawai pegawaiPoli = new PegawaiKontrak("Marsha", 3000000, 12); 

        /*
         * Karena Polimorfisme, saat metode dipanggil, Java cukup pintar untuk 
         * memprioritaskan dan menjalankan metode 'tampilkanInfo()' milik kelas Anak (Makanan/PegawaiKontrak), 
         * BUKAN milik kelas Induk.
         */
        produkPoli.tampilkanInfo();
        System.out.println();
        pegawaiPoli.tampilkanInfo();
    }
}

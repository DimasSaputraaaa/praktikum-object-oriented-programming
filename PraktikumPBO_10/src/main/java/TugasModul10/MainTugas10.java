/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasModul10;

/**
 *
 * @author DIMAS
 */
public class MainTugas10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Membuat objek dari Elektronik dan Makanan
        Pembayaran itemElektronik = new Elektronik();
        Pembayaran itemMakanan = new Makanan();
        
        // 2. Menentukan harga awal produk (Contoh)
        double hargaTV = 3000000.0;     // Rp 3.000.000
        double hargaSnack = 50000.0;    // Rp 50.000
        
        // 3. Memanggil metode hitungPajak() dan menampilkan hasilnya
        System.out.println("--- Sistem Pembayaran Toko ---");
        
        System.out.println("Harga TV (Elektronik) : Rp " + hargaTV);
        System.out.println("Pajak Elektronik (10%): Rp " + itemElektronik.hitungPajak(hargaTV));
        
        System.out.println("\nHarga Snack (Makanan) : Rp " + hargaSnack);
        System.out.println("Pajak Makanan (5%)    : Rp " + itemMakanan.hitungPajak(hargaSnack));
    }
}

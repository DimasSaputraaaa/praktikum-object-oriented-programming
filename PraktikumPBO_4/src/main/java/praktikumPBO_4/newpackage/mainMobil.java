/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikumPBO_4.newpackage;

/**
 *
 * @author DIMAS
 */
public class mainMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek baru dari class Mobil
        // Urutan parameter dari constructor: (nama, kecepatanMaks, jenisMesin, jumlahPintu)
        Mobil mobilku = new Mobil("Toyota Avanza", 160, "1.5L 4-Silinder", 4);
        
        System.out.println("--- Informasi Umum Kendaraan ---");
        // Memanggil method warisan dari class induk (Kendaraan)
        mobilku.tampilkanInfoKendaraan();
        
        System.out.println("\n--- Informasi Spesifik Mobil ---");
        // Memanggil method khusus yang hanya ada di class Mobil
        mobilku.tampilkanInfoMobil();
    }
}
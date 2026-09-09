/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikumPBO_4.newpackage;

/**
 *
 * @author DIMAS
 */
public class mainKendaraan {
    public static void main(String[] args) {
        // 1. Membuat objek baru dari class Kendaraan menggunakan constructor
        Kendaraan mobil = new Kendaraan("Toyota Supra", 250, "V6 Twin-Turbo");
        
        System.out.println("--- Informasi Kendaraan Awal ---");
        // 2. Menampilkan informasi kendaraan
        mobil.tampilkanInfoKendaraan();
        
        System.out.println("\n--- Mengubah Data Kendaraan ---");
        // 3. Mengubah nama menggunakan Setter (karena private)
        mobil.setNama("Honda Civic Type R");
        
        // Mengubah atribut kecepatanMaks dan jenisMesin secara langsung 
        // (Bisa dilakukan selama mainKendaraan ada di folder/package yang sama)
        mobil.kecepatanMaks = 272;
        mobil.jenisMesin = "K20C1 Turbocharged";
        
        // 4. Menampilkan informasi kendaraan setelah diubah
        mobil.tampilkanInfoKendaraan();
        
        // 5. Contoh mengambil data spesifik menggunakan Getter
        System.out.println("\nMengambil nama saja menggunakan Getter: " + mobil.getNama());
    }
}

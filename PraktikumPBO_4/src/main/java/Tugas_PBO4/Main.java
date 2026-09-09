/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas_PBO4;

/**
 *
 * @author DIMAS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Membuat objek dari kelas Pekerja
        Pekerja pekerja1 = new Pekerja("Andi", 25, "Software Engineer", 8500000);

        System.out.println("--- Informasi Pekerja Awal ---");
        // 2. Menampilkan informasi pekerja menggunakan metode toString()
        System.out.println(pekerja1.toString());

        System.out.println("\n--- Informasi Pekerja Setelah Diubah ---");
        // 3. Mengubah nama pekerja menggunakan setter
        pekerja1.setNama("Andi Setiawan");
        // Menampilkan ulang informasi pekerja
        System.out.println(pekerja1.toString());
        
        // 4. Percobaan akses langsung (Penjelasan di bawah)
        /*
        System.out.println(pekerja1.nama); // Akan menyebabkan Error
        System.out.println(pekerja1.usia); // Bisa diakses jika Main di package yang sama
        System.out.println(pekerja1.gaji); // Akan menyebabkan Error
        */
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_PBO4;

/**
 *
 * @author DIMAS
 */
public class Pekerja extends Manusia {
    // Atribut tambahan khusus untuk Pekerja
    private double gaji;

    // Constructor untuk inisialisasi semua atribut (termasuk dari kelas induk)
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        // Memanggil constructor kelas induk (Manusia)
        super(nama, usia, pekerjaan); 
        this.gaji = gaji;
    }

    // Getter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }

    // Setter untuk atribut gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString()
    @Override
    public String toString() {
        // Menggunakan getNama() karena atribut nama bersifat private di kelas induk
        return "Nama: " + getNama() + 
               "\nUsia: " + usia + " tahun" +
               "\nPekerjaan: " + pekerjaan + 
               "\nGaji: Rp" + gaji;
    }
}

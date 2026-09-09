/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumPBO_4.newpackage;

/**
 *
 * @author DIMAS
 */
public class Kendaraan {
    // Atribut dengan akses modifier berbeda
    private String nama;
    protected int kecepatanMaks;
    public String jenisMesin;

    // Constructor (sekarang berada di dalam class)
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }

    // Getter dan setter untuk variabel private nama
    // Perbaikan: tipe data string diubah menjadi String (huruf kapital)
    public String getNama() { 
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method public untuk menampilkan informasi kendaraan
    public void tampilkanInfoKendaraan() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan Maks: " + kecepatanMaks + " Km/h");
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}

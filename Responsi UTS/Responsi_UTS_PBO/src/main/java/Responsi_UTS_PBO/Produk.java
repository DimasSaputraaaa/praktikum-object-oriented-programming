/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi_UTS_PBO;

/**
 *
 * @author DIMAS

 * KONSEP 1: KELAS (CLASS)
 * Class itu ibarat cetakan kue (blueprint). Di sini kita membuat cetakan bernama 
 * 'Produk' yang akan menentukan sifat-sifat dasar (atribut & metode) 
 * yang pasti dimiliki oleh semua barang di perusahaan.
 */
public class Produk {
    
    /*
     * KONSEP 2: ENKAPSULASI (ENCAPSULATION)
     * Melindungi data agar tidak bisa diubah sembarangan dari luar kelas.
     * Atribut diberi akses 'private' (seperti uang di brankas). 
     * Untuk melihat (get) atau mengubah (set) datanya, harus melalui 
     * metode resmi (getter dan setter).
     */
    private String namaProduk; 
    private int harga; 

    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Getter dan Setter adalah bagian dari penerapan Enkapsulasi
    public String getNamaProduk() { return namaProduk; }
    public void setNamaProduk(String namaProduk) { this.namaProduk = namaProduk; }
    
    public int getHarga() { return harga; }
    public void setHarga(int harga) { this.harga = harga; }

    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk); 
        System.out.println("Harga: " + harga); 
    }
}

/*
 * KONSEP 3: PEWARISAN (INHERITANCE)
 * Kelas anak (Elektronik) mewarisi semua sifat orang tuanya (Produk).
 * Menggunakan kata kunci 'extends'. Elektronik otomatis punya namaProduk dan harga, 
 * ditambah sifat khususnya sendiri yaitu 'garansi'.
 */
class Elektronik extends Produk {
    private int garansi; 

    public Elektronik(String namaProduk, int harga, int garansi) {
        // Kata kunci 'super' digunakan untuk memanggil constructor milik kelas Induk (Produk)
        super(namaProduk, harga);
        this.garansi = garansi;
    }

    public int getGaransi() { return garansi; }
    public void setGaransi(int garansi) { this.garansi = garansi; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil tampilkanInfo() dari kelas Induk
        System.out.println("Garansi: " + garansi + " tahun"); 
    }
}

// Makanan juga merupakan hasil pewarisan (Inheritance) dari Produk
class Makanan extends Produk {
    private String tanggalKadaluarsa; 

    public Makanan(String namaProduk, int harga, String tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    public String getTanggalKadaluarsa() { return tanggalKadaluarsa; }
    public void setTanggalKadaluarsa(String tanggalKadaluarsa) { this.tanggalKadaluarsa = tanggalKadaluarsa; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa); 
    }
}

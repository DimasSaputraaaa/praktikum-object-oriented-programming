/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.responsi_uts_pbo;

/**
 *
 * @author DIMAS
 */
// 1. KELAS INDUK (SUPERCLASS)
class Produk {
    // 2. ENKAPSULASI: Atribut dibuat private
    private String namaProduk;
    private int harga;

    // Constructor untuk memudahkan pengisian data
    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getNamaProduk() { return namaProduk; }
    public void setNamaProduk(String namaProduk) { this.namaProduk = namaProduk; }
    
    public int getHarga() { return harga; }
    public void setHarga(int harga) { this.harga = harga; }

    // Metode yang akan di-override (ditimpa) oleh kelas anak
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }
}

class Pegawai {
    // 2. ENKAPSULASI
    private String namaPegawai;
    private int gaji;

    public Pegawai(String namaPegawai, int gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }

    // Getter dan Setter
    public String getNamaPegawai() { return namaPegawai; }
    public void setNamaPegawai(String namaPegawai) { this.namaPegawai = namaPegawai; }

    public int getGaji() { return gaji; }
    public void setGaji(int gaji) { this.gaji = gaji; }

    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + gaji);
    }
}

// 3. PEWARISAN (INHERITANCE) DARI KELAS PRODUK
class Elektronik extends Produk {
    private int garansi; // dalam tahun

    public Elektronik(String namaProduk, int harga, int garansi) {
        super(namaProduk, harga); // Memanggil constructor kelas induk (Produk)
        this.garansi = garansi;
    }

    // Getter dan Setter khusus Elektronik
    public int getGaransi() { return garansi; }
    public void setGaransi(int garansi) { this.garansi = garansi; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Menampilkan info dari kelas induk
        System.out.println("Garansi: " + garansi + " tahun");
    }
}

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

// 3. PEWARISAN (INHERITANCE) DARI KELAS PEGAWAI
class PegawaiTetap extends Pegawai {
    private int tunjangan;

    public PegawaiTetap(String namaPegawai, int gaji, int tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }

    public int getTunjangan() { return tunjangan; }
    public void setTunjangan(int tunjangan) { this.tunjangan = tunjangan; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }
}

class PegawaiKontrak extends Pegawai {
    private int lamaKontrak; // dalam bulan

    public PegawaiKontrak(String namaPegawai, int gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }

    public int getLamaKontrak() { return lamaKontrak; }
    public void setLamaKontrak(int lamaKontrak) { this.lamaKontrak = lamaKontrak; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");
    }
}

// KELAS UTAMA UNTUK MENJALANKAN PROGRAM
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Output Produk");
        // Membuat objek Elektronik (tanpa polimorfisme untuk contoh pertama)
        Elektronik laptop = new Elektronik("Laptop", 15000000, 2);
        laptop.tampilkanInfo();
        System.out.println();

        System.out.println("2. Output Pegawai");
        PegawaiTetap pegawai1 = new PegawaiTetap("Dimas", 5000000, 1000000); 
        pegawai1.tampilkanInfo();
        System.out.println();

        System.out.println("3. Output Polimorfisme");
        // 4. POLIMORFISME: Tipe referensi adalah kelas INDUK, tapi objeknya adalah kelas ANAK
        Produk produkPoli = new Makanan("Snack", 15000, "2023-12-30");
        Pegawai pegawaiPoli = new PegawaiKontrak("Andi", 3000000, 12);

        // Saat dipanggil, metode dari kelas ANAK yang akan dieksekusi
        produkPoli.tampilkanInfo();
        System.out.println();
        pegawaiPoli.tampilkanInfo();
    }
}

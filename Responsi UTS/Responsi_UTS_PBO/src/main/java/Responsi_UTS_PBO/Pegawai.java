/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi_UTS_PBO;

/**
 *
 * @author DIMAS
 */


// KELAS INDUK (Class)
public class Pegawai {
    
    // ENKAPSULASI: private modifier
    private String namaPegawai; 
    private int gaji; 

    public Pegawai(String namaPegawai, int gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }

    public String getNamaPegawai() { return namaPegawai; }
    public void setNamaPegawai(String namaPegawai) { this.namaPegawai = namaPegawai; }

    public int getGaji() { return gaji; }
    public void setGaji(int gaji) { this.gaji = gaji; }

    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai); 
        System.out.println("Gaji: " + gaji); 
    }
}

// PEWARISAN (Inheritance): PegawaiTetap mewarisi Pegawai
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

// PEWARISAN (Inheritance): PegawaiKontrak mewarisi Pegawai
class PegawaiKontrak extends Pegawai {
    private int lamaKontrak; 

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

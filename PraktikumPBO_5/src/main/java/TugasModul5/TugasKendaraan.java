/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul5;

/**
 *
 * @author DIMAS
 */
public class TugasKendaraan {
    String nama;
    int kecepatan;

    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan : " + nama);
        System.out.println("Kecepatan      : " + kecepatan + " km/jam");
    }

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  PENGUJIAN HIERARKI PEWARISAN 3 LEVEL  ");
        System.out.println("========================================");

        MobilDarat mobil = new MobilDarat();
        mobil.nama = "Toyota Fortuner";
        mobil.kecepatan = 180;
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 5;

        System.out.println("[INFO MOBIL]");
        mobil.tampilkanInfo();

        System.out.println();

        SepedaMotorDarat motor = new SepedaMotorDarat();
        motor.nama = "Yamaha R15";
        motor.kecepatan = 135;
        motor.jumlahRoda = 2;
        motor.jenisMesin = "4-tak VVA";

        System.out.println("[INFO SEPEDA MOTOR]");
        motor.tampilkanInfo();
    }
}

class KendaraanDarat extends TugasKendaraan {
    int jumlahRoda;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda    : " + jumlahRoda);
    }
}

class MobilDarat extends KendaraanDarat {
    int jumlahPintu;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu   : " + jumlahPintu);
    }
}

class SepedaMotorDarat extends KendaraanDarat {
    String jenisMesin;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin    : " + jenisMesin);
    }
}

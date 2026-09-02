/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO3;

/**
 *
 * @author DIMAS
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2022, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2023, "Putih");

        System.out.println("=== Informasi Awal Mobil ===");
        mobil1.displayInfo();
        mobil2.displayInfo();

        System.out.println("=== Menyalakan Mesin ===");
        mobil1.startEngine();
        mobil2.startEngine();
        System.out.println("-------------------------\n");

        System.out.println("=== Mengubah Warna Mobil 1 ===");
        mobil1.ubahWarna("Merah"); 
        
        mobil1.displayInfo();
    }
}

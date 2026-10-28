/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum9;

/**
 *
 * @author DIMAS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kendaraan Mobil = new Mobil();
        Kendaraan Sepeda = new Sepeda();
        
        Mobil.berjalan();
        Mobil.info();
        
        Sepeda.berjalan();
        Sepeda.info();
    }
    
}

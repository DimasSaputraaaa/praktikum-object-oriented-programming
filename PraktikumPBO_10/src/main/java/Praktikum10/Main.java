/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum10;

/**
 *
 * @author DIMAS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objek penjumlahan 
       OperasiHitung penjumlahan = new penjumlahan();
       System.out.println("penjumlahan: " + penjumlahan.hitung(10,5)); // Output: 15
       
       // Objek pengurangan 
       OperasiHitung pengurangan = new pengurangan();
       System.out.println("pengurangan: " + pengurangan.hitung(10, 5)); // Output: 5
    }
}
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas9;

/**
 *
 * @author DIMAS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek dari kelas kucing dan anjing 
        Hewan Kucing = new Kucing();
        Hewan Anjing = new Anjing();
        
        // Memanggil metode suara() dari masing masing objek
        Kucing.suara();
        Anjing.suara();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9;

/**
 *
 * @author DIMAS
 */
// Kelas abstrak Hewan
abstract class Hewan {
    // Metode abstrak yang harus diimplementasikan oleh kelas turunan
    public abstract void suara();
}

// Kelas turunan kucing
class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Kucing mengeluarkan suara: Meong");
    }
}

// Kelas turunan Anjing
class Anjing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Anjing mengeluarkan suara: Guk Guk");
    }
}


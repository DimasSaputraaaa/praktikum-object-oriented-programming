/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul10;

/**
 *
 * @author DIMAS
 */
public class Makanan implements Pembayaran {
    @Override
    public double hitungPajak(double harga) {
        // Pajak 5% (5/100 = 0.05)
        return harga * 0.05;
    }
}

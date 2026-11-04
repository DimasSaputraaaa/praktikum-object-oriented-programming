/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul10;

/**
 *
 * @author DIMAS
 */
public class Elektronik implements Pembayaran {
    @Override
    public double hitungPajak(double harga) {
        // Pajak 10% (10/100 = 0.10)
        return harga * 0.10;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DIMAS
 */
public class main {
    public static void main(String[] args) {
      Hewan hewan = new Kucing();
      hewan.bersuara();
      
      Kucing kucing = new Kucing();
      kucing.makan("ikan");
      kucing.makan("ikan", 2);
        
      Anjing anjing = new Anjing();
      anjing.bersuara();
      anjing.makan("daging", 3);
        
    }
}


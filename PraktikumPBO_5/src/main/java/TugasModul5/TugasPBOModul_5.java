/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul5;

/**
 *
 * @author DIMAS
 */
class Hewan {
    String nama;
    String jenis;

    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Jenis      : " + jenis);
    }
}
class Kucing extends Hewan {

    public Kucing(String nama) {
        super(nama, "Mamalia / Karnivora");
    }

    public void suaraKhas() {
        System.out.println("Suara      : Meong meong!");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("[Informasi Kucing]");
        super.tampilkanInfo();
        suaraKhas();
    }
}
class Anjing extends Hewan {

    public Anjing(String nama) {
        super(nama, "Mamalia / Karnivora");
    }

    public void suaraKhas() {
        System.out.println("Suara      : Guk guk!");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("[Informasi Anjing]");
        super.tampilkanInfo();
        suaraKhas();
    }
}

public class TugasPBOModul_5 {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Mimi");
        kucing.tampilkanInfo();

        System.out.println();

        Anjing anjing = new Anjing("Buddy");
        anjing.tampilkanInfo();
    }
}
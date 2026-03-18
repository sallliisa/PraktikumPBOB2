/*
 * Nama File     : Lingkaran.java
 * Deskripsi     : class merepresentasikan bangun datar lingkaran.
 * Pembuat       : M. Ghani Aryasuta (24060121120026)
 * Tanggal       : 19 Februari 2026
 */

public class Lingkaran extends BangunDatar implements IResize {
    private double jari;

    public Lingkaran() {
        this(0, "", "");
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(1, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    public double getDiameter() {
        return 2 * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }

    @Override
    public void zoomIn() {
        this.jari *= 1.1;
    }

    @Override
    public void zoomOut() {
        this.jari *= 0.9;
    }

    @Override
    public void zoom(int percent) {
        this.jari = jari * percent/100.0;
    }
}

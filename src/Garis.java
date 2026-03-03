/*
 * Nama File     : Garis.java
 * Deskripsi     : berisi atribut dan method dalam class Garis
 * Pembuat       : M. Ghani Aryasuta
 * Tanggal       : 25 Februari 2026
 */

public class Garis {
    /***************ATRIBUT***************/
    private Titik TAwal;
    private Titik TAkhir;
    private static int counterGaris = 0;

    /***************METHOD***************/
    public Garis() {
        this.TAwal = new Titik(0, 0);
        this.TAkhir = new Titik(1, 1);
        counterGaris++;
    }

    public Garis(Titik TAwal, Titik TAkhir) {
        this.TAwal = TAwal;
        this.TAkhir = TAkhir;
        counterGaris++;
    }

    public void setTAwal(Titik T) {
        this.TAwal = T;
    }

    public void setTAkhir(Titik T) {
        this.TAkhir = T;
    }

    public Titik getTAwal() {
        return this.TAwal;
    }

    public Titik getTAkhir() {
        return this.TAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    public double getPanjang() {
        return this.TAwal.getJarak(this.TAkhir);
    }

    public double getGradien() {
        return (this.TAkhir.getOrdinat() - this.TAwal.getOrdinat())/(this.TAkhir.getAbsis() - this.TAwal.getAbsis());
    }

    public Titik getTitikTengah() {
        return new Titik(
            (this.TAkhir.getAbsis() + this.TAwal.getAbsis()) / 2,
            (this.TAkhir.getOrdinat() + this.TAwal.getOrdinat()) / 2
        );
    }

    public boolean getIsSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    public boolean getIsTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    public void print() {
        System.out.println("Awal (" + this.TAwal.getAbsis() + "," + this.TAwal.getOrdinat() + "); Akhir (" + this.TAkhir.getAbsis() + "," + this.TAkhir.getOrdinat() + ")");
    }

    public void printEquation() {
        double c = this.TAwal.getOrdinat() - (this.getGradien() * this.TAwal.getAbsis());
        System.out.println("y="+this.getGradien()+"x+"+c);
    }
}

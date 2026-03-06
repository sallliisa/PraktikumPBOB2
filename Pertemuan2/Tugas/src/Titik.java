/*
 * Nama File     : Titik.java
 * Deskripsi     : berisi atribut dan method dalam class Titik
 * Pembuat       : M. Ghani Aryasuta (24060121120026)
 * Tanggal       : 19 Februari 2026
 */

public class Titik {
    /***************ATRIBUT***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /***************METHOD***************/
    // konstruktor untuk membuat titik (0,0)
    public Titik() {
        this(0, 0);
    }

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    public int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        }
        return 0;
    }

    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public double getJarak(Titik T) {
        double deltaX = absis - T.getAbsis();
        double deltaY = ordinat - T.getOrdinat();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public void refleksiX() {
        ordinat = -ordinat;
    }

    public void refleksiY() {
        absis = -absis;
    }

    public Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    public Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }

    // mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
} // end class Titik

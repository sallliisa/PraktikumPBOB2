/*
 * Nama File     : Titik.java
 * Deskripsi     : berisi atribut dan method dalam class Titik
 * Pembuat       :
 * Tanggal       :
 */

public class Titik {
    /***************ATRIBUT***************/
    private double absis;
    private double ordinat;

    /***************METHOD***************/
    // konstruktor untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
    }

    // konstruktor untuk membuat titik (absis, ordinat)
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
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

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mengembalikan kuadran titik (0 jika berada pada sumbu)
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

    // mengembalikan jarak titik terhadap titik pusat (0,0)
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // mengembalikan jarak titik ini terhadap titik T
    public double getJarak(Titik T) {
        double deltaX = absis - T.getAbsis();
        double deltaY = ordinat - T.getOrdinat();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // merefleksikan titik terhadap sumbu X
    public void refleksiX() {
        ordinat = -ordinat;
    }

    // merefleksikan titik terhadap sumbu Y
    public void refleksiY() {
        absis = -absis;
    }

    // mengembalikan titik hasil refleksi terhadap sumbu X
    public Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    // mengembalikan titik hasil refleksi terhadap sumbu Y
    public Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }

    // mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
} // end class Titik

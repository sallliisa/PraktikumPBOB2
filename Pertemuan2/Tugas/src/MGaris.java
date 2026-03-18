/*
 * Nama File     : MGaris.java
 * Deskripsi     : main program untuk showcase operasi pada class Garis.
 * Pembuat       : M. Ghani Aryasuta (24060121120026)
 * Tanggal       : 19 Februari 2026
 */

public class MGaris {
    public static void main(String[] args) {
        Garis gDefault = new Garis();
        Garis g1 = new Garis(new Titik(0, 0), new Titik(4, 4));
        Garis g2 = new Garis(new Titik(1, 1), new Titik(5, 5));
        Garis g3 = new Garis(new Titik(0, 4), new Titik(4, 0));

        System.out.println("counterGaris: " + Garis.getCounterGaris());

        System.out.println("g1 TAwal:");
        g1.getTAwal().printTitik();
        System.out.println("g1 TAkhir:");
        g1.getTAkhir().printTitik();

        gDefault.setTAwal(new Titik(2, 2));
        gDefault.setTAkhir(new Titik(6, 2));
        System.out.println("gDefault after setTAwal/setTAkhir:");
        gDefault.print();
        gDefault.printEquation();

        System.out.println("print & printEquation g1:");
        g1.print();
        g1.printEquation();
        System.out.println("getPanjang g1: " + g1.getPanjang());
        System.out.println("getGradien g1: " + g1.getGradien());
        System.out.println("getTitikTengah g1:");
        g1.getTitikTengah().printTitik();

        System.out.println("g1 getIsSejajar g2: " + g1.getIsSejajar(g2));
        System.out.println("g1 getIsTegakLurus g3: " + g1.getIsTegakLurus(g3));
    }
}

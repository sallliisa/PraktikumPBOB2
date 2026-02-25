/*
 * Nama File     : MGaris.java
 * Deskripsi     : berisi implementasi atribut dan method dalam class Garis
 * Pembuat       : M. Ghani Aryasuta
 * Tanggal       : 25 Februari 2026
 */

public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(0, 0);
        Titik T2 = new Titik(4, 4);
        Garis G1 = new Garis(T1, T2);

        Titik T3 = new Titik(1, 1);
        Titik T4 = new Titik(5, 5);
        Garis G2 = new Garis(T3, T4);

        Titik T5 = new Titik(0, 4);
        Titik T6 = new Titik(4, 0);
        Garis G3 = new Garis(T5, T6);

        G1.print();
        G1.printEquation();
        System.out.println("Panjang G1: " + G1.getPanjang());
        System.out.println("Gradien G1: " + G1.getGradien());
        G1.getTitikTengah().printTitik();

        System.out.println("G1 sejajar G2: " + G1.getIsSejajar(G2));
        System.out.println("G1 tegak lurus G3: " + G1.getIsTegakLurus(G3));
        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris());
    }
}

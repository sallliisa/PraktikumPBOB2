/*
 * Nama File     : MTitik.java
 * Deskripsi     : berisi implementasi atribut dan method dalam class Titik
 * Pembuat       : M. Ghani Aryasuta
 * Tanggal       : 19 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik(); 
        Titik t2 = new Titik(6, 8);

        System.out.println("counterTitik: " + Titik.getCounterTitik());

        System.out.println("t1.absis: " + t1.getAbsis());
        System.out.println("t1.ordinat: " + t1.getOrdinat());
        t1.setAbsis(3);
        t1.setOrdinat(4);
        System.out.println("after setAbsis & setOrdinat:");
        t1.printTitik();

        t1.geser(2, -1);
        System.out.println("after geser(2,-1):");
        t1.printTitik();
        System.out.println("getKuadran t1: " + t1.getKuadran());
        System.out.println("getJarakPusat t1: " + t1.getJarakPusat());
        System.out.println("getJarak t1 -> t2: " + t1.getJarak(t2));

        t1.refleksiX();
        System.out.println("after refleksiX:");
        t1.printTitik();
        t1.refleksiY();
        System.out.println("after refleksiY:");
        t1.printTitik();

        Titik refleksiX = t2.getRefleksiX();
        Titik refleksiY = t2.getRefleksiY();
        System.out.println("t2:");
        t2.printTitik();
        System.out.println("getRefleksiX(t2):");
        refleksiX.printTitik();
        System.out.println("getRefleksiY(t2):");
        refleksiY.printTitik();
    }
}

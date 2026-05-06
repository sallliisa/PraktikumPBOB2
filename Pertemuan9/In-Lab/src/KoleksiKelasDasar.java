import java.util.ArrayList;

public class KoleksiKelasDasar {
    public static void main(String[] args) throws Exception {
        // Kamus
        Teman teman;

        // Algoritma
        teman = new Teman();

        System.out.println("Add Andi, Budi, Citra, Budi(2) ke teman");

        teman.addNama("Andi");
        teman.addNama("Budi");
        teman.addNama("Citra");
        teman.addNama("Budi");

        System.out.println("teman.getNbelm(): " + teman.getNbelm());
        System.out.println("teman.isMember(\"Budi\") " + teman.isMember("Budi"));
        System.out.println("teman.countNama(\"Budi\"): " + teman.countNama("Budi"));

        System.out.println("\nDaftar teman:");
        teman.showTeman();

        teman.gantiNama("Citra", "Cici");
        teman.setNama(0, "Andreas");
        teman.delNama("Budi");

        System.out.println("\nDaftar teman (updated):");
        teman.showTeman();

        System.out.println("\nteman.getNama(1): " + teman.getNama(1));
    }
}

class Teman {
    private int nblem;
    private ArrayList<String> Lnama;

    // Konstruktor untuk kelas Teman
    public Teman() {
        // Algoritma
        this.nblem = 0;
        this.Lnama = new ArrayList<String>();
    }

    // Mengembalikan jumlah nama dalam koleksi teman
    public int getNbelm() {
        // Algoritma
        return nblem;
    }

    // Mengembalikan nama pada indeks tertentu
    public String getNama(int indeks) {
        // Algoritma
        if (indeks >= 0 && indeks < Lnama.size()) {
            return Lnama.get(indeks);
        } else {
            return null;
        }
    }

    // Mengubah nama pada indeks tertentu
    public void setNama(int indeks, String nama) {
        // Algoritma
        if (indeks >= 0 && indeks < Lnama.size()) {
            Lnama.set(indeks, nama);
        }
    }

    // Menambahkan nama ke koleksi teman
    public void addNama(String nama) {
        // Algoritma
        Lnama.add(nama);
        nblem++;
    }

    // Menghapus nama dari koleksi teman
    public void delNama(String nama) {
        // Algoritma
        if (Lnama.contains(nama)) {
            Lnama.remove(nama);
            nblem--;
        }
    }

    // Mengecek apakah sebuah nama merupakan member dari koleksi teman
    public boolean isMember(String nama) {
        // Algoritma
        return Lnama.contains(nama);
    }

    // Mengganti nama tertentu dengan nama baru
    public void gantiNama(String nama, String namabaru) {
        // Kamus
        int indeks;
        // Algoritma
        indeks = Lnama.indexOf(nama);
        if (indeks != -1) {
            Lnama.set(indeks, namabaru);
        }
    }

    // Menghitung jumlah kemunculan nama tertentu dalam koleksi teman
    public int countNama(String nama) {
        // Kamus
        int count;
        // Algoritma
        count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    // Menampilkan nama semua teman dalam koleksi
    public void showTeman() {
        // Algoritma
        for (String nama : Lnama) {
            System.out.println(nama);
        }
    }
}


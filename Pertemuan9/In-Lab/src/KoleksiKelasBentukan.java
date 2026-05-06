import java.util.LinkedList;

public class KoleksiKelasBentukan {
    public static void main(String[] args) throws Exception {
        // Kamus
        Piaraan piaraan;
        Anabul a1, a2, a3, a4, a5;

        // Algoritma
        piaraan = new Piaraan();

        System.out.println("Add Bruno (anjing), Cici (burung), Mimi (kucing), Luna (anggora), Kiko (kembang telon) ke piaraan");

        a1 = new Anjing("Bruno");
        a2 = new Burung("Cici");
        a3 = new Kucing("Mimi", 3.5);
        a4 = new Anggora("Luna", 4.2);
        a5 = new KembangTelon("Kiko", 2.8);

        piaraan.enqueueAnabul(a1);
        piaraan.enqueueAnabul(a2);
        piaraan.enqueueAnabul(a3);
        piaraan.enqueueAnabul(a4);
        piaraan.enqueueAnabul(a5);

        System.out.println("piaraan.getNbelm(): " + piaraan.getNbelm());
        System.out.println("piaraan.getAnabul().getNama(): " + piaraan.getAnabul().getNama());
        System.out.println("piaraan.isMember(a3): " + piaraan.isMember(a3));

        System.out.println("\nDaftar anabul (showAnabul):");
        piaraan.showAnabul();

        System.out.println("\nJenis anabul (showJenisAnabul):");
        piaraan.showJenisAnabul();

        System.out.println("\npiaraan.countKucing(): " + piaraan.countKucing());
        System.out.println("piaraan.bobotKucing(): " + piaraan.bobotKucing());

        System.out.println("\npiaraan.dequeueAnabul().getNama(): " + piaraan.dequeueAnabul().getNama());
        System.out.println("piaraan.getNbelm(): " + piaraan.getNbelm());
    }
}


class Piaraan {
    private int nblem;
    private LinkedList<Anabul> Lanabul;

    // Konstruktor untuk kelas Piaraan
    public Piaraan() {
        // Algoritma
        this.nblem = 0;
        this.Lanabul = new LinkedList<Anabul>();
    }

    // Mengembalikan jumlah anabul dalam antrean
    public int getNbelm() {
        // Algoritma
        return nblem;
    }

    // Melakukan queue sebuah anabul terhadap LinkedList Lanabul
    public void enqueueAnabul(Anabul anabul) {
        // Algoritma
        Lanabul.add(anabul);
        nblem++;
    }

    // Mengecek apakah sebuah anabul merupakan member dari antrean
    public boolean isMember(Anabul anabul) {
        // Algoritma
        return Lanabul.contains(anabul);
    }

    // Mengembalikan anabul terdepan (peek)
    public Anabul getAnabul() {
        // Algoritma
        return Lanabul.peek();
    }

    // Melakukan dequeue sebuah anabul dari antrean Lanabul
    public Anabul dequeueAnabul() {
        // Algoritma
        if (!Lanabul.isEmpty()) {
            nblem--;
            return Lanabul.poll();
        } else {
            return null;
        }
    }

    // Menampilkan nama semua anabul dalam antrean
    public void showAnabul() {
        // Algoritma
        for (Anabul anabul : Lanabul) {
            System.out.println(anabul.getNama());
        }
    }

    // Menghitung jumlah anabul yang merupakan kucing
    public int countKucing() {
        // Kamus
        int count;
        // Algoritma
        count = 0;
        for (Anabul anabul : Lanabul) {
            if (anabul instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // Menghitung total bobot semua kucing dalam antrean
    public double bobotKucing() {
        // Kamus
        double totalBobot;
        // Algoritma
        totalBobot = 0.0;
        for (Anabul anabul : Lanabul) {
            if (anabul instanceof Kucing) {
                totalBobot += ((Kucing) anabul).getBobot();
            }
        }
        return totalBobot;
    }

    // Menampilkan nama dan jenis semua anabul dalam antrean
    public void showJenisAnabul() {
        // Algoritma
        for (Anabul anabul : Lanabul) {
            System.out.println(anabul.getNama() + " (" + anabul.getClass().getSimpleName() + ")");
        }
    }
}

abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    abstract public void gerak();
    abstract public void bersuara();
}

class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Guk-guk");
    }
}

class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Terbang");
    }

    @Override
    public void bersuara() {
        System.out.println("Cuit");
    }
}

class Kucing extends Anabul {
    private Double bobot;
    public Kucing(String nama, Double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    @Override
    public void gerak() {
        System.out.println("Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Meong");
    }

    public void setBobot(Double bobot) {
        this.bobot = bobot;
    }

    public Double getBobot() {
        return bobot;
    }
}

class Anggora extends Kucing {
    public Anggora(String nama, Double bobot) {
        super(nama, bobot);
    }
}

class KembangTelon extends Kucing {
    public KembangTelon(String nama, Double bobot) {
        super(nama, bobot);
    }
}

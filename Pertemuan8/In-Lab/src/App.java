public class App {

    static void generikPadaClass() {
        // I. Generik pada Class
        // Kamus
        Kucing anggora, kembangTelon;
        Datum<Kucing> datumKucing;
        
        // Algoritma
		anggora = new Anggora("Manggora" , 4.5);
        kembangTelon = new KembangTelon("Mentelon" , 6.0);

		System.out.println("Anggora:");
		anggora.gerak();
		anggora.bersuara();
		System.out.println("Bobot Anggora: " + anggora.getBobot());

        System.out.println("=========");

		System.out.println("Kembang Telon:");
		kembangTelon.gerak();
		kembangTelon.bersuara();
		System.out.println("Bobot Kembang Telon: " + kembangTelon.getBobot());

        System.out.println("=========");

        datumKucing = new Datum<>(anggora);
        System.out.println("Datum Kucing (anggora dibungkus Datum):");
        datumKucing.getIsi().gerak();
        datumKucing.getIsi().bersuara();
        System.out.println("Bobot Datum<Kucing>: " + datumKucing.getIsi().getBobot());
    }

    static void generikPadaOperator() {
        // II. Generik pada Operator
        // Kamus
        Datum<Integer> intA, intB;
        Datum<String> strA, strB;
        Datum<Anabul> anggora, kembangTelon;

        // Algoritma
        System.out.println("Integer:");
        intA = new Datum<>(5);
        intB = new Datum<>(10);
        System.out.println("Sebelum ditukar: intA = " + intA.getIsi() + ", intB = " + intB.getIsi());
        OperatorGenerik.tukar(intA, intB);
        System.out.println("Setelah ditukar: intA = " + intA.getIsi() + ", intB = " + intB.getIsi());

        System.out.println("String:");
        strA = new Datum<String>("Hello");
        strB = new Datum<String>("World");
        System.out.println("Sebelum ditukar: strA = " + strA.getIsi() + ", strB = " + strB.getIsi());
        OperatorGenerik.tukar(strA, strB);
        System.out.println("Setelah ditukar: strA = " + strA.getIsi() + ", strB = " + strB.getIsi());

        System.out.println("Anabul:");
        anggora = new Datum<>(new Anggora("Manggora", 4.5));
        kembangTelon = new Datum<>(new KembangTelon("Mentelon", 6.0));
        System.out.println("Sebelum ditukar: anggora = " + anggora.getIsi().getNama() + ", kembangTelon = " + kembangTelon.getIsi().getNama());
        OperatorGenerik.tukar(anggora, kembangTelon);
        System.out.println("Setelah ditukar: anggora = " + anggora.getIsi().getNama() + ", kembangTelon = " + kembangTelon.getIsi().getNama());

        System.out.println("Bobot2:");
        System.out.println("Bobot Anggora + Kembang Telon: " + OperatorGenerik.bobot2(anggora, kembangTelon));
    }

    static void larikGenerik() {
        // III. Larik Generik
        // Kamus
        Data<Anabul> dataAnabul;
        Anabul hewan1, hewan2, hewan3;

        // Algoritma
        dataAnabul = new Data<Anabul>();
        hewan1 = new Anjing("Andi");
        hewan2 = new Burung("Budi");
        hewan3 = new Anggora("Caca", 4.5);

        dataAnabul.setIsi(1, hewan1);
        dataAnabul.setIsi(2, hewan2);
        dataAnabul.setIsi(3, hewan3);

        System.out.println("Larik Generik Data<Anabul>:");
        System.out.println("Size: " + dataAnabul.getSize());

        for (int i = 1; i <= dataAnabul.getSize(); i++) {
            System.out.println("Posisi " + i + ": " + dataAnabul.getIsi(i).getNama());
            dataAnabul.getIsi(i).gerak();
            dataAnabul.getIsi(i).bersuara();
            System.out.println("=========");
        }
    }

	public static void main(String[] args) {
        // Algoritma
        System.out.println("I. Generik pada Class:");
        generikPadaClass();
        System.out.println("\nII. Generik pada Operator:");
        generikPadaOperator();
        System.out.println("\nIII. Larik Generik:");
        larikGenerik();
	}
}

// I. Generik pada Class
abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
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

class Datum<T> {
    private T isi;

    public Datum(T data) {
        this.isi = data;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T data) {
        this.isi = data;
    }
}

// II. Generik pada Operator
class OperatorGenerik {
    public static <T> void tukar(Datum<T> a, Datum<T> b) {
        // Kamus
        T temp;

        // Algoritma
        temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static <T> Double bobot2(T a, T b) {
        // Kamus
        Double bobotA, bobotB;

        // Algoritma
        if (a instanceof Kucing && b instanceof Kucing) {
            bobotA = ((Kucing) a).getBobot();
            bobotB = ((Kucing) b).getBobot();
            return bobotA + bobotB;
        } else {
            return 0.0;
        }
    }
}

// III. Larik Generik
class Data<T> {
    private T[] ruang;
    private int banyak;

    public Data() {
        this.ruang = (T[]) new Object[100];
        this.banyak = 0;
    }

    public T getIsi(int posisi) {
        return ruang[posisi - 1];
    }

    public void setIsi(int posisi, T data) {
        ruang[posisi - 1] = data;
        if (posisi > banyak) {
            banyak = posisi;
        }
    }

    public int getSize() {
        return banyak;
    }
}


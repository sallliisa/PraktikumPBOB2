public class PolimorfismeUniversalInclusion3 {
	public static void main(String[] args) {
        // Kamus
		Kucing kucing; 
		Anjing anjing;
		Burung burung;

        // Algoritma
        kucing = new Kucing("Mimi");
        anjing = new Anjing("Bobby");
        burung = new Burung("Cici");
		System.out.println("Kucing:");
		kucing.gerak();
		kucing.bersuara();
        System.out.println("Anjing:");
        anjing.gerak();
        anjing.bersuara();
        System.out.println("Burung:");
        burung.gerak();
        burung.bersuara();
	}
}

abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        // Algoritma
        this.nama = nama;
    }

    abstract public void gerak();
    abstract public void bersuara();
}

class Anjing extends Anabul {
    public Anjing(String nama) {
        // Algoritma
        super(nama);
    }

    @Override
    public void gerak() {
        // Algoritma
        System.out.println("Melata");
    }

    @Override
    public void bersuara() {
        // Algoritma
        System.out.println("Guk-guk");
    }
}

class Burung extends Anabul {
    public Burung(String nama) {
        // Algoritma
        super(nama);
    }

    @Override
    public void gerak() {
        // Algoritma
        System.out.println("Terbang");
    }

    @Override
    public void bersuara() {
        // Algoritma
        System.out.println("Cuit");
    }
}

class Kucing extends Anabul {
    public Kucing(String nama) {
        // Algoritma
        super(nama);
    }

    @Override
    public void gerak() {
        // Algoritma
        System.out.println("Melata");
    }

    @Override
    public void bersuara() {
        // Algoritma
        System.out.println("Meong");
    }

}
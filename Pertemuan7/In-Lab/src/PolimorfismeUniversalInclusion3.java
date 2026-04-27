public class PolimorfismeUniversalInclusion3 {
	public static void main(String[] args) {
		Kucing kucing = new Kucing("Mimi");
		Anjing anjing = new Anjing("Bobby");
		Burung burung = new Burung("Cici");

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
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Meong");
    }

}
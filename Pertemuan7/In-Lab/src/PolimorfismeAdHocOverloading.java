public class PolimorfismeAdHocOverloading {
	public static void main(String[] args) {
        // Kamus
        Mahasiswa mDefault, mParam, mClone;

        // Algoritma
        // a) di Mahasiswa.java
        
		// c)
        System.out.println("Instansiasi tanpa parameter:");
		mDefault = new Mahasiswa();
		mDefault.printInfo();

		// d)
        System.out.println("Instansiasi dengan parameter:");
		mParam = new Mahasiswa("240001", "Budi", "Informatika");
		mParam.printInfo();

		// b)
        System.out.println("setProgramStudi 3 varian");
		mDefault.setProgramStudi();
		mDefault.printInfo();

		mDefault.setProgramStudi("Sistem Informasi");
		mDefault.printInfo();

		mDefault.setProgramStudi(mParam);
		mDefault.printInfo();

		// e)
        System.out.println("Instansiasi copy mahasiswa:");
		mClone = new Mahasiswa(mParam);
		mClone.printInfo();
	}
}

class Mahasiswa {
    private String nim;
    private String nama;
    private String programStudi;

    public Mahasiswa() {
        // Algoritma
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    public Mahasiswa(String nim, String nama, String programStudi) {
        // Algoritma
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa mahasiswaLain) {
        // Algoritma
        this.nim = mahasiswaLain.getNim();
        this.nama = mahasiswaLain.getNama();
        this.programStudi = mahasiswaLain.getProgramStudi();
    }

    public String getNim() {
        // Algoritma
        return nim;
    }

    public String getNama() {
        // Algoritma
        return nama;
    }

    public String getProgramStudi() {
        // Algoritma
        return programStudi;
    }

    public void setNama(String nama) {
        // Algoritma
        this.nama = nama;
    }

    public void setNim(String nim) {
        // Algoritma
        this.nim = nim;
    }

    public void setProgramStudi() {
        // Algoritma
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String programStudi) {
        // Algoritma
        this.programStudi = programStudi;
    }

    public void setProgramStudi(Mahasiswa mahasiswa) {
        // Algoritma
        this.programStudi = mahasiswa.getProgramStudi();
    }

    public void printInfo() {
        // Algoritma
        System.out.println("Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", programStudi='" + programStudi + '\'' +
                '}');
    }
}

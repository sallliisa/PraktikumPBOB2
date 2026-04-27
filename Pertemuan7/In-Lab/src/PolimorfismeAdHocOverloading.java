public class PolimorfismeAdHocOverloading {
	public static void main(String[] args) {
        // a) di Mahasiswa.java
        
		// c)
        System.out.println("Instansiasi tanpa parameter:");
		Mahasiswa mDefault = new Mahasiswa();
		mDefault.printInfo();

		// d)
        System.out.println("Instansiasi dengan parameter:");
		Mahasiswa mParam = new Mahasiswa("240001", "Budi", "Informatika");
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
		Mahasiswa mClone = new Mahasiswa(mParam);
		mClone.printInfo();
	}
}

class Mahasiswa {
    private String nim;
    private String nama;
    private String programStudi;

    public Mahasiswa() {
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa mahasiswaLain) {
        this.nim = mahasiswaLain.getNim();
        this.nama = mahasiswaLain.getNama();
        this.programStudi = mahasiswaLain.getProgramStudi();
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public void setProgramStudi(Mahasiswa mahasiswa) {
        this.programStudi = mahasiswa.getProgramStudi();
    }

    public void printInfo() {
        System.out.println("Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", programStudi='" + programStudi + '\'' +
                '}');
    }
}

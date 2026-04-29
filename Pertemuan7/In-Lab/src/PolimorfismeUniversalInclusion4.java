public class PolimorfismeUniversalInclusion4 {
	static abstract class CivitasAkademika {
		private String nama;

		public CivitasAkademika(String nama) {
			// Algoritma
			this.nama = nama;
		}

		public String getNama() {
			// Algoritma
			return nama;
		}

		public void setNama(String nama) {
			// Algoritma
			this.nama = nama;
		}

		public abstract String getNomor();
	}

	static class Dosen extends CivitasAkademika {
		private String nip;

		public Dosen(String nama, String nip) {
			// Algoritma
			super(nama);
			this.nip = nip;
		}

		public String getNip() {
			// Algoritma
			return nip;
		}

		public void setNip(String nip) {
			// Algoritma
			this.nip = nip;
		}

		@Override
		public String getNomor() {
			// Algoritma
			return nip;
		}
	}

	static class Mahasiswa extends CivitasAkademika {
		private String nim;
		private Dosen dosenwali;

		public Mahasiswa(String nama, String nim, Dosen dosenwali) {
			// Algoritma
			super(nama);
			this.nim = nim;
			this.dosenwali = dosenwali;
		}

		public void setNim(String nim) {
			// Algoritma
			this.nim = nim;
		}

		public Dosen getDosenwali() {
			// Algoritma
			return dosenwali;
		}

		public void setWali(Dosen dosenwali) {
			// Algoritma
			this.dosenwali = dosenwali;
		}

		public void tampilDataMahasiswa() {
			// Algoritma
			System.out.println(
                "NIM: " + nim +
                "\nNama: " + getNama() + 
                "\nDosen Wali: " + (dosenwali == null ? "-" : dosenwali.getNama())
            );
		}

		@Override
		public String getNomor() {
			// Algoritma
			return nim;
		}
	}

	static class Seminar {
		private static final int MAKS_PESERTA = 100;
		private CivitasAkademika[] pesertas;
		private int banyakpeserta;

		public Seminar() {
			// Algoritma
			this.pesertas = new CivitasAkademika[MAKS_PESERTA];
			this.banyakpeserta = 0;
		}

		public int countPeserta() {
			// Algoritma
			return banyakpeserta;
		}

		public boolean registrasi(CivitasAkademika peserta) {
			// Algoritma
			if (peserta == null || banyakpeserta >= MAKS_PESERTA) {
				return false;
			}

			pesertas[banyakpeserta] = peserta;
			banyakpeserta++;
			return true;
		}

		public void tampilPeserta() {
			// Algoritma
			System.out.println("Daftar Peserta:");
			for (int i = 0; i < banyakpeserta; i++) {
				System.out.println((i + 1) + ". " + pesertas[i].getNomor() + " | " + pesertas[i].getNama());
			}
		}

		public int countMahasiswa() {
			// Algoritma
			int jumlahMahasiswa = 0;
			for (int i = 0; i < banyakpeserta; i++) {
				if (pesertas[i] instanceof Mahasiswa) {
					jumlahMahasiswa++;
				}
			}
			return jumlahMahasiswa;
		}
	}

	public static void main(String[] args) {
		// Kamus
		Dosen dosen1, dosen2;
		Mahasiswa m1, m2, m3, m4, m5;
		Seminar seminar;

		// Algoritma
		dosen1 = new Dosen("Dr. Zain", "198001012005012001");
		dosen2 = new Dosen("Dr. Yann", "197912122004011002");
		m1 = new Mahasiswa("Andi", "240001", dosen1);
		m2 = new Mahasiswa("Beni", "240002", dosen1);
		m3 = new Mahasiswa("Citra", "240003", dosen2);
		m4 = new Mahasiswa("Dina", "240004", dosen2);
		m5 = new Mahasiswa("Eka", "240005", dosen1);

		seminar = new Seminar();

		seminar.registrasi(dosen1);
		seminar.registrasi(dosen2);
		seminar.registrasi(m1);
		seminar.registrasi(m2);
		seminar.registrasi(m3);
		seminar.registrasi(m4);
		seminar.registrasi(m5);

		System.out.println("Jumlah peserta seminar: " + seminar.countPeserta() + " (" + seminar.countMahasiswa() + " mahasiswa)");
		seminar.tampilPeserta();

		System.out.println();
		System.out.println("Ubah dosen wali Beni ke Dr. Yann...");
		m2.setWali(dosen2);
        System.out.println("Data Mahasiswa");
		m1.tampilDataMahasiswa();
		m2.tampilDataMahasiswa();
		m3.tampilDataMahasiswa();
		m4.tampilDataMahasiswa();
		m5.tampilDataMahasiswa();
	}
}
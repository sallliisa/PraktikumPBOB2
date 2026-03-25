/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi,yang akan menolak input
 *             jari-jari lingkaran yang bernilai nol
 * Pembuat       : M. Ghani Aryasuta (24060121120026)
 * Tanggal       : 25 Maret 2026
 */

// class Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        // Asersi seharusnya tidak digunakan untuk validasi input, melainkan untuk
        // mendeteksi kesalahan logika dalam program. Namun, dalam contoh ini, asersi digunakan
        // untuk validasi input jariJari untuk memastikan bahwa nilanya tidak nol.
        // Dengan asumsi kode ini dijalankan "di production", akan dipastikan program tidak akan
        // dijalankan dengan -ea, sehingga asersi tidak akan aktif, dan program akan berjalan
        // tanpa memeriksa nilai jariJari. Seharusnya, validasi input lebih baik digunakan
        // dengan if statement/mekanisme lain yang sesuai untuk memastikan validitas nilai jariJari.
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!!";

        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

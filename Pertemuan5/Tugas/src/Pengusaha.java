/*
 * Nama File     : Pengusaha.java
 * Deskripsi     : class merepresentasikan pengusaha inherited dari Manusia.
 * Pembuat       : M. Ghani Aryasuta (24060121120026)
 * Tanggal       : 19 Februari 2026
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNPWP() {
        return npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    public void setNPWP(String npwp) {
        this.npwp = npwp;
    }

    @Override
    public double hitungPajak() {
        return getPendapatan() * 0.15;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NPWP: " + npwp);
    }

    @Override
    public int hitungMasaKerja() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate mulaiKerja = LocalDate.parse(getTglMulaiKerja(), formatter);
        int masaKerja = Period.between(mulaiKerja, LocalDate.now()).getYears();
        return masaKerja + 2; // 24060121120026
    }
}

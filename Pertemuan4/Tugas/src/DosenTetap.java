/*
 * Nama File     : DosenTetap.java
 * Deskripsi     : class merepresentasikan dosen tetap.
 * Pembuat       : M. Ghani Aryasuta (24060121120026)
 * Tanggal       : 19 Februari 2026
 */

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private static int BUP = 65;
    private String NIDN;

    public DosenTetap(
        String NIP,
        String NIDN,
        String nama,
        LocalDate tanggalLahir,
        LocalDate TMT,
        double gajiPokok,
        String fakultas
    ) {
        super(
            NIP,
            nama,
            tanggalLahir,
            TMT,
            BUP,
            tanggalLahir.plusYears(BUP).plusMonths(1),
            gajiPokok,
            "Dosen Tetap",
            fakultas
        );
        this.NIDN = NIDN;
    }

    public String getNIDN() {
        return this.NIDN;
    }

    public LocalDate getTanggalPensiun() {
        return super.getTanggalPensiun();
    }

    public double getTunjangan() {
        return 0.02 * getMasaKerja().getYears() * getGajiPokok();
    }

    public void printInfo() {
        System.out.println("NIP: " + getNIP());
        System.out.println("NIDN: " + this.NIDN);
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Lahir: " + Utils.formatDate(getTanggalLahir()));
        System.out.println("TMT: " + Utils.formatDate(getTMT()));
        System.out.println("Jabatan: " + getJabatan());
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Masa Kerja: " + Utils.formatMasaKerja(getMasaKerja()));
        System.out.println("Tanggal Pensiun: " + Utils.formatDate(getTanggalPensiun()));
        System.out.println("Gaji Pokok: " + Utils.formatRupiah(getGajiPokok()));
        System.out.println("Tunjangan: 2% x " + getMasaKerja().getYears() + " x " + Utils.formatRupiah(getGajiPokok()) + " = " + Utils.formatRupiah(getTunjangan()));
    }
}

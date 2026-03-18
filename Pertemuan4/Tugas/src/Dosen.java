/*
 * Nama File     : Dosen.java
 * Deskripsi     : class merepresentasikan dosen inherited dari Pegawai.
 * Pembuat       : M. Ghani Aryasuta (24060121120026)
 * Tanggal       : 19 Februari 2026
 */

import java.time.LocalDate;

public class Dosen extends Pegawai {
    private String fakultas;

    public Dosen(
        String NIP,
        String nama,
        LocalDate tanggalLahir,
        LocalDate TMT,
        int BUP,
        LocalDate tanggalPensiun,
        double gajiPokok,
        String jabatan,
        String fakultas
    ) {
        super(NIP, nama, tanggalLahir, TMT, BUP, tanggalPensiun, gajiPokok, jabatan);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }
}

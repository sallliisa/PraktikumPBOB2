import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    private String NIP;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate TMT;
    private int BUP;
    private LocalDate tanggalPensiun;
    private double gajiPokok;
    private String jabatan;

    public Pegawai(
        String NIP,
        String nama,
        LocalDate tanggalLahir,
        LocalDate TMT,
        int BUP,
        LocalDate tanggalPensiun,
        double gajiPokok,
        String jabatan
    ) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.BUP = BUP;
        this.tanggalPensiun = tanggalPensiun;
        this.gajiPokok = gajiPokok;
        this.jabatan = jabatan;
    }

    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public LocalDate getTMT() {
        return TMT;
    }

    public int getBUP() {
        return BUP;
    }

    public LocalDate getTanggalPensiun() {
        return tanggalPensiun;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public String getJabatan() {
        return jabatan;
    }

    public Period getMasaKerja() {
        return Period.between(TMT, LocalDate.now());
    }
}

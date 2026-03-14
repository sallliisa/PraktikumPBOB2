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

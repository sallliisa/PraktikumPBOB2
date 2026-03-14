import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    private String NIDK;

    public DosenTamu(
        String NIP, 
        String NIDK,
        String nama,
        LocalDate tanggalLahir,
        LocalDate TMT,
        double gajiPokok,
        String fakultas,
        LocalDate tanggalBerakhirKontrak
    ) {
        super(
            NIP,
            nama,
            tanggalLahir,
            TMT,
            getUsiaKontrakBerakhir(tanggalLahir, tanggalBerakhirKontrak),
            tanggalBerakhirKontrak,
            gajiPokok,
            "Dosen Tamu",
            fakultas
        );
        this.NIDK = NIDK;
    }

    private static int getUsiaKontrakBerakhir(LocalDate tanggalLahir, LocalDate tanggalBerakhirKontrak) {
        return Period.between(tanggalLahir, tanggalBerakhirKontrak).getYears();
    }

    public String getNIDK() {
        return NIDK;
    }

    public String getSisaKontrak() {
        Period sisaKontrak = Period.between(LocalDate.now(), getTanggalPensiun());
        if (getTanggalPensiun().isBefore(LocalDate.now())) {
            return "Kontrak sudah berakhir";
        }
        return sisaKontrak.getYears() + " tahun " + sisaKontrak.getMonths() + " bulan";
    }

    public double getTunjangan() {
        return 0.025 * getGajiPokok();
    }

    public void printInfo() {
        System.out.println("NIP: " + getNIP());
        System.out.println("NIDK: " + NIDK);
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Lahir: " + Utils.formatDate(getTanggalLahir()));
        System.out.println("TMT: " + Utils.formatDate(getTMT()));
        System.out.println("Jabatan: " + getJabatan());
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Masa Kerja: " + Utils.formatMasaKerja(getMasaKerja()));
        System.out.println("Tanggal Berakhir Kontrak: " + Utils.formatDate(getTanggalPensiun()));
        System.out.println("Sisa Kontrak: " + getSisaKontrak());
        System.out.println("Gaji Pokok: " + Utils.formatRupiah(getGajiPokok()));
        System.out.println("Tunjangan: 2.5% x " + Utils.formatRupiah(getGajiPokok()) + " = " + Utils.formatRupiah(getTunjangan()));
    }
}

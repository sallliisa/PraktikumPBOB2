import java.time.LocalDate;

public class Tendik extends Pegawai {
    private static int BUP = 55;
    private String bidang;

    public Tendik(
        String NIP,
        String nama,
        LocalDate tanggalLahir,
        LocalDate TMT,
        double gajiPokok,
        String bidang
    ) {
        super(
            NIP,
            nama,
            tanggalLahir,
            TMT,
            BUP,
            tanggalLahir.plusYears(BUP).plusMonths(1),
            gajiPokok,
            "Tenaga Kependidikan"
        );
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public LocalDate getTanggalPensiun() {
        return super.getTanggalPensiun();
    }

    public double getTunjangan() {
        return 0.01 * getMasaKerja().getYears() * getGajiPokok();
    }

    public void printInfo() {
        System.out.println("NIP: " + getNIP());
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Lahir: " + Utils.formatDate(getTanggalLahir()));
        System.out.println("TMT: " + Utils.formatDate(getTMT()));
        System.out.println("Jabatan: " + getJabatan());
        System.out.println("Bidang: " + bidang);
        System.out.println("Masa Kerja: " + Utils.formatMasaKerja(getMasaKerja()));
        System.out.println("Tanggal Pensiun: " + Utils.formatDate(getTanggalPensiun()));
        System.out.println("Gaji Pokok: " + Utils.formatRupiah(getGajiPokok()));
        System.out.println("Tunjangan: 1% x " + getMasaKerja().getYears() + " x " + Utils.formatRupiah(getGajiPokok()) + " = " + Utils.formatRupiah(getTunjangan())
        );
    }
}

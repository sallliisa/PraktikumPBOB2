import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, String tgl_mulai_kerja, double pendapatan, String nip) {
        this(nama, tgl_mulai_kerja, "-", pendapatan, nip);
    }

    public String getNIP() {
        return nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    public void setNIP(String nip) {
        this.nip = nip;
    }

    public static void setCounterPNS(int counterPNS) {
        PNS.counterPNS = counterPNS;
    }

    @Override
    public double hitungPajak() {
        return getPendapatan() * 0.1;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIP: " + nip);
    }

    @Override
    public int hitungMasaKerja() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate mulaiKerja = LocalDate.parse(getTglMulaiKerja(), formatter);
        int masaKerja = Period.between(mulaiKerja, LocalDate.now()).getYears();
        return masaKerja + 6; // 24060121120026
    }
}

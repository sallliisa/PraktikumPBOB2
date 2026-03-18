import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota() {
        return asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }

    @Override
    public int hitungMasaKerja() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate mulaiKerja = LocalDate.parse(getTglMulaiKerja(), formatter);
        int masaKerja = Period.between(mulaiKerja, LocalDate.now()).getYears();
        return masaKerja + 0; // 24060121120026
    }
}

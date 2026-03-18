/*
 * Nama File     : Kendaraan.java
 * Deskripsi     : class merepresentasikan data kendaraan.
 * Pembuat       : M. Ghani Aryasuta (24060121120026)
 * Tanggal       : 19 Februari 2026
 */

public class Kendaraan {
    private String noPlat;
    private String jenis;

    public Kendaraan() {
        this("", "");
    }

    public Kendaraan(String noPlat, String jenis) {
        if (jenis == null || (!jenis.toLowerCase().equals("motor") && !jenis.toLowerCase().equals("mobil"))) {
            throw new IllegalArgumentException("Jenis kendaraan tidak valid. (motor/mobil)");
        }
        this.noPlat = noPlat;   
        this.jenis = jenis.toLowerCase();
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void printKendaraan() {
        System.out.println("No Plat: " + noPlat);
        System.out.println("Jenis: " + jenis);
    }
}

/*
 * Nama File     : Dosen.java
 * Deskripsi     : class merepresentasikan data dosen.
 * Pembuat       : M. Ghani Aryasuta (24060121120026)
 * Tanggal       : 19 Februari 2026
 */

public class Dosen {
    private String NIP;
    private String nama;
    private String prodi;

    public Dosen() {
        this("", "", "");
    }

    public Dosen(String NIP, String nama, String prodi) {
        this.NIP = NIP;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNip(String NIP) {
        this.NIP = NIP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void printDosen() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
}

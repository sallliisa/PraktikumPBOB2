/*
 * Nama File     : Manusia.java
 * Deskripsi     : class abstract merepresentasikan data manusia.
 * Pembuat       : M. Ghani Aryasuta (24060121120026)
 * Tanggal       : 19 Februari 2026
 */

public abstract class Manusia {
    protected String nama;
    protected String tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getAlamat() {
        return alamat;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public String getNama() {
        return nama;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public String getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }

     public void setAlamat(String alamat) {
         this.alamat = alamat;
     }

     public static void setCounterMns(int counterMns) {
         Manusia.counterMns = counterMns;
     }

     public void setNama(String nama) {
         this.nama = nama;
     }

     public void setPendapatan(double pendapatan) {
         this.pendapatan = pendapatan;
     }

     public void setTglMulaiKerja(String tgl_mulai_kerja) {
         this.tgl_mulai_kerja = tgl_mulai_kerja;
     }

     public void printInfo() {
         System.out.println("Nama: " + nama);
         System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
         System.out.println("Alamat: " + alamat);
         System.out.println("Pendapatan: " + pendapatan);
     }

     public void cetakInfo() {
         printInfo();
     }

     public abstract int hitungMasaKerja();
}

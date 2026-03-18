/*
 * Nama File     : Mahasiswa.java
 * Deskripsi     : class merepresentasikan data mahasiswa.
 * Pembuat       : M. Ghani Aryasuta (24060121120026)
 * Tanggal       : 19 Februari 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa() {
        this("", "", "", "", "");
    }

    public Mahasiswa(String nim, String nama, String prodi, String jenisKendaraan, String noPlatKendaraan) {
        this(nim, nama, prodi, new ArrayList<>(), null, new Kendaraan(noPlatKendaraan, jenisKendaraan));
    }

    public Mahasiswa(String nim, String nama, String prodi, ArrayList<MataKuliah> listMatKul, Dosen dosenWali, Kendaraan kendaraan) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = listMatKul;
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
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

    public ArrayList<MataKuliah> getListMatKul() {
        return listMatKul;
    }

    public void setListMatKul(ArrayList<MataKuliah> listMatKul) {
        this.listMatKul = listMatKul;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah mataKuliah) {
        this.listMatKul.add(mataKuliah);
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < this.listMatKul.size(); i++) {
            totalSKS += this.listMatKul.get(i).getSks();
        }
        return totalSKS;
    }

    public int getJumlahMatKul() {
        return this.listMatKul.size();
    }

    public void printMhs() {
        System.out.println("NIM: " + this.nim);
        System.out.println("Nama: " + this.nama);
        System.out.println("Prodi: " + this.prodi);
    }

    public void printDetailMhs() {
        System.out.println("==============================");
        this.printMhs();
        System.out.println("==============================");
        System.out.println("Mata Kuliah yang Diambil (" + this.listMatKul.size() + ")");
        for (int i = 0; i < this.listMatKul.size(); i++) {
            System.out.println(this.listMatKul.get(i).getNama());
        }
        System.out.println("==============================");
        System.out.println("Informasi Dosen Wali");
        this.dosenWali.printDosen();
        System.out.println("==============================");
        System.out.println("Informasi Kendaraan Mahasiswa");
        this.kendaraan.printKendaraan();
    }
}

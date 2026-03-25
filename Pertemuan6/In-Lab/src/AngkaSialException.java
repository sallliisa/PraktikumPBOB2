/**
 * File      : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, untuk menolak masukan angka 13!
 * Pembuat       : M. Ghani Aryasuta (24060121120026)
 * Tanggal       : 25 Maret 2026
 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}

/**
 * File : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             Pengenalan klausa 'throw' dan 'throws'
 * Pembuat       : M. Ghani Aryasuta (24060121120026)
 * Tanggal       : 25 Maret 2026
 */
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
// Apabila terjadi exception di cobaAngka() saat eksekusi, maka line 12 akan
// tidak dieksekusi karena terjadi exception (jenis AngkaSialException) yang
// kemudian dihandle oleh catch block di caller methodnya.

// 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
// Ya, dikarenakan terdapat call cobaAngka(13), yang akan menthrow
// AngkaSialException, yang kemudian akan dihandle di catch block (line 21).
// Setelah program memasuki catch block dikarenakan call cobaAngka(13), 
// try tidak akan lanjut dieksekusi sehingga cobaAngka(12) tidak akan dieksekusi.
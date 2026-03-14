import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap(
                "9545647548",
                "78647324",
                "Andi",
                LocalDate.of(1990, 5, 5),
                LocalDate.of(2015, 1, 1),
                5_000_000,
                "Fakultas Sains dan Matematika");

        DosenTamu dosenTamu = new DosenTamu(
                "8654321789",
                "11223344",
                "Budi",
                LocalDate.of(1988, 8, 17),
                LocalDate.of(2021, 9, 1),
                4_500_000,
                "Fakultas Teknik",
                LocalDate.of(2026, 12, 31));

        Tendik tendik = new Tendik(
                "197812102005011002",
                "Citra",
                LocalDate.of(1987, 12, 10),
                LocalDate.of(2010, 2, 1),
                4_200_000,
                "Kemahasiswaan");

        dosenTetap.printInfo();
        System.out.println();
        dosenTamu.printInfo();
        System.out.println();
        tendik.printInfo();
    }
}

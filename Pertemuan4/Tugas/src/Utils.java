import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.Period;

public class Utils {
    private static String[] months = {
        "Januari", "Februari", "Maret", "April", "Mei", "Juni",
        "Juli", "Agustus", "September", "Oktober", "November", "Desember"
    };

    private Utils() {
        
    }

    public static String formatDate(LocalDate date) {
        return date.getDayOfMonth() + " " + months[date.getMonthValue() - 1] + " " + date.getYear();
    }

    public static String formatMasaKerja(Period masaKerja) {
        return masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan";
    }

    // Ini AI generated
    public static String formatRupiah(double nominal) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        symbols.setDecimalSeparator(',');

        DecimalFormat formatter = new DecimalFormat("Rp #,##0.00", symbols);
        return formatter.format(nominal);
    }
}
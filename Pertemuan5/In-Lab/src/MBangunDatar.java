public class MBangunDatar {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(6, "Merah", "Hitam");
        Lingkaran lingkaran = new Lingkaran(14, "Biru", "Putih");
        IResize iResizePersegi = persegi;
        IResize iResizeLingkaran = lingkaran;

        System.out.println();
        System.out.println("====== Persegi");
        persegi.printInfo();
        persegi.setSisi(8);
        System.out.println("Luas:" + persegi.getLuas());
        System.out.println("Keliling:" + persegi.getKeliling());
        System.out.println("== setSisi(8)");
        persegi.printInfo();
        System.out.println("Luas:" + persegi.getLuas());
        System.out.println("Keliling:" + persegi.getKeliling());

        System.out.println("== IResize Persegi");
        iResizePersegi.zoomIn();
        System.out.println("zoomIn():");
        persegi.printInfo();
        iResizePersegi.zoomOut();
        System.out.println("zoomOut():");
        persegi.printInfo();
        iResizePersegi.zoom(200);
        System.out.println("zoom(200):");
        persegi.printInfo();

        System.out.println();
        System.out.println("====== Lingkaran");
        lingkaran.printInfo();
        lingkaran.setJari(10);
        System.out.println("Luas:" + lingkaran.getLuas());
        System.out.println("Keliling:" + lingkaran.getKeliling());
        System.out.println("== setJari(10)");
        lingkaran.printInfo();
        System.out.println("Luas:" + lingkaran.getLuas());
        System.out.println("Keliling:" + lingkaran.getKeliling());

        System.out.println("== IResize Lingkaran");
        iResizeLingkaran.zoomIn();
        System.out.println("zoomIn():");
        lingkaran.printInfo();
        iResizeLingkaran.zoomOut();
        System.out.println("zoomOut():");
        lingkaran.printInfo();
        iResizeLingkaran.zoom(50);
        System.out.println("zoom(50):");
        lingkaran.printInfo();

        System.out.println();
        System.out.println("persegi.isEqualLuas(lingkaran): " + persegi.isEqualLuas(lingkaran));
        System.out.println("persegi.isEqualKeliling(lingkaran): " + persegi.isEqualKeliling(lingkaran));

        System.out.println();
        persegi.printCounterBangunDatar();
        lingkaran.printCounterBangunDatar();
    }
}

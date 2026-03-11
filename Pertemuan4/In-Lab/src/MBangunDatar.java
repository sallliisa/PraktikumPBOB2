public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        bangunDatar.setJmlSisi(0);
        bangunDatar.setWarna("Transparan");
        bangunDatar.setBorder("Hitam");

        Persegi persegi = new Persegi(6, "Merah", "Hitam");
        Lingkaran lingkaran = new Lingkaran(14, "Biru", "Putih");

        System.out.println("====== Bangun Datar");
        bangunDatar.printInfo();

        System.out.println();
        System.out.println("====== Persegi");
        persegi.printInfo();
        persegi.setSisi(8);
        System.out.println("== setSisi(8)");
        persegi.printInfo();

        System.out.println();
        System.out.println("====== Lingkaran");
        lingkaran.printInfo();
        lingkaran.setJari(10);
        System.out.println("== setJari(10)");
        lingkaran.printInfo();

        System.out.println();
        bangunDatar.printCounterBangunDatar();
    }
}

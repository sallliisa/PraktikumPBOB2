public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi() {
        this(0, "", "");
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    @Override
    public void zoomIn() {
        zoom(10);
    }

    @Override
    public void zoomOut() {
        zoom(-10);
    }

    @Override
    public void zoom(int percent) {
        sisi = sisi + (sisi * percent / 100.0);
    }
}

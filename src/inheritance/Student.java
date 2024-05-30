package inheritance;


public class Student extends Person {
    private double notOrtalamasi;

    public Student(String ad, String soyad, int yas, String kimlikNumarasi, double notOrtalamasi) {
        super(ad, soyad, yas, kimlikNumarasi);
        this.notOrtalamasi = notOrtalamasi;
    }

    public double getNotOrtalamasi() {
        return notOrtalamasi;
    }

    public void setNotOrtalamasi(double notOrtalamasi) {
        this.notOrtalamasi = notOrtalamasi;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Not Ortalaması: " + notOrtalamasi);
    }
}
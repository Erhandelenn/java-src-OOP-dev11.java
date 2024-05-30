package inheritance;

public class Staff extends Person {
    private String gorevAlani;

    public Staff(String ad, String soyad, int yas, String kimlikNumarasi, String gorevAlani) {
        super(ad, soyad, yas, kimlikNumarasi);
        this.gorevAlani = gorevAlani;
    }

    public String getGorevAlani() {
        return gorevAlani;
    }

    public void setGorevAlani(String gorevAlani) {
        this.gorevAlani = gorevAlani;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Görev Alanı: " + gorevAlani);
    }
}
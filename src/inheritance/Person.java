package inheritance;
public abstract class Person {
    private final String ad;
    private final String soyad;
    private final int yas;
    private final String kimlikNumarasi;

    public Person(String ad, String soyad, int yas, String kimlikNumarasi) {
        if (ad == null || ad.isEmpty()) {
            throw new IllegalArgumentException("Ad boş olamaz.");
        }
        if (soyad == null || soyad.isEmpty()) {
            throw new IllegalArgumentException("Soyad boş olamaz.");
        }
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.kimlikNumarasi = kimlikNumarasi;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getYas() {
        return yas;
    }

    public String getKimlikNumarasi() {
        return kimlikNumarasi;
    }

    public void print() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Yaş: " + yas);
        System.out.println("Kimlik Numarası: " + kimlikNumarasi);
    }
}
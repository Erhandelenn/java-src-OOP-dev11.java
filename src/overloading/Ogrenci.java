package overloading;

public class Ogrenci {
    private final String ad;
    private final String soyad;
    private int okulNo;
    private String sinif;
    private int not1;
    private int not2;
    private int not3;
    public Ogrenci(String ad, String soyad) {
        if (ad == null || ad.isEmpty()) {
            throw new IllegalArgumentException("Ad boş veya null olamaz.");
        }
        if (soyad == null || soyad.isEmpty()) {
            throw new IllegalArgumentException("Soyad boş veya null olamaz.");
        }
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public int getNot1() {
        return not1;
    }

    public void setNot1(int not1) {
        this.not1 = not1;
    }

    public int getNot2() {
        return not2;
    }

    public void setNot2(int not2) {
        this.not2 = not2;
    }

    public int getNot3() {
        return not3;
    }

    public void setNot3(int not3) {
        this.not3 = not3;
    }

    public void setNot(int not1) {
        this.not1 = not1;
    }

    public void setNot(int not1, int not2) {
        this.not1 = not1;
        this.not2 = not2;
    }

    public void setNot(int not1, int not2, int not3) {
        this.not1 = not1;
        this.not2 = not2;
        this.not3 = not3;
    }

    public static void main(String[] args) {
        Ogrenci student = new Ogrenci("Erhan", "Delen");
        student.setOkulNo(1922120049);
        student.setSinif("B");
        student.setNot1(85);
        student.setNot2(100);
        student.setNot3(68);

        System.out.println("Öğrencinin Adı: " + student.getAd());
        System.out.println("Öğrencinin Soyadı: " + student.getSoyad());
        System.out.println("Öğrencinin Sınıfı: " + student.getSinif());
        System.out.println("Öğrencinin Not1: " + student.getNot1());
        System.out.println("Öğrencinin Not2: " + student.getNot2());
        System.out.println("Öğrencinin Not3: " + student.getNot3());
    }
}
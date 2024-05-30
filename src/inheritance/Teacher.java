package inheritance;

import java.util.List;

public class Teacher extends Person {

        private String bolum;
        private List<String> dersler;

        public Teacher(String ad, String soyad, int yas, String kimlikNumarasi, String bolum, List<String> dersler) {
            super(ad, soyad, yas, kimlikNumarasi);
            this.bolum = bolum;
            this.dersler = dersler;
        }

        public String getBolum() {
            return bolum;
        }

        public void setBolum(String bolum) {
            this.bolum = bolum;
        }

        public List<String> getDersler() {
            return dersler;
        }

        public void setDersler(List<String> dersler) {
            this.dersler = dersler;
        }

        @Override
        public void print() {
            super.print();
            System.out.println("Bölüm: " + bolum);
            System.out.println("Dersler: " + String.join(", ", dersler));
        }
    }
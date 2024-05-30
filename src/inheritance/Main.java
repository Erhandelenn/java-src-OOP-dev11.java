package inheritance;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student ogrenci = new Student("Erhan", "Delen", 25, "50212695658", 2.82);

        Teacher ogretmen = new Teacher("Bilal", "Demir", 32, "35632145879",
                "Bilgisayar Mühendisliği", Arrays.asList("Java", " SQl ", "BackEnd"));

        Staff gorevli = new Staff("Mehmet", "Ekşi", 50, "26598741268", "Hademe");


        Person[] kisiler = {ogrenci, ogretmen, gorevli};

        for (Person kisi : kisiler) {
            kisi.print();
            System.out.println("****************************");
       }
    }
}
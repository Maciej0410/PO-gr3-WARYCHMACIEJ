package com.company;
import pl.imiajd.warych.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("hello");
        Punkt pkt = new Punkt(7,3);
        pkt.show();

        System.out.println(pkt.x());
        System.out.println(pkt.y());

        NazwanyPunkt pkt2 = new NazwanyPunkt(12,8, "punktv2");
        pkt2.show();



//        Adres adres1 = new Adres();
//        Adres adres2 = new Adres();
//        adres1.Adres_z_nr("Kwiatowa", "8", "2", "Myszyniec", "07-430");
//        adres2.Adres_bez_nr("Stacha Konwy","8","Gdansk","80-008");
//        adres1.pokaz();
//        System.out.println(" ");
//        adres2.pokaz();



//        Osoba osoba1 = new Osoba("Warych", 2000);
//        Student student1 = new Student("Kurzyński", 1999, "Informatyja");
//        Nauczyciel nauczyciel1 = new Nauczyciel("Sokołowski", 1984, 3450);
//
//        osoba1.pokaz();
//        System.out.println(" ");
//        student1.pokaz();
//        System.out.println(" ");
//        nauczyciel1.pokaz();
//
//        System.out.println("\n nazwisko: " + osoba1.getNazwisko() + ", rok urodzenia: " + osoba1.getRokUrodzenia());
//        System.out.println("\n nazwisko: " + student1.getNazwisko() + ", rok urodzenia: " + student1.getRokUrodzenia() + ", kierunek: " + student1.getKierunek());
//        System.out.println("\n nazwisko: " + nauczyciel1.getNazwisko() + ", rok urodzenia: " + nauczyciel1.getRokUrodzenia() + ", pensja: " + nauczyciel1.getPensja());

    }
}

package com.company;
import java.lang.StringBuffer;
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Scanner;


class Char_zad {

    static int count_Char(String str, char c) {
        int licznik = 0;
        char znak_z_napisu;
        for (int i = 0; i < str.length(); i++) {
            znak_z_napisu = str.charAt(i);
            if (znak_z_napisu == c) {
                licznik++;
            }
        }

        return licznik;
    }

    static int coutn_SubStr(String str, String SubStr) {

        int licznik = 0;

        for (int i = 0; i < SubStr.length(); i++) {
            if (str.contains(SubStr)) {
                licznik++;
            }
        }

        return licznik;
    }

    static String middle(String str) {
        StringBuffer sb = new StringBuffer(str);
        StringBuffer napis = new StringBuffer();

        if (str.length() % 2 == 0) {
            napis.append(str.charAt(str.length() / 2 - 1)).append(str.charAt(str.length() / 2));
        }
        if (str.length() % 2 != 0) {
            napis.append(str.charAt(str.length() / 2));
        }

        return napis.toString();
    }

    static String repeat(String str, int n) {

        String temp = str;
        StringBuffer napis = new StringBuffer();

        for (int i = 0; i < n; i++) {
            napis.append(str + " ");
        }

        return napis.toString();
    }

    static int[] where(String str, String Substr) {
        int temp = coutn_SubStr(str, Substr);
        int[] tab = new int[temp];

        StringBuffer napis = new StringBuffer(Substr);

        int licznik = 0;

        for (int i = 0; i < napis.length(); i++) {
            if (str.contains(napis)) {
                tab[licznik] = i;
                licznik++;
            }

        }
        return tab;
    }
}

    public class Main {
        public static void wyswietl(int[] tab) {

            int i = 0;
            for (i = 0; i < tab.length; i++) {
                System.out.println("Tablica -> [" + i + ", " + "]");
            }
        }

        public static int ilosc_wystapien(String file, char znak) throws FileNotFoundException {
            int licznik = 0;
            Scanner tekst = new Scanner(new File(file));
            while (tekst.hasNext()) {
                String temp = tekst.next();
                for (int i = 0; i <= temp.length() - 1; i++) {
                    if (temp.charAt(i) == znak)
                        licznik++;
                }
            }
            return licznik;
        }

        public static int ilosc_wystapien_wyraz(String file, String wyraz) throws FileNotFoundException {
            int licznik = 0;
            Scanner tekst = new Scanner(new File(file));
            StringBuffer ten_wyraz = new StringBuffer(wyraz);
            while (tekst.hasNext()) {
                String temp = tekst.next();
                if (temp.equalsIgnoreCase(wyraz))
                    licznik++;
            }
            return licznik;
        }

        public static BigInteger nasiona(int n){
            BigInteger wynik = new BigInteger("0");
            BigInteger poprzedni = new BigInteger("1");
            BigInteger aktualny = new BigInteger("1");
            if(n != 0){
                for(int i = 1; i <=n; i++){
                    for(int j = 1; j<=n; j++) {
                        wynik = wynik.add(aktualny);
                        aktualny = poprzedni.multiply(new BigInteger("2"));
                        poprzedni = aktualny;
                    }
                }
            }
            return wynik;
        }

        public static BigDecimal odsetki(double k, double p, int n) {
            BigDecimal odsetki = new BigDecimal("1.0");
            odsetki = odsetki.add(new BigDecimal("" + p / 100)).pow(n).multiply(new BigDecimal("" + k)).multiply(new BigDecimal("" + k)).multiply(new BigDecimal("0.001"));
            return odsetki;
        }


        public static void main(String[] args) throws FileNotFoundException {
            char litera = 'c';

            String moj_napis = "cococcocococc cccc poco dlaczego";

            System.out.println("Znak powtarza sie -> " + Char_zad.count_Char(moj_napis, litera));


            String moj_napis_krotki = "ale";

            String moj_napis_zdanie = "ale ale ale";

            System.out.println("'ale' występuje w napisie -> " + Char_zad.coutn_SubStr(moj_napis_zdanie, moj_napis_krotki));
            String moj_napis_c = "middle";
            System.out.println("Srodkowe znaki lub znak -> " + Char_zad.middle(moj_napis_c));

            int n = 4;
            int n_2 = 7;
            String napis_d = "ho";
            String napis2_d = "hi";
            System.out.println("konkatenacja napisu -> " + Char_zad.repeat(napis_d, n) + "\n" + "konkatenacja napisu -> " + Char_zad.repeat(napis2_d, n_2));
            String napis_e = "mojetwojeoboje";
            String szukany = "oj";

            char znak='m';

            File file=new File("tekst.txt");

        System.out.println("Znak m wystepuje tyle razy -> "+ilosc_wystapien("C:\\Users\\macwa\\IdeaProjects\\lab4\\src\\tekst.txt",znak));

        String wyraz_zad3="Olsztyn";

        System.out.println("Wystapienie wyrazu Olsztyn w tekscie -> "+ ilosc_wystapien_wyraz("C:\\Users\\macwa\\IdeaProjects\\lab4\\src\\tekst.txt", wyraz_zad3));

        System.out.println("Nasiona -> "+nasiona(2));

        System.out.println("Odsetki -> "+odsetki(20000, 0.2,5));
        }

    }


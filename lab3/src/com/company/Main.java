package com.company;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;


//zad1a

//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Podaj liczbe n z zakresu 1<n<100: ");
//        int n=sc.nextInt();
//        int[] moja_tab=new int[n];
//        Random r = new Random();
//        int x;
//        int parzyste=0, nieparzyste=0;
//
//        for(int i=0;i<n;i++)
//        {
//            x=r.nextInt(1998)-999;
//
//            if(n>1&&n<100)
//            {
//                moja_tab[i]=x;
//            }
//            else
//            {
//                System.out.println("Niepoprawny zakres liczb");
//            }
//
//        }
//
//        for(int i=0;i<moja_tab.length;i++)
//        {
//            if(moja_tab[i]%2==0)
//            {
//                parzyste++;
//            }
//            else
//            {
//                nieparzyste++;
//            }
//        }
//
//        int licznik=0;
//        while (licznik<moja_tab.length)
//        {
//            System.out.println(moja_tab[licznik]+" ");
//            licznik++;
//        }
//
//        System.out.println("Liczb parzystych jest -> "+parzyste+" Liczb nieparzytych jest -> "+nieparzyste);
//
//
//    }
//
//}

// zad1b

//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Podaj liczbe n z zakresu 1<n<100: ");
//        int n=sc.nextInt();
//        int[] moja_tab=new int[n];
//        Random r = new Random();
//        int x;
//        int dodatnie=0, niedodatnie=0, zero=0;
//
//        for(int i=0;i<n;i++)
//        {
//            x=r.nextInt(1998)-999;
//
//            if(n>1&&n<100)
//            {
//                moja_tab[i]=x;
//            }
//            else
//            {
//                System.out.println("Niepoprawny zakres liczb");
//            }
//
//        }
//
//        for(int i=0;i<moja_tab.length;i++)
//        {
//            if(moja_tab[i]>0)
//            {
//                dodatnie++;
//            }
//            else if(moja_tab[i]<0)
//            {
//                niedodatnie++;
//            }
//            else
//            {
//                zero++;
//            }
//        }
//
//        int licznik=0;
//        while (licznik<moja_tab.length)
//        {
//            System.out.println(moja_tab[licznik]+" ");
//            licznik++;
//        }
//
//        System.out.println("Liczb dodatnich jest -> "+dodatnie+" Liczb niedodatnich jest -> "+niedodatnie+" Zer jest -> "+zero);
//
//
//    }
//
//}

//zad1c

//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Podaj liczbe n z zakresu 1<n<100: ");
//        int n = sc.nextInt();
//        int[] moja_tab = new int[n];
//        Random r = new Random();
//        int x;
//        int maks = 0;
//        int licze = 1;
//
//        for (int i = 0; i < n; i++) {
//            x = r.nextInt(1998) - 999;
//
//            if (n > 1 && n < 100) {
//                moja_tab[i] = x;
//            } else {
//                System.out.println("Niepoprawny zakres liczb");
//            }
//
//        }
//
//        for (int i = 0; i < moja_tab.length; i++) {
//            if (moja_tab[i] > maks) {
//                maks = moja_tab[i];
//
//            }
//        }
//
//        for(int j=0;j<moja_tab.length;j++)
//        {
//            if(maks==moja_tab[j])
//            {
//                licze++;
//            }
//            else {
//                break;
//            }
//        }
//
//                int licznik = 0;
//                while (licznik < moja_tab.length) {
//                    System.out.println(moja_tab[licznik] + " ");
//                    licznik++;
//                }
//
//                System.out.println("Najwiekszy element to -> " + maks + " Wystepuje on tyle razy -> " + licze);
//
//            }
//        }


//zad1d

//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Podaj liczbe n z zakresu 1<n<100: ");
//        int n=sc.nextInt();
//        int[] moja_tab=new int[n];
//        Random r = new Random();
//        int x;
//        int suma_dodatnie=0, suma_ujemne=0;
//
//        for(int i=0;i<n;i++)
//        {
//            x=r.nextInt(1998)-999;
//
//            if(n>1&&n<100)
//            {
//                moja_tab[i]=x;
//            }
//            else
//            {
//                System.out.println("Niepoprawny zakres liczb");
//            }
//
//        }
//
//        for(int i=0;i<moja_tab.length;i++)
//        {
//            if(moja_tab[i]>0)
//            {
//                suma_dodatnie+=moja_tab[i];
//            }
//            else
//            {
//                suma_ujemne+=moja_tab[i];
//            }
//
//        }
//
//        int licznik=0;
//        while (licznik<moja_tab.length)
//        {
//            System.out.println(moja_tab[licznik]+" ");
//            licznik++;
//        }
//
//        System.out.println("Suma liczb dodatnich -> "+suma_dodatnie+"\n Suma liczb ujemnych -> "+suma_ujemne);
//
//
//    }
//
//}

//zad1e


//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Podaj liczbe n z zakresu 1<n<100: ");
//        int n=sc.nextInt();
//        int[] moja_tab=new int[n];
//        Random r = new Random();
//        int x;
//        int dlugosc=1;
//
//        for(int i=0;i<n;i++)
//        {
//            x=r.nextInt(1998)-999;
//
//            if(n>1&&n<100)
//            {
//                moja_tab[i]=x;
//            }
//            else
//            {
//                System.out.println("Niepoprawny zakres liczb");
//            }
//
//        }
//
//        for(int i=0;i<moja_tab.length-1;i++)
//        {
//            if(moja_tab[i]>0&&moja_tab[i+1]>0) {
//                dlugosc++;
//            }
//
//        }
//
//        int licznik=0;
//        while (licznik<moja_tab.length)
//        {
//            System.out.println(moja_tab[licznik]+" ");
//            licznik++;
//        }
//
//        System.out.println("Dlugosc -> "+dlugosc);
//
//
//    }
//
//}

//zad1f

//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Podaj liczbe n z zakresu 1<n<100: ");
//        int n=sc.nextInt();
//        int[] moja_tab=new int[n];
//        Random r = new Random();
//        int x;
//
//
//        for(int i=0;i<n;i++)
//        {
//            x=r.nextInt(1998)-999;
//
//            if(n>1&&n<100)
//            {
//                moja_tab[i]=x;
//            }
//            else
//            {
//                System.out.println("Niepoprawny zakres liczb");
//            }
//
//        }
//
//        for(int i=0;i<moja_tab.length;i++)
//        {
//            if(moja_tab[i]>0)
//                moja_tab[i]=1;
//            else
//            {
//                moja_tab[i]=-1;
//            }
//
//
//        }
//
//        int licznik=0;
//        while (licznik<moja_tab.length)
//        {
//            System.out.println(moja_tab[licznik]+" ");
//            licznik++;
//        }
//
//
//    }
//
//}

//zad1g

//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Podaj liczbe n z zakresu 1<n<100: ");
//        System.out.println("\nPodaj lewy: ");
//        System.out.println("\npodaj prawy");
//        int n=sc.nextInt();
//        int lewy=sc.nextInt();
//        int prawy=sc.nextInt();
//        int[] moja_tab=new int[n];
//        Random r = new Random();
//        int x;
//        int suma_dodatnie=0, suma_ujemne=0;
//
//        for(int i=0;i<n;i++)
//        {
//            x=r.nextInt(1998)-999;
//
//            if(n>1&&n<100)
//            {
//                moja_tab[i]=x;
//            }
//            else
//            {
//                System.out.println("Niepoprawny zakres liczb");
//            }
//
//        }
//
//        moja_tab[0]=lewy;
//        int temp=moja_tab[0];
//        moja_tab[n-1]=prawy;
//        moja_tab[n-1]=temp;
//        moja_tab[0]=prawy;
//
//        int licznik=0;
//        while (licznik<moja_tab.length)
//        {
//            System.out.println(moja_tab[licznik]+" ");
//            licznik++;
//        }
//
//
//
//    }
//
//}

//zad2


//public class Main {
//    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc) {
//        Random r = new Random();
//        int x;
//        int wartosc = Math.abs(minWartosc) + maxWartosc;
//
//        for (int i = 1; i < tab.length; i++) {
//            x = r.nextInt(wartosc) - maxWartosc;
//            tab[i] = x;
//        }
//
//        int licznik = 0;
//        while (licznik < tab.length) {
//            System.out.println(tab[licznik] + " ");
//            licznik++;
//        }
//
//    }
//
//
//
//    public static int ile_Parzystych(int tab[])
//    {
//        int wynik=0;
//        for(int i=0;i<tab.length;i++)
//        {
//            if(tab[i]%2==0)
//            {
//                wynik++;
//            }
//        }
//        return wynik;
//    }
//    public static int ile_Nieparzystych(int tab[])
//    {
//        int wynik=0;
//        for(int i=0;i<tab.length;i++)
//        {
//            if(tab[i]%2!=0)
//            {
//                wynik++;
//            }
//        }
//        return wynik;
//    }
//
//    public static int ileZerowych(int tab[])
//    {
//        int wynik=0;
//        for(int i=0;i<tab.length;i++)
//        {
//            if(tab[i]==0)
//            {
//                wynik++;
//            }
//        }
//
//        return wynik;
//
//    }
//    public static int ileDodatnich(int tab[])
//    {
//        int wynik=0;
//        for(int i=0;i<tab.length;i++)
//        {
//            if(tab[i]>0)
//            {
//                wynik++;
//            }
//        }
//
//        return wynik;
//    }
//
//    public static int ileUjemnych(int tab[])
//    {
//        int wynik=0;
//        for(int i=0;i<tab.length;i++)
//        {
//            if(tab[i]<0)
//            {
//                wynik++;
//            }
//        }
//        return wynik;
//    }
//
//    public static int ileMaksymalnych(int tab[])
//    {
//        int wynik=0;
//        int maks=0;
//        for(int i=0;i<tab.length;i++)
//        {
//            if(maks<tab[i])
//            {
//                maks=tab[i];
//            }
//        }
//
//        for(int i=0;i<tab.length;i++)
//        {
//            if(tab[i]==maks)
//            {
//                wynik++;
//            }
//        }
//        return wynik;
//    }
//
//    public static int suma_Dodatnich(int tab[])
//    {
//        int wynik=0;
//        for(int i=0;i<tab.length;i++)
//        {
//            if(tab[i]>0)
//            {
//                wynik+=tab[i];
//            }
//        }
//        return wynik;
//    }
//
//    public static int suma_Ujemnych(int tab[])
//    {
//        int wynik=0;
//        for(int i=0;i<tab.length;i++)
//        {
//            if(tab[i]<0)
//            {
//                wynik+=tab[i];
//            }
//        }
//        return wynik;
//    }
//    public static int dlugosc_maks_ciaguDodatnich(int tab[])
//    {
//        int dlugosc=0;
//
//        for(int i=0;i<tab.length-1;i++)
//        {
//            if(tab[i]>0&&tab[i+1]>0)
//            {
//                dlugosc++;
//            }
//            else
//            {
//                dlugosc+=0;
//            }
//        }
//        return dlugosc;
//    }
//
//    public static void signum(int tab[])
//    {
//        for(int i=0;i<tab.length;i++)
//        {
//            if(tab[i]>0)
//            {
//                tab[i]=1;
//            }
//            else
//            {
//                tab[i]=-1;
//            }
//        }
//        for(int i=0;i<tab.length;i++)
//        {
//            System.out.println(tab[i]+" ");
//        }
//    }
//
//    public static void main(String[] args){
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Podaj liczbe n -> ");
//        int n=sc.nextInt();
//        int[] moja_tab=new int[n];
//        int minWartosc=-999;
//        int maxWartosc=999;
//        generuj(moja_tab,n,minWartosc,maxWartosc);
//        System.out.println("Zad 2a -> Liczb parzystych jest -> "+ile_Parzystych(moja_tab));
//        System.out.println("Zad 2a -> Liczb nieparzystych jest -> "+ile_Nieparzystych(moja_tab));
//        System.out.println("Zad 2b -> Liczb zerwoych jest -> "+ileZerowych(moja_tab));
//        System.out.println("Zad 2b -> Liczb dodatnich jest -> "+ileDodatnich(moja_tab));
//        System.out.println("Zad 2b -> Liczb ujemnych jest -> "+ileUjemnych(moja_tab));
//        System.out.println("Zad 2c -> Elementów maksymalnych jest -> "+ileMaksymalnych(moja_tab));
//        System.out.println("Zad 2d -> Suma elementów dodatnich -> "+suma_Dodatnich(moja_tab)+" Suma elementów ujemnych -> "+suma_Ujemnych(moja_tab));
//        System.out.println("Zad 2e -> Długość maksymamlnego ciągu tablicy -> "+dlugosc_maks_ciaguDodatnich(moja_tab));
//        signum(moja_tab);
//    }
//
//}

// zad3

public class Main {

    public static void generuj_macierz(int[][] macierz,int a, int b)
    {
        macierz=new int[a][b];
        Random r = new Random();
        for (int i = 1; i < macierz.length; i++) {
            for (int j = 1; j < macierz[i].length; j++) {
                macierz[i][j] = r.nextInt(20)-10; ;
            }
        }

    }

    public static void wypisz_macierz(int[][] macierz,int a, int b)
    {
        macierz=new int[a][b];
        Random r = new Random();
        for (int i = 1; i < macierz.length; i++) {
            for (int j = 1; j < macierz[i].length; j++) {
                System.out.println(macierz[i][j]+" ");
            }
        }

    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

            System.out.println("Podaj liczbe m z przedzialu [0;10]-> \n");
            System.out.println("Podaj liczbe n z przedzialu [0;10]-> \n");
            System.out.println("Podaj liczbe k z przedzialu [0;10]-> \n");

        int m=sc.nextInt();
        int n=sc.nextInt();
        int k=sc.nextInt();

        System.out.println("n -> "+m+" m -> "+n+" k -> "+k+" Wymiary tablic: "+m+"X"+n+" -> "+n+"X"+k);
        int[][] tab_1=new int[m][n];
        generuj_macierz(tab_1,m,n);

        wypisz_macierz(tab_1,m,n);

    }
}
package com.company;
import java.util.Scanner;
import java.lang.Math;



//zad1.1a

//public class Main {
//
//    public static void main(String[] args) {
//	Scanner scan = new Scanner(System.in);
//
//	System.out.println("Podaj liczbe calkowita n: ");
//	int n = scan.nextInt();
//    int wynik=0;
//
//
//        for(int i=1;i<=n;i++)
//        {
//            wynik+=i;
//            System.out.println(i);
//        }
//        System.out.println("Wynik dzialania: "+wynik);
//    }
//}

//zad1.1b

//public class Main{
//
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        int wynik=1;
//
//        for(int i=1;i<=n;i++)
//        {
//            wynik*=i;
//            System.out.println(i);
//        }
//
//        System.out.println("Wynik mnozenia: "+wynik);
//    }
//}

//zad1.1c

//public class Main{
//
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        int wynik=0;
//
//        for(int i=1;i<=n;i++)
//        {
//            wynik+=Math.abs(i);
//            System.out.println(Math.abs(i));
//
//        }
//
//        System.out.println("Wynik dodawania: "+wynik);
//    }
//}

// zad1.1d

//public class Main{
//
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        float wynik=0;
//
//        for(int i=1;i<=n;i++)
//        {
//            wynik+=Math.sqrt(Math.abs(i));
//            System.out.println(Math.sqrt(Math.abs(i)));
//        }
//
//        System.out.println("Wynik dodawania: "+wynik);
//    }
//}

// zad1.1e

//public class Main{
//
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        int wynik=1;
//
//        for(int i=1;i<=n;i++)
//        {
//            wynik*=Math.abs(i);
//            System.out.println(Math.abs(i));
//        }
//
//        System.out.println("Wynik mnozenia: "+wynik);
//    }
//}

//zad1.1f

//public class Main{
//
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        int wynik=0;
//
//        for(int i=1;i<=n;i++)
//        {
//            wynik+=Math.pow(i,2);
//            System.out.println(Math.pow(i,2));
//        }
//
//        System.out.println("Wynik dodawania: "+wynik);
//    }
//}

//zad1.1g

//public class Main{
//
//    public static int mnoze(int n)
//    {
//        int wynik=1;
//        for(int i=1;i<=n;i++)
//        {
//            wynik*=i;
//        }
//
//
//        return wynik;
//    }
//    public static int dodaje(int n)
//    {
//        int wynik=0;
//        for(int i=1;i<=n;i++)
//        {
//            wynik+=i;
//        }
//
//
//        return wynik;
//    }
//
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//
//        for(int i=1;i<=n;i++)
//        {
//            System.out.println(i);
//        }
//
//        System.out.println("Wynik dodawania: "+dodaje(n)+" oraz Wynik mnozenia: "+mnoze(n));
//
//
//    }
//}


//zad1.1h

//public class Main{
//
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        int wynik=0;
//        for(int i=1;i<=n;i++)
//        {
//            wynik+=Math.pow(-1,i+1)*i;
//        }
//        System.out.println(wynik);
//
//    }
//}

//zad1.1i

//public class Main{
//
//    public static int silnia(int n)
//    {
//        int wynik=1;
//
//        for(int i=1;i<=n;i++)
//        {
//            wynik*=i;
//        }
//
//        return wynik;
//    }
//
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        float wynik=0;
//
//        for(int i=1;i<=n;i++)
//        {
//            wynik+=(Math.pow(-1,i)*i)/silnia(i);
//        }
//
//        System.out.println(wynik);
//    }
//}


// zad1.2

//public class Main{
//
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        int[] moja_tablica =new int[n];
//
//        for(int i=0;i<moja_tablica.length;i++)
//        {
//            moja_tablica[i]=i+1;
//        }
//
//        int tmp=moja_tablica[0];
//        int ostatnia=moja_tablica.length;
//        moja_tablica[0]=moja_tablica[ostatnia-1];
//        moja_tablica[ostatnia-1]=tmp;
//        int licznik=0;
//
//        while(licznik<moja_tablica.length){
//            System.out.print(moja_tablica[licznik]+" ");
//            licznik++;
//        }
//
//    }
//}

//zad2.1a

//public class Main{
//
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        int wynik=0;
//        for(int i=1;i<=n;i++)
//        {
//            if(i%2!=0)
//            {
//                wynik++;
//            }
//        }
//        System.out.println(wynik);
//    }
//}

//zad2.1b

//public class Main{
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        int[] moja_tablica = new int[n];
//        int wynik=0;
//
//
//        for (int i = 1; i < moja_tablica.length; i++) {
//            if (i % 3 == 0 && i % 5 != 0) {
//                moja_tablica[i] = i;
//                wynik++;
//            }
//        }
//
//        int licznik = 0;
//
//        while (licznik < moja_tablica.length) {
//            System.out.print(moja_tablica[licznik] + " ");
//            licznik++;
//        }
//        System.out.println("Tych liczb jest: "+wynik);
//    }
//}

//2.1c

//
//public class Main{
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        int[] moja_tablica = new int[n];
//        int wynik =0;
//
//        for (int i = 1; i < moja_tablica.length; i++) {
//            if (Math.sqrt(i)%2==0) {
//                moja_tablica[i] = i;
//                wynik++;
//            }
//        }
//
//        int licznik = 0;
//        while (licznik < moja_tablica.length) {
//            System.out.print(moja_tablica[licznik] + " ");
//            licznik++;
//        }
//        System.out.println("Tych liczb jest: "+wynik);
//    }
//}

// zad2.1d

//public class Main {
//
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        int[] moja_tablica = new int[n];
//        int wynik=0;
//
//        for (int i = 1; i < moja_tablica.length-1; i++) {
//            if (moja_tablica[i]<(moja_tablica[i-1]+moja_tablica[i+1]/2)) {
//                moja_tablica[i] = i;
//                wynik++;
//            }
//        }
//
//        int licznik = 0;
//
//        while (licznik < moja_tablica.length) {
//            System.out.print(moja_tablica[licznik] + " ");
//            licznik++;
//        }
//        System.out.println("Tych liczb jest: "+wynik);
//    }
//
//}

//zad2.1e

//public class Main{
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        int[] moja_tablica = new int[n];
//        int wynik=0;
//        int temp=1;
//
//        for (int i = 1; i < moja_tablica.length; i++) {
//            temp *=i;
//            if (Math.pow(2, i) <= moja_tablica[i] && moja_tablica[i] <= temp) {
//                moja_tablica[i] = i;
//                wynik++;
//            }
//        }
//
//        int licznik = 0;
//
//        while (licznik < moja_tablica.length) {
//            System.out.print(moja_tablica[licznik] + " ");
//            licznik++;
//        }
//        System.out.println("Tych liczb jest: "+wynik);
//    }
//}


//zad2.1f

//public class Main{
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        int[] moja_tablica = new int[n];
//        int wynik=0;
//
//
//        for (int i = 1; i < moja_tablica.length-1; i++) {
//            if (i+1%2 != 0 && moja_tablica[i]%2==0) {
//                moja_tablica[i] = i;
//                wynik++;
//            }
//        }
//
//        int licznik = 0;
//
//        while (licznik < moja_tablica.length) {
//            System.out.print(moja_tablica[licznik] + " ");
//            licznik++;
//        }
//        System.out.println("Tych liczb jest: "+wynik);
//    }
//}

//zad2.1g

//public class Main{
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        int[] moja_tablica = new int[n];
//        int wynik=0;
//
//
//        for (int i = 1; i < moja_tablica.length-1; i++) {
//            if (moja_tablica[i] %2 !=0 && moja_tablica[i] >=0) {
//                moja_tablica[i] = i;
//                wynik++;
//            }
//        }
//
//        int licznik = 0;
//
//        while (licznik < moja_tablica.length) {
//            System.out.print(moja_tablica[licznik] + " ");
//            licznik++;
//        }
//        System.out.println("Tych liczb jest: "+wynik);
//    }
//}


//zad2.1h

//public class Main{
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        int[] moja_tablica = new int[n];
//        int wynik=0;
//
//
//        for (int i = 1; i < moja_tablica.length-1; i++) {
//            if (Math.abs(moja_tablica[i]) < Math.pow(i, 2)) {
//                moja_tablica[i] = i;
//                wynik++;
//            }
//        }
//
//        int licznik = 0;
//
//        while (licznik < moja_tablica.length) {
//            System.out.print(moja_tablica[licznik] + " ");
//            licznik++;
//        }
//        System.out.println("Tych liczb jest: "+wynik);
//    }
//}

//zad2.2

//public class Main {
//
//    public static void main(String[] args)
//    {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        int[] moja_tablica = new int[n];
//        int wynik=0;
//
//
//        for (int i = 1; i < moja_tablica.length-1; i++) {
//            if (moja_tablica[i] > 0) {
//                moja_tablica[i] = i;
//                wynik+=2*moja_tablica[i];
//            }
//        }
//
//        System.out.println("Tych liczb jest: "+wynik);
//    }
//}

//zad2.3

//public class Main {
//    public static void main(String[] args)
//    {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        int[] moja_tablica = new int[n];
//
//        int zero = 0, plus = 0, minus = 0;
//        for(int i = 0; i<=moja_tablica.length-1; i++){
//            moja_tablica[i] = i;
//            if(moja_tablica[i] == 0)
//                zero++;
//            if(moja_tablica[i] < 0)
//                minus++;
//            if(moja_tablica[i] > 0)
//                plus++;
//       }
//        System.out.println("zero: "+zero+"minus: "+minus+"plus: "+plus);
//    }
//}

//zad2.4

//public class Main {
//    public static void maksimum(int tab[]) {
//        int wynik = 0;
//        for (int i = 0; i < tab.length; i++) {
//            if (wynik < tab[i]) {
//                wynik = tab[i];
//            }
//        }
//        System.out.println("Maksimum: "+wynik);
//    }
//    public static void minimum(int tab[]) {
//        int wynik = 0;
//        for (int i = 0; i < ((tab.length-1)-(tab.length-1)+2); i++) {
//            if (wynik < tab[i]) {
//                wynik = tab[i]-1;
//            }
//        }
//        System.out.println("Minimum: "+wynik);
//    }
//
//    public static void main(String[] args)
//    {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n: ");
//        int n = scan.nextInt();
//        int[] moja_tablica = new int[n];
//
//        int zero = 0, plus = 0, minus = 0;
//        for(int i = 1; i<=moja_tablica.length-1; i++){
//            moja_tablica[i] = i+1;
//       }
//        maksimum(moja_tablica);
//        minimum(moja_tablica);
//
//    }
//}

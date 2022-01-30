package pl.imiajd.warych;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class Main {


    public static <String >void redukuj(LinkedList<String> pracownicy, int n)
    {

        for(int i=n-1; i<pracownicy.size(); i+=n-1)
        {
            pracownicy.remove(i);
        }

    }
    public static <String> void odwroc(LinkedList<String> lista)
    {

        Collections.reverse(lista);

    }



    public static void main(String[] args) {

        LinkedList<String> pracownicy = new LinkedList<String>();
        pracownicy.add("Warych");
        pracownicy.add("Kaczyński");
        pracownicy.add("Kiepski");
        pracownicy.add("Nowakowski");
        pracownicy.add("Ziemniak");
        pracownicy.add("Polak");
        pracownicy.add("Kropka");

        System.out.println("\npracownicy -> " + pracownicy);
        redukuj(pracownicy,2);
        System.out.println("\npracownicy po zredukowaniu -> " + pracownicy);
        odwroc(pracownicy);
        System.out.println("\npracownicy po odwroceniu -> " + pracownicy);

        Stack<String>  zdanie= new Stack<String>();

        zdanie.add("Ala");
        zdanie.add("ma");
        zdanie.add("kota");
        zdanie.add(".");


        Stack<String> zdanie_odwr=new Stack<>();



        System.out.println("\n");
        System.out.println(zdanie);

        for(int i=0; i<=zdanie.size()+2; i++)
        {
            zdanie_odwr.add(zdanie.pop());
        }
        System.out.println(zdanie_odwr);


    }
}
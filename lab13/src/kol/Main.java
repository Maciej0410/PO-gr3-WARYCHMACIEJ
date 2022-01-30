package kol;
import java.lang.*;
import java.util.*;

class Zadanie implements Comparable<Zadanie> {

    int id;
    String day;

    public Zadanie(int id, String day){
        this.id = id;
        this.day = day;
    }

    public int getId() {
        return id;
    }

//    public Zadanie Zadanie_zamien(int id_zm, String zadanie_zm){
//          if(id==id_zm){
//             day=zadanie_zm;
//        }
//         return
//    }



    @Override
    public int compareTo(Zadanie tmp) {
        if(id < tmp.id)
            return -1;
        else if (id > tmp.id)
            return 1;
        return 0;
    }

    public String toString(){
        return id + ". " + day;
    }


}

interface Cloneable<Zadanie>{
    ZadanieLista clone();
}


class ZadanieLista implements Cloneable<ZadanieLista>{

    PriorityQueue<Zadanie> lista_zadan = new PriorityQueue<>();

    public ZadanieLista() {
        this.lista_zadan = new PriorityQueue<>();
    }

    public void add(Zadanie x){
        lista_zadan.add(x);
    }

    public int rozmiar(){
        return lista_zadan.size();
    }

    public void co_dalej(){
        System.out.println(lista_zadan.peek());
    }

    public void nastepny(){
        lista_zadan.poll();
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        PriorityQueue<Zadanie> temp = new PriorityQueue<Zadanie>(lista_zadan);

        Iterator<Zadanie> it = temp.iterator();
        while(it.hasNext()) {
            result.append(temp.poll()).append("\n");
        }
        return result.toString();
    }

    @Override
    public ZadanieLista clone(){
        ZadanieLista tmp = new ZadanieLista();
        tmp.add(new Zadanie(1, "Niedziela"));
        return tmp;
    }



}


public class Main {

    public static void main(String[] args) {

        ZadanieLista moje_zadania = new ZadanieLista();

        moje_zadania.add(new Zadanie(1, "Poniedziałek"));
        moje_zadania.add(new Zadanie(2, "Wtorek"));
        moje_zadania.add(new Zadanie(3, "środa"));
        moje_zadania.add(new Zadanie(4, "Czwartek"));
        moje_zadania.add(new Zadanie(5, "Piątek"));
        moje_zadania.add(new Zadanie(6, "Sobota"));
        moje_zadania.add(new Zadanie(7, "Niedziela"));

        System.out.println(moje_zadania);

        moje_zadania.nastepny();
        System.out.println(moje_zadania);

        moje_zadania.clone();

        System.out.println();




    }
}
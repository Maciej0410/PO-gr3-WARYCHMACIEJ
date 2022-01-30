package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main{

    public static ArrayList<Integer> append(ArrayList<Integer> lista, ArrayList<Integer> lista_2)
    {
        ArrayList<Integer> lista_cala=new ArrayList<Integer>();
        lista_cala.addAll(lista);
        lista_cala.addAll(lista_2);

        return lista_cala;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> lista, ArrayList<Integer> lista_2)
    {
        ArrayList<Integer> lista_cala=new ArrayList<Integer>();
        lista_cala.addAll(lista);
        for(int i=0,j=1;i<lista_2.size()&&j<=lista_2.size()*2;i++,j+=2)
        {
            int x=lista_2.get(i);
            lista_cala.add(j, x);

        }
        return lista_cala;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> lista, ArrayList<Integer> lista_2){
        ArrayList<Integer> lista_tmp = new ArrayList<Integer>();
        lista_tmp = append(lista,lista_2);
        Collections.sort(lista_tmp);
        return lista_tmp;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> lista){
        ArrayList<Integer> lista_tmp = new ArrayList<Integer>();

        int[] tmp = new int[lista.size()];

        for(int i = 0; i <=lista.size()-1; i++){
            tmp[tmp.length-i-1] = lista.get(i);

        }
        for(int i = 0; i <=lista.size()-1; i++){
            lista_tmp.add(tmp[i]);

        }
        return lista_tmp;
    }

    public static void main(String[] args) {

        ArrayList<Integer> lista_a = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        Scanner sc_2 = new Scanner(System.in);
        ArrayList<Integer> lista_b=new ArrayList<Integer>();

        lista_a.add(5);
        lista_a.add(10);
        lista_a.add(6);
        lista_a.add(3);
        lista_a.add(87);
        lista_a.add(777);
        lista_b.add(55);
        lista_b.add(33);
        lista_b.add(1);
        lista_b.add(0);
        lista_b.add(11);
        lista_b.add(54);

        System.out.println("Lista a -> "+lista_a);
        System.out.println("Lista b -> "+lista_b);
        ArrayList<Integer> lista_cala=new ArrayList<Integer>();
        System.out.println("append -> "+append(lista_a, lista_b));
        System.out.println("merge -> "+merge(lista_a, lista_b));
        ArrayList<Integer> lista_zad3=new ArrayList<Integer>();
        lista_zad3=mergeSorted(lista_a, lista_b);
        System.out.println("mergeSorted -> "+lista_zad3);
        ArrayList<Integer> lista_zad4=new ArrayList<Integer>();
        lista_zad4=reversed(lista_a);
        System.out.println("reversed lista a -> "+lista_zad4);
    }
}

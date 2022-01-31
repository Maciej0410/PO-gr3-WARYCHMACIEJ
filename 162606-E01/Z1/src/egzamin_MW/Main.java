package egzamin_MW;

import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

    public static <T extends Comparable<? super T>> ArrayList removeRepeatedElements(T[] tablica){
        int i=0;
        ArrayList tab=new ArrayList();

        while (i!=tablica.length-1)
        {
            for(int j=1; j<=tablica.length-1; j++)
            {
                if(tablica[i]==tablica[j])
                {
                    tab.add(tablica[i]);
                }
            }
            i++;
        }
        return tab;

    }

    public static void main(String[] args) {
        Character[] test_1=new Character[4];

        test_1[0]=Character.valueOf('l');
        test_1[1]=Character.valueOf('l');
        test_1[2]=Character.valueOf('y');
        test_1[3]=Character.valueOf('r');

        System.out.println(Main.removeRepeatedElements(test_1));

    }
}

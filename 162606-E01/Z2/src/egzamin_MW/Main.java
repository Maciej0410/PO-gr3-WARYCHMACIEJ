package egzamin_MW;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static <E extends Iterable<E>> void printMarginal(E elemenet){
        Iterator iterat = elemenet.iterator();
        System.out.println(elemenet.iterator().next());

    }


    public static void main(String[] args) {

        ArrayList test=new ArrayList();
        test.add(3);
        test.add(1);
        test.add(5);
        test.add(3);
        test.add(5);

        Main.printMarginal(test);

        LinkedList test_2 = new LinkedList();
        test_2.add(0, 9);
        test_2.add(1, 2);
        test_2.add(2, 3);
        test_2.add(3, 6);

        Main.printMarginal(test_2);



    }
}

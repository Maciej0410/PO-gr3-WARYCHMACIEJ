package pl.imiajd.warych;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Osoba> grupa = new ArrayList<Osoba>(5);

        Osoba o1 = new Osoba("Warych", LocalDate.of(1994, 11, 11));
        Osoba o2 = new Osoba("Kowalski", LocalDate.of(1997,4,10));
        Osoba o3 = new Osoba("Ziemniak", LocalDate.of(2000,10,19));
        Osoba o4 = new Osoba("Polak", LocalDate.of(1979,6,13));
        Osoba o5 = new Osoba("Skokol", LocalDate.of(1989,12,2));

        grupa.add(o1);
        grupa.add(o2);
        grupa.add(o3);
        grupa.add(o4);
        grupa.add(o5);

        System.out.println("Nieposortowana grupa ->  ");

        for(int i=0; i<grupa.size(); i++)
        {
            System.out.println(grupa.get(i));
        }

        Collections.sort(grupa);


        System.out.println("\nPosortowana grupa ->  ");
        for(int i=0; i<grupa.size(); i++)
        {
            System.out.println(grupa.get(i));
        }


        System.out.println("Test Student");

        ArrayList<Osoba> studenci_grupa = new ArrayList<>(5);

        Student s1 = new Student("Nowak", LocalDate.of(2000, 1, 4), 3.25);
        Student s2 = new Student("Andrzejczyk", LocalDate.of(1999, 8, 25), 4.6);
        Student s3 = new Student("Romanowski", LocalDate.of(1995, 10, 11), 4.85);
        Student s4 = new Student("Makrela", LocalDate.of(2000, 2, 29), 4.25);
        Student s5 = new Student("Stachu", LocalDate.of(1997, 3, 10), 5.5);

        studenci_grupa.add(s1);
        studenci_grupa.add(s2);
        studenci_grupa.add(s3);
        studenci_grupa.add(s4);
        studenci_grupa.add(s5);

        System.out.println("\nNieposortowana grupa -> ");
        for(int i=0; i<5; i++)
        {
            System.out.println(studenci_grupa.get(i));
        }

        Collections.sort(studenci_grupa);

        System.out.println("\nPosortowana grupa -> ");
        for(int i=0; i<5; i++){
            System.out.println(studenci_grupa.get(i));
        }


    }
}

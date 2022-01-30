package pl.imiajd.warych;
import java.util.ArrayList;


public class Main {
    
    public static void main(String[] args) {

        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();
        Flet flet = new Flet();
        Fortepian fortepian = new Fortepian();
        Skrzypce skrzypce = new Skrzypce();

        orkiestra.add(flet);
        orkiestra.add(fortepian);
        orkiestra.add(skrzypce);
        orkiestra.add(flet);
        orkiestra.add(flet);

        flet.setProducent("fletix");
        skrzypce.setProducent("skrzypix");
        fortepian.setProducent("fortepianix");

        flet.setRokProdukcji(2002, 10,2);
        skrzypce.setRokProdukcji(2009, 1, 15);
        fortepian.setRokProdukcji(1999, 2, 27);


        for(int i=0; i<orkiestra.size(); i++)
        {
            orkiestra.get(i).dzwiek();
        }

        System.out.println(" ");

        System.out.println("Producent fletu to: " + flet.getProducent());
        System.out.println("Producent fortepianu to: " + fortepian.getProducent());
        System.out.println("Producent skrzypiec to: " + skrzypce.getProducent());

        System.out.println(" ");

        System.out.println("Rok produkcji fletu to: " + flet.getRokProdukcji());
        System.out.println("Rok produkcji skrzypiec to: " + skrzypce.getRokProdukcji());
        System.out.println("Rok produkcji fortepianu to: " + fortepian.getRokProdukcji());

        System.out.println(" ");

        System.out.println(skrzypce.getRokProdukcji().toString());
        System.out.println(flet.getProducent().equals(fortepian.getProducent()));

    }
}
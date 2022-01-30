package pl.imiajd.warych;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {

        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();
        Instrument flet = new Flet();
        Instrument fortepian = new Fortepian();
        Instrument skrzypce = new Skrzypce();

        orkiestra.add(flet);
        orkiestra.add(fortepian);
        orkiestra.add(skrzypce);
        orkiestra.add(flet);
        orkiestra.add(flet);

        flet.setProducent("sprzet_muzycznyPOL");
        skrzypce.setProducent("mikroFON");
        fortepian.setProducent("pol_muz");

        flet.setRokProdukcji(2019, 8,3);
        skrzypce.setRokProdukcji(2008, 12, 19);
        fortepian.setRokProdukcji(2012, 4, 13);


        for(int i=0; i<orkiestra.size(); i++)
        {
            orkiestra.get(i).dzwiek();
        }


        System.out.println("\nProducent fletu to: " + flet.getProducent());
        System.out.println("\nProducent fortepianu to: " + fortepian.getProducent());
        System.out.println("\nProducent skrzypiec to: " + skrzypce.getProducent());



        System.out.println("\nRok produkcji fletu to: " + flet.getRokProdukcji());
        System.out.println("\nRok produkcji skrzypiec to: " + skrzypce.getRokProdukcji());
        System.out.println("\nRok produkcji fortepianu to: " + fortepian.getRokProdukcji());



    }
}

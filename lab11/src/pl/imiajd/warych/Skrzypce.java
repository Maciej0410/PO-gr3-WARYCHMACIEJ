package pl.imiajd.warych;
import java.time.LocalDate;

public class Skrzypce extends Instrument{

    String producent;
    java.time.LocalDate rokProdukcji;

    public void setProducent(String producent) {
        this.producent = producent;
    }
    public void setRokProdukcji(int rok, int miesiac, int dzien) {
        this.rokProdukcji = LocalDate.of(rok, miesiac, dzien);
    }

    public String getProducent() {
        return producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    @Override
    public void dzwiek(){
        System.out.println("piiiiiiii piiiiii");
    }

}
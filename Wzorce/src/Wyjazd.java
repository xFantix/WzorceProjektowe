import java.util.ArrayList;
import java.util.List;

public class Wyjazd {

    private String nazwaWyjazdu;
    private List<Trasa> trasaWyjazdu = new ArrayList<>();
    private double kilometry;

    public double getKilometry() {
        return kilometry;
    }

    public void setKilometry(double kilometry) {
        this.kilometry = kilometry;
    }

    public Wyjazd(String nazwaWyjazdu){
        nazwaWyjazdu = nazwaWyjazdu;
    }

    public void dodajTrase(Trasa tras){
        trasaWyjazdu.add(tras);
        kilometry = kilometry + tras.dlugoscTrasy();
    }




}

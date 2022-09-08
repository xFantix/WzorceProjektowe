import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Wyjazd> wyjazdy = new ArrayList<>();

    public static void main(String[] args) {

        Wyjazd wyjazd1 = new Wyjazd("Torun-Gdansk");
        wyjazd1.dodajTrase(new Trasa("Torun","Grudziadz",65));
        wyjazd1.dodajTrase(new Trasa("Grudziadz","Gdansk",120));

        wyjazdy.add(wyjazd1);

        SrodekTransportu transport = new SrodekTransportu((new Autobus()));
        transport.send(wyjazdy);

    }
}
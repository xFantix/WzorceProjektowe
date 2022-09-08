import java.util.Collection;

public class Samochod implements SrodekTransportuMetody {

    @Override
    public void jedz(Collection<Wyjazd> wyjazdy) {
        System.out.println("Wybrales samochod");
    }
}

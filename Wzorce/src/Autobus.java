import java.util.Collection;

public class Autobus implements SrodekTransportuMetody {
    @Override
    public void jedz(Collection<Wyjazd> wyjazdy) {
        System.out.println("Wybrales Autobus");
    }
}

import java.util.Collection;

public class SrodekTransportu {

    private SrodekTransportuMetody strategia;

    public SrodekTransportu(SrodekTransportuMetody strategia) {
        this.strategia = strategia;
    }

    public void send(Collection<Wyjazd> wyjazdy){
        this.strategia.jedz(wyjazdy);
    }

}
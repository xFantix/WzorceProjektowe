public class Trasa {

    private String skad;
    private String cel;
    private double kilometry;

    public Trasa(String skad, String cel, double kilometry){
        skad = skad;
        cel = cel;
        kilometry = kilometry;
    }

    public double dlugoscTrasy(){
        return kilometry;
    }

}

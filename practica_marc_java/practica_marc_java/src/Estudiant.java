import  java.util.List;
import  java.util.ArrayList;

public class Estudiant extends Persona {

    private List<Float> notas = new ArrayList<Float>();

    private double maxima;
    private double minima;
    private double mitjana;


    public void posarNota(Float notas1) throws Exception {
        if (notas1 > 10) throw new Exception("La nota no pot ser major de 10");
        if (notas1 < 0) throw new Exception("La nota no pot ser menor de 0");
        this.notas.add(notas1);
        // Control d'errors per que no sorti 0
        minima = notas1;
        // Netejem la variable
        mitjana = 0;
        for (int x = 0; x < notas.size(); x++ ) {
            if ( maxima < notas.get(x) ) {
                maxima = notas.get(x);
            }
            if (minima > notas.get(x)) {
                minima = notas.get(x);
            }
            mitjana += notas.get(x);
        }
        mitjana = mitjana/notas.size();
    }

    public float getMaxima() {
        return (float) maxima;
    }
    public float getMinima() {
        return (float) minima;
    }
    public float getMitjana() {
        return (float) mitjana;
    }

    @Override
    public String obtenirDades() throws Exception {
        if (this.getDni() == null) throw new Exception("Esta persona no tiene DNI.");
        if (this.getNom() == null) throw new Exception("Esta persona no tiene nombre");

        return "Persona con el nombre: " + this.getNom() + " y DNI: " + this.getDni() + " (estudiante con nota/es: " + notas.toString() + ")";
    }

}

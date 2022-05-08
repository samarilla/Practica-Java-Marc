import  java.util.List;
import  java.util.ArrayList;

public class Estudiant extends Persona {

    private Float notas;

    public void posarNota(Float notas) {
    this.notas = notas;
    }

    @Override
    public String obtenirDades() throws Exception {
        if (this.getDni() == null) throw new Exception("Esta persona no tiene DNI.");
        if (this.getNom() == null) throw new Exception("Esta persona no tiene nombre");

        return "Persona con el nombre: " + this.getNom() + " y DNI: " + this.getDni() + " (estudiante con nota/es: " + notas.toString() + ")";
    }
}

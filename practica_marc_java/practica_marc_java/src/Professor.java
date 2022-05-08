import java.util.Date;

public class Professor extends Persona{

    private float sou;
    private Date dataInici;
    private Date dataFi;

    public void canviarSou(float sou) throws Exception {
        if (sou > 3000) throw new Exception("El sueldo no puede ser mayor que 3000");
        if (sou < 0) throw new Exception("el sueldo no admite numeros en negativos");
        this.sou = sou;
    }
    
    

    public float getSou() {
        return sou;
    }

    @Override
    public String obtenirDades() throws Exception {
        if (this.getDni() == null) throw new Exception("Esta persona no tiene DNI.");
        if (this.getNom() == null) throw new Exception("Esta persona no tiene nombre.");

        return "Persona con el nombre: " + this.getNom() + " y DNI: " + this.getDni() + " (profesor con sueldo: " + sou + ")";
    }

    public void assignarSubstitucio(Date dataInici, Date dataFi)  {
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }
}

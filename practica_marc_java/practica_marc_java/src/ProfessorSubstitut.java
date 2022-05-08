import java.util.Date;

public class ProfessorSubstitut extends Professor {

    private Date dataInici;
    private Date dataFi;

    public void assignarSubstitucio(Date dataInici, Date dataFi)  {
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }

    @Override
    public String obtenirDades() throws Exception{
        if (this.getDni() == null) throw new Exception("Esta persona no tiene DNI.");
        if (this.getNom() == null) throw new Exception("Esta persona no tiene nombre.");

        return "Persona con el nombre: " + this.getNom() + " y DNI: " + this.getDni() + " (Profe con sueldo: " + this.getSou() + ", del " + dataInici + " al " + dataFi + ")";
    }
}



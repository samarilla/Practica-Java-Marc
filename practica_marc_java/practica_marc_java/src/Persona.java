public class Persona {
    private String dni;
    private String nom;

    public void canviarNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public String getNom() {
        return nom;
    }

    public String obtenirDades() throws Exception {
        return dni + "-" + nom;
    }

    public void assignarDni(String dni) throws Exception {
        if (this.dni != null) throw new Exception("Ya hay un DNI");
        this.dni = dni;
    }
}

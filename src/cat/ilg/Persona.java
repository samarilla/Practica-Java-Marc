package cat.ilg;

public class Persona {

    //atributo privado
    private String dni;
    public String nom;

    //metodes
    public void canviarNom(String nom){
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
}

import java.util.ArrayList;

public class Institut {
    private String nom;
    private ArrayList<Persona> personas = new ArrayList<Persona>();
    private ArrayList<Professor> professors = new ArrayList<Professor>();


    public String getNom() {
        return nom;
    }

    public void canviarNom(String nom) {
        this.nom = nom;
    }

    public void afegirPersona(Persona persona) {
        this.personas.add(persona);
    }

    public void afegirProfe(Professor professor) {
        this.personas.add(professor);
    }

    public void afegirEstudiant(Estudiant estudiant) {
        this.personas.add(estudiant);
    }

    public void afegirProfessor(Professor professor) {
        this.professors.add(professor);
    }

    public void imprimirInformacio() throws Exception {
        System.out.println("Institut " + nom + ". Lista de personas: ");
        for (Persona persona : personas) {
            System.out.println(persona.obtenirDades());
        }
    }
}

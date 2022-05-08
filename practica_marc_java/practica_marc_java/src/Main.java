import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Institut ins = new Institut();
        ins.canviarNom("La Guineueta");

        Professor profe1 = new Professor();
        profe1.canviarNom("Marc");
        profe1.assignarDni("1234");
        ins.afegirPersona(profe1);

        ProfessorSubstitut profe2 = new ProfessorSubstitut();
        profe2.canviarNom("Laura");
        profe2.assignarDni("8888");
        Date dataInici = new Date(2021, 11, 1);
        Date dataFi = new Date(2022, 6, 30);
        profe2.assignarSubstitucio(dataInici, dataFi);
        ins.afegirPersona(profe2);

        Estudiant estudiant1 = new Estudiant();
        Estudiant estudiant2 = new Estudiant();
        Estudiant estudiant3 = new Estudiant();
        estudiant2.assignarDni("6766");
        estudiant1.canviarNom("Joan");
        estudiant1.assignarDni("6666");
        estudiant1.posarNota(4.2F);
        estudiant1.posarNota(1.2F);
        estudiant1.posarNota(7F);

        ////////////////Muestra las notas minima, media y maxima en float del estudiant1//////////////
        System.out.printf("Nota minima: "+(estudiant1.getMinima())+ " ");
        System.out.printf("Nota media: "+(estudiant1.getMitjana())+ " ");
        System.out.printf("Nota Maxima: "+(estudiant1.getMaxima())+ " ");


        ins.afegirPersona(estudiant1);

        ins.imprimirInformacio();

        /*|||||||||||||||||||||||Segunda parte||||||||||||||||||||||||||||*/

        try {
            profe1.assignarDni("9696");
        } catch (Exception duplicacion_dni) {
            duplicacion_dni.printStackTrace();
        }

        try {
            estudiant1.posarNota((float) 15.7);
        } catch (Exception nota_maxima) {
            nota_maxima.printStackTrace();
        }

        try {
            profe1.canviarSou(4000);
        } catch (Exception maximo_sueldo) {
            maximo_sueldo.printStackTrace();
        }

        try {
            System.out.println(estudiant3.obtenirDades());
        } catch (Exception falta_nombre) {
            falta_nombre.printStackTrace();
        }
        try {
            System.out.println(estudiant2.obtenirDades());
        } catch (Exception falta_nombre) {
            falta_nombre.printStackTrace();
        }
    }
}

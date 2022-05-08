import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Institut ins = new Institut();
        ins.canviarNom("La Guineueta");

        Date dataInici = null;
        Professor profe1 = new Professor();
        profe1.canviarNom("Marc");
        profe1.assignarDni("1234");
        profe1.canviarSou(2500.0F);
        ins.afegirPersona(profe1);

        ProfessorSubstitut profe2 = new ProfessorSubstitut();
        profe2.canviarNom("Laura");
        profe2.assignarDni("8888");
        profe2.canviarSou(2500.0F);
        dataInici = new Date(2021, Calendar.DECEMBER, 1);
        Date dataFi = new Date(2022, Calendar.JULY, 30);
        //error en fechas, no he podido solucionarlo, no me ha dado tiempo :(//
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
        System.out.println("Nota minima de " + estudiant1.getNom() + " " + (estudiant1.getMinima()));
        System.out.println("Nota media de " + estudiant1.getNom() + " " + (estudiant1.getMitjana()));
        System.out.println("Nota Maxima de " + estudiant1.getNom() + " " + (estudiant1.getMaxima()));


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

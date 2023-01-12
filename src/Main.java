import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        //Genera a random i passegeri che salgono e scendono dal treno
        int passSaliti = (int) (Math.random() * 20);
        int passScesi = (int) (Math.random() * 20);

        //
        //Stampare le fermate del treno
        String tappa = null;
        for (int i = 0; i < 3; i++) {
            System.out.print("\nA che feramata siamo?: ");
            tappa = in.next();
        }

        //Modificare il numero dei vagoni se il numero massimo di cpienza viene superato
        //

        Treno treno = new Treno(20, 5, passSaliti, passScesi, tappa);
        treno.setMaxPass(20);
        treno.setMaxVagoni(5);
        treno.setPassSaliti(passSaliti);
        treno.setPassScesi(passScesi);
        treno.setTappe(tappa);

        treno.stampa();
    }
}
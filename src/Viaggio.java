import java.util.Random;
class Viaggio {
    public static void main(String[] args) {
        String[] tappe = {"Milano", "Bologna", "Firenze", "Roma"};
        Treno treno1 = new Treno(5, 20, tappe);
        Treno treno2 = new Treno(3, 30, tappe);
        Random rand = new Random();
        //numero di tappe del viaggio
        int N = 10;
        for (int i = 0; i < N; i++) {
            int passeggeriSaliti = rand.nextInt(20);
            int passeggeriScesi = rand.nextInt(20);
            treno1.gestioneTappa(passeggeriSaliti, passeggeriScesi);
            if (treno1.isFull()) {
                treno2 = treno1.copy();
                treno1 = new Treno(5, 20, tappe);
            }
        }
        treno1.chiediTappa();
        stampaInfo(treno1);
        treno2.chiediTappa();
        stampaInfo(treno2);
    }

    public static void stampaInfo(Treno treno) {
        treno.stampaInfo();
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Treno {
    private int[] vagoni;
    private int capienzaK;
    private String[] tappe;
    private int tappaAttuale;
    public Treno(int numeroVagoni, int capienzaVagone, String[] tappe) {
        vagoni = new int[numeroVagoni];
        capienzaK = capienzaVagone;
        this.tappe = tappe;
        tappaAttuale = 0;
    }
    public Treno(Treno treno) {
        this.vagoni = treno.vagoni.clone();
        this.capienzaK = treno.capienzaK;
        this.tappe = treno.tappe.clone();
        this.tappaAttuale = treno.tappaAttuale;
    }
    public void gestioneTappa(int passeggeriSaliti, int passeggeriScesi) {
        for(int i = 0; i < vagoni.length; i++){
            vagoni[i] += passeggeriSaliti;
            vagoni[i] -= passeggeriScesi;
            if (vagoni[i] > capienzaK) {
                int numVagoniNecessari = (int) Math.ceil((double) vagoni[i] / capienzaK);
                vagoni = Arrays.copyOf(vagoni, vagoni.length + numVagoniNecessari);
                //riempi i nuovi vagoni con i passeggeri in eccesso
                int passeggeriRimasti = vagoni[i] - capienzaK;
                vagoni[i] = capienzaK;
                for (int j = vagoni.length - numVagoniNecessari; j < vagoni.length; j++) {
                    vagoni[j] = passeggeriRimasti / (numVagoniNecessari - (j - (vagoni.length - numVagoniNecessari)));
                }
            }
        }
    }
    public void chiediTappa() {
        Scanner input = new Scanner(System.in);
        System.out.println("In quale tappa ti trovi? (1-" + tappe.length + ")");
        tappaAttuale = input.nextInt() - 1;
        System.out.println("Tappa attuale: " + tappe[tappaAttuale]);
    }
    public boolean isFull(){
        for(int i = 0; i < vagoni.length; i++)
            if(vagoni[i] < capienzaK)
                return false;
        return true;
    }
    public Treno copy() {
        return new Treno(this);
    }
    public void stampaInfo() {
        System.out.println("Informazioni sul treno:");
        System.out.println("Numero di vagoni: " + vagoni.length);
        System.out.println("Capienza per vagone: " + capienzaK);
        System.out.println("Passeggeri per vagone: ");
        for (int i = 0; i < vagoni.length; i++) {
            System.out.println("Vagone " + (i + 1) + ": " + vagoni[i]);
        }
        System.out.println("Tappa attuale: " + tappe[tappaAttuale]);
    }
}

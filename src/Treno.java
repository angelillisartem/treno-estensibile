public class Treno {
   private int maxPass;
   private int maxVagoni;
   private int passSaliti;
   private int passScesi;
   private String tappe;
    public Treno(int maxPass, int maxVagoni, int passSaliti, int passScesi, String tappe) {
        this.maxPass = maxPass;
        this.maxVagoni = maxVagoni;
        this.passSaliti = passSaliti;
        this.passScesi = passScesi;
        this.tappe = tappe;
    }
    public void setMaxPass(int maxPass) {
        this.maxPass = maxPass;
    }
    public void setMaxVagoni(int maxVagoni) {
        this.maxVagoni = maxVagoni;
    }
    public void setPassSaliti(int passSaliti) {
        this.passSaliti = passSaliti;
    }
    public void setPassScesi(int passScesi) {
        this.passScesi = passScesi;
    }
    public void setTappe(String tappe) {
        this.tappe = tappe;
    }
    public String getTappe() {
        return tappe;
    }
    public int getMaxVagoni() {
        return maxVagoni;
    }
    public int getMaxPass() {
        return maxPass;
    }
    public int getPassSaliti() {
        return passSaliti;
    }
    public int getPassScesi() {
        return passScesi;
    }
    public void stampa() {
        System.out.print("\nIl treno e' alla tappa: " + getTappe());
        System.out.print("\nMassimo passegeri sul treno: " + getMaxPass());
        System.out.print("\nPassegeri saliti sul treno: " + getPassSaliti());
        System.out.print("\nPassegeri scesi dal treno: " + getPassScesi());
    }
}

public class Treno {
    int capienzaVagone = 10;
    int[] arrayTreno = new int[5];

    public void insPasscasuali() {
        for (int i = 0; i < arrayTreno.length; i++)
            arrayTreno[i] = (int) (Math.random() * 5);
    }

}

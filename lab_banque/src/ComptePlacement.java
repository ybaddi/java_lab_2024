public class ComptePlacement extends Compte implements Calculable{
    private double tauxInteret;
    private int dureePlacement;

    public ComptePlacement(String numeroCompte, double solde, double tauxInteret, int dureePlacement) {
        super(numeroCompte, solde);
        this.tauxInteret = tauxInteret;
        this.dureePlacement = dureePlacement;
    }

    @Override
    public double calculerInteretMensuel() {
        return (dureePlacement <= 0) ? solde * tauxInteret/12: 0;
    }

    @Override
    public double calculerFraisMensuel() {

        return (dureePlacement > 0) ? 20:0;
    }
}

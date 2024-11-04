public class CompteEpargne extends Compte implements Calculable{
    private double tauxInteret;

    public CompteEpargne(String numeroCompte, double solde, double tauxInteret) {
        super(numeroCompte, solde);
        this.tauxInteret = tauxInteret;
    }

    @Override
    public double calculerInteretMensuel() {
        return solde * tauxInteret /12;
    }

    @Override
    public double calculerFraisMensuel() {
        return 0;
    }
}

public class CompteCourant extends Compte implements Calculable{
    private double fraisGestion;

    public CompteCourant(String numeroCompte, double solde, double fraisGestion) {
        super(numeroCompte, solde);
        this.fraisGestion = fraisGestion;
    }

    @Override
    public double calculerInteretMensuel() {

        return 0;
    }

    @Override
    public double calculerFraisMensuel() {

        return fraisGestion;
    }
}

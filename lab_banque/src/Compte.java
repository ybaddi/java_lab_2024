public abstract class Compte {
    protected String numeroCompte;
    protected double solde;


    public Compte(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    void deposer(double montant){
        solde += montant;
    }
    void retirer(double montant){
if(solde >= montant){
    solde -=montant;
}else{
    System.out.println("solde insuffisant");
}
    }
    abstract double calculerInteretMensuel();
    abstract double calculerFraisMensuel();

}

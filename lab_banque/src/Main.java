public class Main {
    public static void main(String[] args) {

        Banque banque = new Banque();

        CompteEpargne compteEpargne = new CompteEpargne("C001", 1000.0, 0.05);
        CompteCourant compteCourant = new CompteCourant("C001", 1000.0, 0.05);
        ComptePlacement comptePlacement = new ComptePlacement("C001", 1000.0, 0.05, 10);

        banque.ajouterCompte(compteEpargne, compteCourant, comptePlacement) ;

        banque.appliquerInteretsEtFrais();
        banque.afficherSoldes();
    }
}

import java.util.ArrayList;
import java.util.List;

public class Banque {
    private List<Compte> comptes;

    public Banque() {
        this.comptes = new ArrayList<>();
    }

    /*
    : Ajoute un compte à la liste des comptes.
     */
    void ajouterCompte(Compte ... comptes){
        for(Compte cpt :comptes )
        this.comptes.add(cpt);
    }
    /*
    Applique les intérêts et les frais à chaque compte en foncti
     on de son type.
     */
    public void appliquerInteretsEtFrais(){
        for(Compte cpt : comptes){
            double interet = cpt.calculerInteretMensuel();
            double frais = cpt.calculerFraisMensuel();
            cpt.deposer(interet);
            cpt.retirer(frais);
        }
    }

    /*
    : Affiche le solde de chaque compte.
     */
    void afficherSoldes(){
        for(Compte cpt : comptes){
            System.out.println("Compte " + cpt.numeroCompte + " : " + cpt.solde);
        }
    }
}


public class CompteEpargne extends Compte{

    private float tauxinteret;

    public CompteEpargne(int id, float solde, Client titulaire, float tauxinteret) {
        super(id, solde, titulaire);
        this.tauxinteret = tauxinteret;
    }

    public float getTauxinteret() {
        return tauxinteret;
    }

    public void setTauxinteret(float tauxinteret) {
        this.tauxinteret = tauxinteret;
    }

    @Override
    public void imprimer() {

        System.out.println("Compte epargne");
        System.out.println("Solde : " + getSolde());
        System.out.println("Taux interet : " + getTauxinteret());
    }

    @Override
    public boolean debiter(int somme) {
        if(getSolde() - somme >= 0) {
            setSolde(getSolde() - somme);
            return true;
        }
        return false;
    }

    public void ajouterInteret(){
        this.setSolde(this.getSolde() + getSolde()*tauxinteret/100);
    }
}


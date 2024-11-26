
public class CompteCourant  extends Compte{

    private float decouvert;

    public CompteCourant(int id, float solde, Client titulaire, float decouvert) {
        super(id, solde, titulaire);
        this.decouvert = decouvert;
    }

    public float getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(float decouvert) {
        this.decouvert = decouvert;
    }


    @Override
    public void imprimer() {
        System.out.println("Compte courant");
        System.out.println("Solde : " + getSolde());
        System.out.println("Decouvert : " + getDecouvert());
    }

    @Override
    public boolean debiter(int somme) {
        if(getSolde() - somme >= -decouvert) {
            setSolde(getSolde() - somme);
            return true;
        }
        return false;
    }
}


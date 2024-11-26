public abstract class Compte {
    private int id;
    private float solde;

    private Client titulaire;


    public Compte(int id, float solde, Client titulaire) {
        this.id = id;
        this.solde = solde;
        this.titulaire = titulaire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public Client getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Client titulaire) {
        this.titulaire = titulaire;
    }

    public abstract void imprimer();

    public abstract boolean debiter(int somme);

    public void crediter(int somme){
        solde +=somme;
    }












}

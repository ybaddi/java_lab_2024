public abstract class Tache {

    protected String desciption;
    protected int dureeEstimee;
    protected String etat;

    public Tache(String desciption, int dureeEstimee) {
        this.desciption = desciption;
        this.dureeEstimee = dureeEstimee;
        this.etat = "en_attente";
    }

    public void demarrer(){
        this.etat = "en_cours";
    }

    public void terminer(){
        this.etat = "terminee";
    }

    public abstract boolean estCritique();


    @Override
    public String toString() {
        return "Tache{" +
                "desciption='" + desciption + '\'' +
                ", dureeEstimee=" + dureeEstimee +
                ", etat='" + etat + '\'' +
                '}';
    }
}

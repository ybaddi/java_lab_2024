

public class Livre  extends Document implements Empruntable{

    private String auteur;
    private boolean estEmprunte;

    public Livre(int id, String titre, String auteur){
        super(id,titre);
        this.auteur=auteur;
    }

    @Override
    void afficherInfo() {
        System.out.println("Livre{" +
                "id='" + this.getId() + '\'' +
                ", titre=" + this.getTitre() +
                "auteur='" + auteur + '\'' +
                ", estEmprunte=" + estEmprunte +
                '}');
    }

    @Override
    public void emprunter() {
        if(!estEmprunte) {
            estEmprunte = true;
            System.out.println("this livre est emprunte");
        }
            else{
            System.out.println("this livre est deja emprunte");
        }
    }

    @Override
    public void retourner() {
        if(estEmprunte) {
            estEmprunte = false;
            System.out.println("this livre est returne");
        }
        else{
            System.out.println("this livre est deja retourne");
        }
    }
}

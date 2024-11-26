import java.util.ArrayList;
import java.util.List;

public class Client {
    private int id;
    private String nom;
    private String prenom;

    private List<CompteCourant> comptesCourants = new ArrayList<>();
    private List<CompteEpargne> comptesEpargnes = new ArrayList<>();

//    CompteEpargne> comptesEpargne; one compte epargne


    public Client(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void ajouterComptecourant(CompteCourant compteCourant){
        if (comptesCourants.size() <3) comptesCourants.add(compteCourant);
        else System.out.println("limte de compte courant depasse");
    }

    public void ajouterCompteEpargne(CompteEpargne compteEpargne){
        if(comptesEpargnes.size()< 1) comptesEpargnes.add(compteEpargne);
        else System.out.println("limte de compte epargne depasse");
    }

    public void consulter(){
        System.out.println("Client : " + nom + " " + prenom );
        System.out.println("compt ecourant ");
        for(CompteCourant cr : comptesCourants){
            cr.imprimer();
        }

        System.out.println("Compte epargne");
        for(CompteEpargne ce : comptesEpargnes){
            ce.imprimer();
        }
        if(comptesEpargnes.isEmpty()) {
            System.out.println("no compte epargn found");
        }

    }
}

import java.util.HashMap;
import java.util.Map;

public class Personne {
    private int num;
    private String nom;
    private String prenom;

    public Personne() {
    }

    public Personne(int num, String nom, String prenom) {
        this.num = num;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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

    public String getNomPrenom(){
        return this.getNom() + " " + this.getPrenom();
    }

    @Override
    public String toString() {
        return "Personne{" +
                "num=" + num +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Personne p1 = new Personne(1, "baddi1", "youssef");
        Personne p2 = new Personne(2, "baddi2", "youssef");
        Personne p3 = new Personne(3, "baddi3", "youssef");


        Map<String,Personne> personnes = new HashMap();
        personnes.put( p1.getNomPrenom(), p1);
        personnes.put( p2.getNomPrenom(), p2);
        personnes.put( p3.getNomPrenom(), p3);

        int i =0;
        for(Map.Entry<String, Personne> entry : personnes.entrySet()){
            if(i%2==0){
                System.out.println(" cle avec lindice " + i + " : " + entry.getKey());
            }else{
                System.out.println(" cle avec lindice " + i + " : " + entry.getValue());
            }
            i++;
        }
    }
}

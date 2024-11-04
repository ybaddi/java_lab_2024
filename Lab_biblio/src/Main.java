public class Main {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque<>();

    Livre livre = new Livre(1,"java", "baddi");
    Magazin magazin = new Magazin(2,"java for all", 213);
    bibliotheque.ajouterDocument(livre);
    bibliotheque.ajouterDocument(magazin);

    bibliotheque.afficherTousLesDocument();

    livre.emprunter();
    livre.retourner();
    livre.retourner();

    bibliotheque.supprimerDocument(1);
    bibliotheque.afficherTousLesDocument();
    }

}

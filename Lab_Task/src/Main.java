public class Main {

    public static void main(String[] args) {
        Projet projet = new Projet();

        TacheSimple tache1= new TacheSimple("Tache 1", 5, 1);
        TacheSimple tache2= new TacheSimple("Tache 2", 10, 2);
        TacheSimple tache3= new TacheSimple("Tache 3", 15, 3);

        TacheComplexe tache4= new TacheComplexe("Tache 1", 5);

        tache4.ajouterTache(tache2);
        tache4.ajouterTache(tache3);


        projet.ajouterTache(tache1);
        projet.ajouterTache(tache4);

        projet.afficherDetailsProjet();
        projet.trierTachesParPriorite();
        projet.afficherDetailsProjet();

    }


}

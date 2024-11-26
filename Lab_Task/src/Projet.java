import java.sql.Array;
import java.util.*;

public class Projet {
    private List<Tache> taches;


    public Projet() {
        this.taches = new ArrayList<>();
    }

    void ajouterTache(Tache t){
        taches.add(t);
    }

    int calculerDureeTotale(){
        int dureeTotal = 0;
        for(Tache t : taches){
            dureeTotal += t.dureeEstimee;
        }
        return dureeTotal;
    }

    void trierTachesParPriorite(){
//        List<TacheSimple> tachesSimples = this.taches.stream().filter(x -> {return (x instanceof TacheSimple);})
        List<TacheSimple> tachesSimples = new ArrayList<>();
        for(Tache t : taches){
            if(t instanceof TacheSimple){
                tachesSimples.add((TacheSimple)t);
            }
//            Collections.sort(tachesSimples);
            Collections.sort(tachesSimples, new Comparator<TacheSimple>() {
                @Override
                public int compare(TacheSimple o1, TacheSimple o2) {
                    return Integer.compare(o1.getPriorite(),o2.getPriorite());
                }
            });
        }
    }

   void  afficherDetailsProjet(){
       for(Tache t : taches){
           System.out.println(t);
       }
       System.out.println("la duree total du projet est " + calculerDureeTotale());
    }

}

import java.util.ArrayList;
import java.util.List;

public class TacheComplexe extends Tache implements Critique{
    private List<Tache> sousTaches;


    public TacheComplexe(String desciption, int dureeEstimee) {
        super(desciption, dureeEstimee);
        this.sousTaches = new ArrayList<>();
    }

    public void ajouterTache(Tache t){
        sousTaches.add(t);
    }

    @Override
    public boolean estCritique() {

//        return sousTaches.stream().filter(x->x.estCritique()).count() > 0;
  for(Tache t : sousTaches){
      if(t.estCritique()) return true;
  }
  return false;
    }

}

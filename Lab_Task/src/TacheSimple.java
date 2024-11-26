public class TacheSimple extends Tache implements Critique, Comparable<TacheSimple>{
    private int priorite;


    public TacheSimple(String desciption, int dureeEstimee, int priorite) {
        super(desciption, dureeEstimee);
        this.priorite = priorite;
    }

    public int getPriorite() {
        return priorite;
    }

    @Override
    public boolean estCritique() {
        return dureeEstimee>10;
    }

    @Override
    public int compareTo(TacheSimple o) {
//        return Integer.compare(priorite, o.getPriorite());
        if(priorite > o.priorite){
            return 1;
        } else if (priorite < o.priorite) {
            return -1;
        }else{
            return 0;
        }
    }
}

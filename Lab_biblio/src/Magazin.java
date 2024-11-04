

public class Magazin extends Document {

    private int num;

    public Magazin(int id, String titre, int num){
        super(id,titre);
        this.num=num;
    }

    @Override
    void afficherInfo() {
        System.out.println("Magazin{" +
                "id='" + this.getId() + '\'' +
                ", titre=" + this.getTitre() +
                "num='" + num + '\'' +
                '}');
    }

}

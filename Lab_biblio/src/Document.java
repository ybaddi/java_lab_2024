public abstract class Document {
private int id;
private String titre;

public Document(int id, String titre){
    this.id=id;
    this.titre = titre;
}

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    abstract void afficherInfo();
}

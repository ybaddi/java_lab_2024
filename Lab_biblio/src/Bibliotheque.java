import java.util.ArrayList;
import java.util.List;

public class Bibliotheque <T extends Document> {

    List<T> documents;

    public Bibliotheque() {
        this.documents = new ArrayList<>();
    }

   void  ajouterDocument(T document){
        documents.add(document);
    }

    void  supprimerDocument(int id){
documents.removeIf(doc -> doc.getId() == id);
    }

    void  afficherTousLesDocument(){
        System.out.println("display all ducument : ");
        for(T doc: documents)
            doc.afficherInfo();
    }
}

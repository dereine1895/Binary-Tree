import utils.*;

public class Ahnenbaum {
    private BinaryTree<Ahne> GohansAhnenbaum;

    Ahnenbaum(){
        BinaryTree<Ahne> b1 = new BinaryTree<>(new Ahne("Opa","Rinderteufel","M"));
        BinaryTree<Ahne> b2 = new BinaryTree<>(new Ahne("Oma","Unbekannt","W"));
        BinaryTree<Ahne> b3 = new BinaryTree<>(new Ahne("Chi", "Chi","W"),b1,b2);
        BinaryTree<Ahne> b4 = new BinaryTree<>(new Ahne("Oma","Gine","W"));
        BinaryTree<Ahne> b5 = new BinaryTree<>(new Ahne("Opa","Bardock","M"));
        BinaryTree<Ahne> b6 = new BinaryTree<>(new Ahne("Son", "Goku","M"),b4,b5);
        GohansAhnenbaum = new BinaryTree<Ahne>(new Ahne("Son", "Gohan","M"),b3,b6);
    }

    public void PreSearchAusgabe(){
        PreSearchAusgabe(GohansAhnenbaum);
    }
   public void PreSearch(BinaryTree<Ahne> pBinaryTree){
        if()


   }


}


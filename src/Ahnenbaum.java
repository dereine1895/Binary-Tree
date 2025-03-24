import utils.*;

public class Ahnenbaum {
    private BinaryTree<Ahne> GohansAhnenbaum;

    public Ahnenbaum(){
        BinaryTree<Ahne> b1 = new BinaryTree<>(new Ahne("Opa","Rinderteufel","M"));
        BinaryTree<Ahne> b2 = new BinaryTree<>(new Ahne("Oma","Unbekannt","W"));
        BinaryTree<Ahne> b3 = new BinaryTree<>(new Ahne("Chi", "Chi","W"),b1,b2);
        BinaryTree<Ahne> b4 = new BinaryTree<>(new Ahne("Oma","Gine","W"));
        BinaryTree<Ahne> b5 = new BinaryTree<>(new Ahne("Opa","Bardock","M"));
        BinaryTree<Ahne> b6 = new BinaryTree<>(new Ahne("Son", "Goku","M"),b4,b5);
        GohansAhnenbaum = new BinaryTree<>(new Ahne("Son", "Gohan","M"),b3,b6);
    }

    public void PreSearchAusgabe(){
        PreSearch(GohansAhnenbaum);
    }
   public void PreSearch(BinaryTree<Ahne> pBinaryTree){
        if(!pBinaryTree.isEmpty()){
            System.out.println(pBinaryTree.getContent().getVorname());
        }
       if(!pBinaryTree.getLeftTree().isEmpty()){
          PreSearch(pBinaryTree.getLeftTree());
       }
       if(!pBinaryTree.getRightTree().isEmpty()){
           PreSearch(pBinaryTree.getRightTree());
       }



   }
   public void PostSearchAusgabe(){
        PostSearch(GohansAhnenbaum);
   }

   public void PostSearch(BinaryTree<Ahne> pBinaryTree){
       if(!pBinaryTree.getLeftTree().isEmpty()){
           PreSearch(pBinaryTree.getLeftTree());
       }

       if(!pBinaryTree.getRightTree().isEmpty()){
           PreSearch(pBinaryTree.getRightTree());
       }

       if(!pBinaryTree.isEmpty()){
           System.out.println(pBinaryTree.getContent().getVorname());
       }

   }
   public void InSearchAusgabe(){
       InSearch(GohansAhnenbaum);
    }

    public void InSearch(BinaryTree<Ahne> pBinaryTree){
        if(!pBinaryTree.getLeftTree().isEmpty()){
            PreSearch(pBinaryTree.getLeftTree());
        }

        if(!pBinaryTree.isEmpty()){
            System.out.println(pBinaryTree.getContent().getVorname());
        }

        if(!pBinaryTree.getRightTree().isEmpty()){
            PreSearch(pBinaryTree.getRightTree());
        }

    }


}


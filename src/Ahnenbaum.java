
import utils.*;

public class Ahnenbaum {
    private BinaryTree<Ahne> GohansAhnenbaum;

    public Ahnenbaum(){
        BinaryTree<Ahne> b1 = new BinaryTree<>(new Ahne("Rinderteufel","Opa",'M'));
        BinaryTree<Ahne> b2 = new BinaryTree<>(new Ahne("Unbekannt","Oma",'W'));
        BinaryTree<Ahne> b3 = new BinaryTree<>(new Ahne("ChiChi", "Unbekannt",'W'),b1,b2);
        BinaryTree<Ahne> b4 = new BinaryTree<>(new Ahne("Gine","Oma",'W'));
        BinaryTree<Ahne> b5 = new BinaryTree<>(new Ahne("Bardock","Opa",'M'));
        BinaryTree<Ahne> b6 = new BinaryTree<>(new Ahne( "Goku","Son",'M'),b4,b5);
        GohansAhnenbaum = new BinaryTree<>(new Ahne( "Gohan","Son",'M'),b3,b6);
    }

    public void PreSearchAusgabe(){
        PreSearch(GohansAhnenbaum);
    }
   private void PreSearch(BinaryTree<Ahne> pBinaryTree){
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

   private void PostSearch(BinaryTree<Ahne> pBinaryTree){
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

    private void InSearch(BinaryTree<Ahne> pBinaryTree){
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


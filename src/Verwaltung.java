import java.util.Scanner;

public class Verwaltung {

    private Scanner scanner;

    public static void main(String[] args) {
        new Verwaltung();
        System.out.println("Herzlich willkommen zu Son Gohans Ahnenbaum!");
    }

    public Verwaltung(){
        scanner = new Scanner(System.in);

        Ahnenbaum Gohan= new Ahnenbaum();
        System.out.println("PreOrder Traversierung:");
        Gohan.PreSearchAusgabe();
        System.out.println("InOrder Traversierung:");
        Gohan.InSearchAusgabe();
        System.out.println("PostOrder Traversierung:");
        Gohan.PostSearchAusgabe();

    }






}

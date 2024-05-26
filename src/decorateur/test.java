package decorateur;
import Modele.Oeuvre;
import interfaces.ElementBibliotheque;

public class test {
    public static void main(String[] args){

        ElementBibliotheque elementt = new  Oeuvre();
        System.out.println("TVA de base  "+elementt.getTVA());
        ElementBibliotheque element = new Livre(new Oeuvre());
        System.out.println("TVA  Pour les livres "+element.getTVA());

        ElementBibliotheque element2 = new Magazine(new Oeuvre());
        System.out.println("TVA Pour les Magazine "+element2.getTVA());
    }
}




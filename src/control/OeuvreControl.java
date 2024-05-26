package control;

import Modele.Oeuvre;
import Utility.BibalExceptions;
import decorateur.Livre;
import interfaces.ElementBibliotheque;

import java.util.ArrayList;


public class OeuvreControl {

    public static void ajouter(Oeuvre oeuvre) throws BibalExceptions {
        // Vérification de la validité des informations
        if (oeuvre.getTitre() == null || oeuvre.getTitre().isEmpty()) {
            throw new BibalExceptions("Le titre de l'oeuvre est requis.");
        }
        if (oeuvre.getAuteur() == null || oeuvre.getAuteur().isEmpty()) {
            throw new BibalExceptions("L'auteur de l'oeuvre est requis.");
        }
        if (oeuvre.getCategorie() == null || oeuvre.getCategorie().isEmpty()) {
            throw new BibalExceptions("La catégorie de l'oeuvre est requise.");
        }

        // Appel de la méthode d'ajout de l'oeuvre dans la classe OeuvreDAO
        new OeuvreDAO().ajouter(oeuvre);
    }

    public static void modifier(Oeuvre oeuvre) throws BibalExceptions {

        ElementBibliotheque oeuvreAvecDetails = new Livre(oeuvre);

        // Utilisez l'objet décoré selon vos besoins
        System.out.println(oeuvreAvecDetails.toString());
        // Vérification de la validité des informations
        if (oeuvre.getId() <= 0) {
            throw new BibalExceptions("Identifiant de l'oeuvre non valide !");
        }
        if (oeuvre.getTitre() == null || oeuvre.getTitre().isEmpty()) {
            throw new BibalExceptions("Le titre de l'oeuvre est requis.");
        }
        if (oeuvre.getAuteur() == null || oeuvre.getAuteur().isEmpty()) {
            throw new BibalExceptions("L'auteur de l'oeuvre est requis.");
        }
        if (oeuvre.getCategorie() == null || oeuvre.getCategorie().isEmpty()) {
            throw new BibalExceptions("La catégorie de l'oeuvre est requise.");
        }

        // Appel de la méthode de modification de l'oeuvre dans la classe OeuvreDAO
        new OeuvreDAO().modifier(oeuvre);
    }

    public static void supprimer(Oeuvre oeuvre) throws BibalExceptions {
        // Appel de la méthode de suppression de l'oeuvre dans la classe OeuvreDAO
        new OeuvreDAO().delete(oeuvre);
    }

    public static Oeuvre findById(int id) throws BibalExceptions {
        // Appel de la méthode de recherche par identifiant dans la classe OeuvreDAO
        return new OeuvreDAO().findById(id);
    }

    public static ArrayList<Oeuvre> findByTitre(String titre) throws BibalExceptions {
        // Appel de la méthode de recherche par titre dans la classe OeuvreDAO
        return new OeuvreDAO().findByTitre(titre);
    }

    public static ArrayList<Oeuvre> getListOeuvres() throws BibalExceptions {
        Oeuvre oeuvre = new Oeuvre();
        ElementBibliotheque oeuvreAvecDetails = new Livre(oeuvre);

        // Utilisez l'objet décoré selon vos besoins
        System.out.println(oeuvreAvecDetails.toString());
        // Appel de la méthode de récupération de la liste des oeuvres dans la classe OeuvreDAO
        return new OeuvreDAO().getListOeuvres();
    }

}

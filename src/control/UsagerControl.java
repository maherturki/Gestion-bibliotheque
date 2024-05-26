package control;

import Modele.Usager;
import Utility.BibalExceptions;
import interfaces.UsagerInterface;

import java.util.ArrayList;
public class UsagerControl {

    public static void ajouter(UsagerInterface usagerInterface, Usager usager) throws BibalExceptions {
        usagerInterface.ajouter(usager);
    }

    public static void modifier(UsagerInterface usagerInterface, Usager usager) throws BibalExceptions {
        usagerInterface.modifier(usager);
    }

    public static void supprimer(UsagerInterface usagerInterface, Usager usager) throws BibalExceptions {
        usagerInterface.delete(usager);
    }

    public static Usager findById(UsagerInterface usagerInterface, int id) throws BibalExceptions {
        return usagerInterface.findById(id);
    }
    public static ArrayList<Usager> findByNom(UsagerInterface usagerInterface, String nom) throws BibalExceptions {
        return usagerInterface.findByNom(nom);
    }
    public static ArrayList<Usager> getListUsagers(UsagerInterface usagerInterface) throws BibalExceptions {
        return usagerInterface.getListUsagers();
    }
}

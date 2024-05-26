package interfaces;

import Modele.Usager;
import Utility.BibalExceptions;

import java.util.ArrayList;

public interface UsagerInterface {
    void ajouter(Usager usager) throws BibalExceptions;
    void modifier(Usager usager) throws BibalExceptions;
    void delete(Usager usager) throws BibalExceptions;
    ArrayList<Usager> getListUsagers() throws BibalExceptions;
    Usager findById(int id) throws BibalExceptions;
    ArrayList<Usager> findByNom(String nom) throws BibalExceptions;
}
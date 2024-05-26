package Modele;
import Utility.BibalExceptions;
import interfaces.ElementBibliotheque;

import java.util.Vector;

public class Oeuvre implements ElementBibliotheque {

    protected int id;
    protected String titre;
    protected String auteur;
    protected String categorie;
    protected int nbResa;
    public Vector<Exemplaire> examplairesOeuvre = new Vector<>();
    protected Vector<Reservation> reservationsOeuvre = new Vector<>();

    public int getId() {
        return id;
    }

    public void setId(int id) throws BibalExceptions {
        if (id <= 0) {
            throw new BibalExceptions("Identifiant Oeuvre non valide !");
        }
        this.id = id;
    }

    public String getCategorie() {
        return this.categorie;
    }

    public void setCategorie(String categorie) throws BibalExceptions {
        if (null != categorie) {
            if (categorie.length() < 3) {
                throw new BibalExceptions("Le nom de la catégorie doit contenir "
                        + "au moins 3 caractères");
            }
        } else {
            throw new BibalExceptions("Merci de saisir une catégorie ");
        }
        this.categorie = categorie;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public void setAuteur(String auteur) throws BibalExceptions {
        if (null != auteur) {
            if (auteur.length() < 3) {
                throw new BibalExceptions("Le nom de l'auteur doit avoir "
                        + "au moins 3 caractères");
            }
        } else {
            throw new BibalExceptions("Merci de saisir un nom ");
        }
        this.auteur = auteur;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setTitre(String titre) throws BibalExceptions {
        if (null != titre) {
            if (titre.length() < 3) {
                throw new BibalExceptions("Le titre doit avoir "
                        + "au moins 3 caractères");
            }
        } else {
            throw new BibalExceptions("Merci de saisir le titre de l'oeuvre ");
        }
        this.titre = titre;
    }

    public int getNbResa() {
        return this.nbResa;
    }

    public void setNbResa(int nbResa) {
        this.nbResa = nbResa;
    }

    public Vector<Exemplaire> getExamplairesOeuvre() {
        return examplairesOeuvre;
    }

    public void setExamplairesOeuvre(Vector<Exemplaire> examplairesOeuvre) {
        this.examplairesOeuvre = examplairesOeuvre;
    }

    public Vector<Reservation> getReservationsOeuvre() {
        return reservationsOeuvre;
    }

    public void setReservationsOeuvre(Vector<Reservation> reservationsOeuvre) {
        this.reservationsOeuvre = reservationsOeuvre;
    }

    @Override
    public  double getTVA(){
        return 20;
    }
    @Override
    public String toString() {
        return "Oeuvre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", categorie='" + categorie + '\'' +
                ", nbResa=" + nbResa +
                '}';
    }

}

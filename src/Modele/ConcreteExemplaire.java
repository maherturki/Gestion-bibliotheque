package Modele;



public class ConcreteExemplaire extends Exemplaire {

    private boolean disponible;

    public ConcreteExemplaire() {
        super();
    }

    public ConcreteExemplaire(int id, String etat, boolean disponible) {
        super(id, etat);
        this.disponible = disponible;
    }

    public boolean getDisponible() {
        return disponible;
    }


    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}


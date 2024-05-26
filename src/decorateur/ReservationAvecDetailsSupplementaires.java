package decorateur;

import interfaces.ElementBibliotheque;

public class ReservationAvecDetailsSupplementaires extends DecorateurElementBibliotheque {
    public ReservationAvecDetailsSupplementaires(ElementBibliotheque elementBibliotheque) {
        super(elementBibliotheque);
    }

    @Override
    public String toString() {
        return super.toString() + " - Détails supplémentaires de la réservation : ...";
    }
}
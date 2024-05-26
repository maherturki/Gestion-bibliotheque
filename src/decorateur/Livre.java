package decorateur;

import interfaces.ElementBibliotheque;

public class Livre extends DecorateurElementBibliotheque {
    public Livre(ElementBibliotheque elementBibliotheque) {
        super(elementBibliotheque);
    }
    @Override
    public double getTVA()
    {
        return super.getTVA()+40;
    }
}




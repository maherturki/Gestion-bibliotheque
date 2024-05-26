package decorateur;

import interfaces.ElementBibliotheque;

public class Magazine extends DecorateurElementBibliotheque {
    public Magazine(ElementBibliotheque elementBibliotheque) {
        super(elementBibliotheque);
    }
    @Override
    public double getTVA()
    {
        return super.getTVA()+10;
    }
}






package decorateur;

import interfaces.ElementBibliotheque;

public abstract class DecorateurElementBibliotheque implements ElementBibliotheque {
    protected ElementBibliotheque elementBibliotheque;

    public DecorateurElementBibliotheque(ElementBibliotheque elementBibliotheque) {
        this.elementBibliotheque = elementBibliotheque;
    }


    @Override
    public  double getTVA(){
        return  this.elementBibliotheque.getTVA();
    }
}




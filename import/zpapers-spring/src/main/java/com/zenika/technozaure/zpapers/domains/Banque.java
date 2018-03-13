package com.zenika.technozaure.zpapers.domains;


public class Banque extends AbstractDomain{
    private String libelle;


    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Banque{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}

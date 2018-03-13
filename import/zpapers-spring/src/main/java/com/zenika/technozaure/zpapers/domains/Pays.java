package com.zenika.technozaure.zpapers.domains;

public class Pays extends AbstractDomain{

    private String libelle, code;

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "libelle='" + libelle + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}

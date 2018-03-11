package com.zenika.technozaure.zpapers.domains;

public class TypePersonne extends AbstractDomain {

    private String libelle,code;

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
        return "TypePersonne{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}

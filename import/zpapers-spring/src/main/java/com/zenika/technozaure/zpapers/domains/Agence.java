package com.zenika.technozaure.zpapers.domains;

import org.neo4j.ogm.annotation.GraphId;

public class Agence extends AbstractDomain{

    @GraphId
    private Long id;
    private String libelle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Agence{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}

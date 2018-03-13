package com.zenika.technozaure.zpapers.domains;

import java.util.Date;

public class Facture extends AbstractDomain {


    private String libelle,destinataire, intitule;
    private double montant;
    private Date dateEmission;


    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDateEmission() {
        return dateEmission;
    }

    public void setDateEmission(Date dateEmission) {
        this.dateEmission = dateEmission;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "libelle='" + libelle + '\'' +
                ", destinataire='" + destinataire + '\'' +
                ", intitule='" + intitule + '\'' +
                ", montant=" + montant +
                ", dateEmission=" + dateEmission +
                ", id=" + id +
                '}';
    }
}

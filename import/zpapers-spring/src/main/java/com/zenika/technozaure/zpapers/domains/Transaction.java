package com.zenika.technozaure.zpapers.domains;

import org.neo4j.ogm.annotation.typeconversion.DateString;

import java.util.Date;

public class Transaction extends AbstractDomain {

    private String sens,destinataire,emetteur,libelle;
    private double montant;
    @DateString("yyyy-MM-dd")
    private Date date;

    public String getSens() {
        return sens;
    }

    public void setSens(String sens) {
        this.sens = sens;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public String getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(String emetteur) {
        this.emetteur = emetteur;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "sens='" + sens + '\'' +
                ", destinataire='" + destinataire + '\'' +
                ", emetteur='" + emetteur + '\'' +
                ", libelle='" + libelle + '\'' +
                ", montant=" + montant +
                ", date=" + date +
                ", id=" + id +
                '}';
    }
}

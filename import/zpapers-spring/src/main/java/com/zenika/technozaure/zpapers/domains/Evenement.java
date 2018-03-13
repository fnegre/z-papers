package com.zenika.technozaure.zpapers.domains;

import java.util.Date;

public class Evenement extends AbstractDomain {
    private String libelle, raison, pays;
    private Date dateDebut, dateFin;

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    @Override
    public String toString() {
        return "Evenement{" +
                "libelle='" + libelle + '\'' +
                ", raison='" + raison + '\'' +
                ", pays='" + pays + '\'' +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", id=" + id +
                '}';
    }
}

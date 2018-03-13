package com.zenika.technozaure.zpapers.domains;

import java.util.Date;

public class Adresse extends  AbstractDomain {

    private int numero;
    private String voie,ville,pays;
    private Date dateDebut, dateFin;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
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
        return "Adresse{" +
                "numero=" + numero +
                ", voie='" + voie + '\'' +
                ", ville='" + ville + '\'' +
                ", pays='" + pays + '\'' +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", id=" + id +
                '}';
    }
}

package com.zenika.technozaure.zpapers.domains;

import java.util.Date;

public class Echange extends AbstractDomain {

    private String type, pj, destinataire,contenu, objet;
    private Date dateDebut,DateFin;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPj() {
        return pj;
    }

    public void setPj(String pj) {
        this.pj = pj;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return DateFin;
    }

    public void setDateFin(Date dateFin) {
        DateFin = dateFin;
    }

    @Override
    public String toString() {
        return "Echange{" +
                "type='" + type + '\'' +
                ", pj='" + pj + '\'' +
                ", destinataire='" + destinataire + '\'' +
                ", contenu='" + contenu + '\'' +
                ", objet='" + objet + '\'' +
                ", dateDebut=" + dateDebut +
                ", DateFin=" + DateFin +
                ", id=" + id +
                '}';
    }
}

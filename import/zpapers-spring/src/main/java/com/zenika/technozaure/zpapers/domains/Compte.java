package com.zenika.technozaure.zpapers.domains;

import java.util.Date;

public class Compte extends AbstractDomain{

    private String ibelle;

    private Date dateOuverture;

    public String getIbelle() {
        return ibelle;
    }

    public void setIbelle(String ibelle) {
        this.ibelle = ibelle;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", ibelle='" + ibelle + '\'' +
                ", dateOuverture=" + dateOuverture +
                '}';
    }
}

package com.zenika.technozaure.zpapers.domains;


import java.util.Date;

public class Personne extends AbstractDomain{

    private String nom, prenom, compteTwitter, compteGithub,sexe, profession;

    private Date dateNaissance;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCompteTwitter() {
        return compteTwitter;
    }

    public void setCompteTwitter(String compteTwitter) {
        this.compteTwitter = compteTwitter;
    }

    public String getCompteGithub() {
        return compteGithub;
    }

    public void setCompteGithub(String compteGithub) {
        this.compteGithub = compteGithub;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", compteTwitter='" + compteTwitter + '\'' +
                ", compteGithub='" + compteGithub + '\'' +
                ", sexe='" + sexe + '\'' +
                ", profession='" + profession + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }
}
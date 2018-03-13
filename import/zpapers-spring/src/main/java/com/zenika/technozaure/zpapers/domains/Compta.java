package com.zenika.technozaure.zpapers.domains;

public class Compta extends AbstractDomain {

private String ville;

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Compta{" +
                "id=" + id +
                '}';
    }
}

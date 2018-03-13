package com.zenika.technozaure.zpapers.domains;

public class Consultant extends AbstractDomain{

    private String tel,email;

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}

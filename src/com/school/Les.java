package com.school;

public class Les {
    private String vak;

    public Les(String vak) {
        this.vak = vak;
    }

    public String getVak() {
        return vak;
    }

    public void setVak(String vak) {
        this.vak = vak;
    }

    @Override
    public String toString() {
        return "Les{" +
                "vak='" + vak + '\'' +
                '}';
    }
}

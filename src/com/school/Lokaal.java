package com.school;

public class Lokaal extends School implements Locatie{

    private int lokaalNr;
    private String klas;

    public Lokaal(String naam, int lokaalNr, String klas) {
        super(naam);
        this.lokaalNr = lokaalNr;
        this.klas = klas;
    }

    public int getLokaalNr() {
        return lokaalNr;
    }

    public String getKlas() {
        return klas;
    }

    @Override
    public String toString() {
        return "Lokaal{" +
                "School=" + getSchool() +
                ", lokaalNr=" + lokaalNr +
                ", klas='" + klas + '\'' +
                '}';
    }
}

package com.school;

public class Student {
    private String naam;
    private String klas;

    public Student(String naam, String klas) {
        this.naam = naam;
        this.klas = klas;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setKlas(String klas) {
        this.klas = klas;
    }

    public String getNaam() {
        return naam;
    }

    public String getKlas() {
        return klas;
    }

    @Override
    public String toString() {
        return "Student: " +
                naam +
                " zit in klas: " +
                klas;
    }
}

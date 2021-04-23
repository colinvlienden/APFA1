package com.school;

public class Student extends Persoon implements Deelnemers {

    private int studentNr;
    private String klas;

    public Student(String naam, int studentNr, String klas) {
        super(naam);
        this.studentNr = studentNr;
        this.klas = klas;
    }

    public int getStudentNr() {
        return studentNr;
    }

    public String getKlas() {
        return klas;
    }

    @Override
    public String toString() {
        return "Student{" +
                "naam='" + getPersoon() + '\'' +
                ", studentNr=" + studentNr +
                ", klas='" + klas + '\'' +
                '}';
    }
}
package com.school;

public class Les {
    private final Locatie locatie;
    private final Deelnemers deelnemers;
    private String tijdVak;

    public Les(Locatie locatie, Deelnemers deelnemers, String tijdVak) throws Exception {
        this.locatie = locatie;
        this.deelnemers = deelnemers;
        this.tijdVak = tijdVak;
        if (! deelnemers.getKlas().equals(locatie.getKlas())){
            throw new Exception("Klas komt NIET overheen!");
        }
        else{
            System.out.println("Klas komt overheen");

        }

    }

    @Override
    public String toString() {
        return "Les: " + locatie.getKlas() +
                "\nLokaal: " + locatie.getLokaalNr() +
                "\nStudent: " + deelnemers.getPersoon() +
                "\nStudentnummer: " + deelnemers.getStudentNr() +
                "\ntijdvak: " + tijdVak + "\n";
    }
}
package model;

public class Kunde extends Person{

    private final String knNr;

    public Kunde(String knNr,String name) {
        super(name);
        this.knNr = knNr;
    }

    public String getKnNr() {
        return knNr;
    }
}

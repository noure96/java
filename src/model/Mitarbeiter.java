package model;

public class Mitarbeiter extends Person{
    private final String psNr;

    public Mitarbeiter(String psNr,String name) {
        super(name);
        this.psNr = psNr;
    }

    public String getPsNr() {
        return psNr;
    }
}

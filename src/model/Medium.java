package model;

public abstract class Medium implements Ausleihbar{
    private int id;
    private String title;

    private boolean verfuebar = true;

    public Medium(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isVerfuebar() {
        return verfuebar;
    }

    public void setVerfuebar(boolean verfuebar) {
        this.verfuebar = verfuebar;
    }

    @Override
    public boolean istVerfuegbar() {
        return false;
    }

    @Override
    public boolean zurueckgeben() {
        this.verfuebar = true;
        return true;
    }

    @Override
    public boolean ausleihen() {
        this.verfuebar = false;
        return true;
    }
}

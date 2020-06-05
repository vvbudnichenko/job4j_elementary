package ru.job4j.tracker;

public class Builder extends Engineer {
    private String draftsman;
    private String structural;

    public Builder(String name, String surname, String education, int day, int month, int year, String diagnose) {
        super(name, surname, education, day, month, year, diagnose);
    }

    public void showing(String draftsman, String structural) {
        this.draftsman = draftsman;
        this.structural = structural;
    }
    public String getDraftsman() {
        return draftsman;
    }
    public String getStructural() {
        return structural;
    }
}

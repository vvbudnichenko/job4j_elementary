package ru.job4j.rubbish;

public class Engineer extends Profession {
    private String highLevel;
    private String site;

    public Engineer() {
    }

    public Engineer(String name, String surname, String education, int day, int month, int year, String highLevel) {
        super(name, surname, education, day, month, year);
        this.highLevel = highLevel;
    }
    public String getHighLevelLevel() {
        return highLevel;
    }
    public void getSite(String site) {
        this.site = site;
        Office office = new Office();
        office.stayHome(site);
    }
}

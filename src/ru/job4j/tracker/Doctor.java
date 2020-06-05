package ru.job4j.tracker;

public class Doctor extends Profession {
    private String diagnose;
    private String hospital;

    public Doctor() {
    }

    public Doctor(String name, String surname, String education, int day, int month, int year, String diagnose) {
        super(name, surname, education, day, month, year);
        this.diagnose = diagnose;
    }
    public String getDiagnose() {
        return diagnose;
    }
    public void getHospital(String hospital) {
        this.hospital = hospital;
        Office placing = new Office();
        placing.goOffice(hospital);
    }
}
package hw11;

public class Demographics extends Employee {

    private String gender;
    private String race;
    private int yearhired;

    public Demographics(String name, String lastName, int year, String gender, String race, int yearhired) {
        super(name, lastName, year);
        this.gender = gender;
        this.race = race;
        this.yearhired = yearhired;
    }

    public Demographics() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getYearhired() {
        return yearhired;
    }

    public void setYearhired(int yearhired) {
        this.yearhired = yearhired;
    }
}

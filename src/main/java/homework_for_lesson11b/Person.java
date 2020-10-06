package homework_for_lesson11b;

public class Person {
    protected String name;
    protected String lastName;
    protected String ocupation;
    protected int yearExperience;

    public Person(String name, String lastName, String occupation, int yearExperience) {
        this.name = name;
        this.lastName = lastName;
        this.ocupation = ocupation;
        this.yearExperience = yearExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public int getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(int yearExperience) {
        this.yearExperience = yearExperience;
    }


}

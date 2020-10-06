package homework_for_lesson11b;

public class Developers extends Person{
    private String language;

    public Developers(String name, String lastName, String ocupation, int yearExperience, String language) {
        super(name, lastName, ocupation, yearExperience);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}

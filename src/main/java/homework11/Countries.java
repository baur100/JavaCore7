package homework11;

public class Countries {
    protected String name;
    protected int population;
    protected String language;
    protected String religion;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public Countries(String name, int population, String language, String religion) {
        this.name = name;
        this.population = population;
        this.language = language;
        this.religion = religion;
    }

    public void info() {
        System.out.println("I am from " + " " + name + " " + "I speak" + " " + language);

    }

}
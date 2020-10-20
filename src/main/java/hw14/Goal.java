package hw14;

public class Goal {
    // Goal name
    private String name;
    // Goal reach year
    private int year;
    // Goal capital needs to reach
    private int capital;

    public Goal(String name, int year, int capital) {
        this.name = name;
        this.year = year;
        this.capital = capital;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getYear() { return year; }

    public void setYear(int year) { this.year = year; }

    public int getCapital() { return capital; }

    public void setCapital(int capital) { this.capital = capital; }

    public void printGoal() {
        System.out.println("Goal " + this.getName() + " until " + this.getYear() + " with capital " + this.getCapital());
    }
}

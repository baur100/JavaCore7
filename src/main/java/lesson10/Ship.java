package lesson10;

public class Ship {
    private String name;
    private String type;
    private int year;

    public static void sail() {
        System.out.println("The ship is going to Africa");
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

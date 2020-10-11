package MyHomeworkQA.TheHospital;

public class Doctor {

    private String name;
    private String lastName;
    private Position position;

    public Doctor(String name, String lastname, Position pos)
    {
        this.name = name;
        this.lastName = lastname;
        this.position = pos;
    }

    public String printInfo() {
        return "Doctor: "+name+" "+lastName+" | Title: "+position;
    }

    @Override
    public String toString() {
        return "Doctor { " +
                "First Name: '" + name + '\'' +
                ", Last Name: '" + lastName + '\'' +
                ", Title: " + position +
                " }";
    }
}

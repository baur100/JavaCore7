package hospitalHomework;

public class Doctor {
    private String name;
    private String lastName;
    private Title position;

    public Doctor(String name, String lastName, Title position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position=" + position +
                '}';
    }
}

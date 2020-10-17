package HW_hospital;

public class Doctors {
    private String name;
    private String lastname;
    private Positions positions;

    public Doctors(String name, String lastname, Positions positions) {
        this.name = name;
        this.lastname = lastname;
        this.positions = positions;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", positions=" + positions + "}";
    }
}

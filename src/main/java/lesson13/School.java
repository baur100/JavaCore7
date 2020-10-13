package lesson13;

public class School {
    private Address address;
    private SchoolType type;
    private String name;
    private SchoolGrade grade;

    public School(Address address, SchoolType type, String name, SchoolGrade grade) {
        this.address = address;
        this.type = type;
        this.name = name;
        this.grade = grade;
    }

    public void setType(SchoolType type) {
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public SchoolType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public SchoolGrade getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "School{" +
                "address=" + address +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

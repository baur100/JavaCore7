package aelesson13;

public class School {
    private Address address;
    private SchoolType type;
    private String name;
    private SchoolGrade grate;

    public School(Address address, SchoolType type, String name, SchoolGrade grate) {
        this.address = address;
        this.type = type;
        this.name = name;
        this.grate = grate;
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

    public SchoolGrade getGrate() {
        return grate;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setType(SchoolType type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrate(SchoolGrade grate) {
        this.grate = grate;
    }

    @Override
    public String toString() {
        return "School{" +
                "address=" + address +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", grate=" + grate +
                '}';
    }
}

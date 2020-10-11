package Lesson_14_Homework;

public class Hospital {
    private String hospitalName;
    private Address address;

    public Hospital(String hospitalName, Address address) {
        this.hospitalName = hospitalName;
        this.address = address;
    }

    public Hospital() {
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

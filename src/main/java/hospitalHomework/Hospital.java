package hospitalHomework;

import java.util.List;
import java.util.Map;

public class Hospital {
    private String name;
    private Address address;
    private List<Doctor> doctors;
    Map<Integer,String> rooms;
    List<InsuranceCompany> acceptedIns;

    public Hospital(String name, Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsuranceCompany> acceptedIns) {
        this.name = name;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedIns = acceptedIns;
    }
}

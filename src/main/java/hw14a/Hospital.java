package hw14a;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    Map<Integer, String> rooms;
    List<InsuranceCompany> insurance;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsuranceCompany> insurance) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.insurance = insurance;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", address=" + address +
                ", doctors=" + doctors +
                ", rooms=" + rooms +
                ", insurance=" + insurance +
                '}';
    }
}

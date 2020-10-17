package HW_hospital;

import hospitalHomework.InsuranceCompany;

import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctors> doctors;
    Map<Integer,String> rooms;
    private List<InsuraceCo> Insurances;

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", address=" + address +
                ", doctors=" + doctors +
                ", rooms=" + rooms +
                ", Insurances=" + Insurances +
                '}';
    }

    public Hospital(String hospitalName, Address address, List<Doctors> doctors, Map<Integer, String> rooms, List<InsuraceCo> insurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        Insurances = insurances;

    }
}

package homework_for_lesson14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private HashMap<Integer,String> rooms;
    private ArrayList<InsuranceCompanies> acceptedInsurances;


    public Hospital(String hospitalName, Address address, List<Doctor> doctors, HashMap<Integer, String> rooms, ArrayList<InsuranceCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }

    public ArrayList<InsuranceCompanies> getAcceptedInsurances() {
        return acceptedInsurances;
    }

    @Override
    public String toString() {
        return "The best hospital in Boston is" + " " + hospitalName + '\n' +
                "address=" + address + '\n'+
                "doctors=" + doctors + '\n'+
                "rooms=" + rooms + '\n'+
                "acceptedInsurances=" + acceptedInsurances ;
    }
}

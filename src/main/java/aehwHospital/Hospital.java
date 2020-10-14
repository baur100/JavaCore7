package aehwHospital;

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

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(HashMap<Integer, String> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<InsuranceCompanies> getAcceptedInsurances() {
        return acceptedInsurances;
    }

    public void setAcceptedInsurances(ArrayList<InsuranceCompanies> acceptedInsurances) {
        this.acceptedInsurances = acceptedInsurances;
    }

    @Override
    public String toString() {
        return "Hospital:" +
                "\nhospitalName= " + hospitalName +
                "\nAddress= " + address +
                "\nDoctors= " + doctors +
                "\nRooms= " + rooms +
                "\nAccepted Insurances= " + acceptedInsurances;
    }

    public void printDoctors(){
        for (Doctor d : doctors){
            System.out.println(d.getName() + " " + d.getLastName() + " is " + d.getPosition());
        }
    }
}

package again;

import MyHomeworkForToday.InsuranceCompanies;

import java.util.HashMap;
import java.util.List;

public class Hospital {
    private String name;
    private Address address;
    private List<Doctors> doctors;
    private List<Position> positions;
    private HashMap<Integer, String> rooms;
    private List<InsuranceCompanies> acceptedInsurances;

    public Hospital(String name, Address address, List<Doctors> doctors, List<Position> positions, HashMap<Integer, String> rooms, List <InsuranceCompanies> acceptedInsurances) {
        this.name = name;
        this.address = address;
        this.positions = positions;
        this.rooms = rooms;
        this.doctors = doctors;
        this.acceptedInsurances = acceptedInsurances;


    }

    public void printHospital() {
        System.out.println(name +  " " + address);

        for (Doctors d : doctors) {
            System.out.println(d.toString());
        }


        for (InsuranceCompanies i : acceptedInsurances) {
            System.out.println("in" + i);
        }


        for (Position p : positions) {
            System.out.println("positions" + p);

        }
        for (Integer x : rooms.keySet()) {
            System.out.println(x + " " + rooms.get(x));
        }
    }

}



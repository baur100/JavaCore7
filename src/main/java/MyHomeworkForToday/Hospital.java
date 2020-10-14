package MyHomeworkForToday;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital {

    private String hospitalName;
    private Address address;
    private  HashMap <Integer, String>  rooms;
    private List <Doctors> doctors;



    public Hospital(String hospitalName, Address address, HashMap<Integer, String> rooms, List<Doctors> doctors, List<InsuranceCompanies> insurance) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.rooms = rooms;
        this.doctors = doctors;

    }

    public Hospital(String kaiser, Address kaiserAddress, Map<String, String> rooms) {

    }

    public void printHospital () {
            System.out.println( hospitalName + address);

            for (Doctors d: doctors){
                System.out.println(d.toString());
            }
        }

    }


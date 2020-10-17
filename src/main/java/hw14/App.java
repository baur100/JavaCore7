package hw14;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Hospital Doctors
        Doctor patric = new Doctor("Patric", "Neilson", Position.CARDIOLOGY);
        Doctor john = new Doctor("John", "Been", Position.CHIROPRACTOR);
        Doctor marine = new Doctor("Marine", "Mcalister", Position.THERAPIST);
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(patric);
        doctors.add(john);
        doctors.add(marine);

        // Hospital Rooms
        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(212, "Cardiology");
        rooms.put(386, "Surgery");
        rooms.put(243, "Optical");

        // Insurance companies
        ArrayList<InsuranceCompanies> insuranceCompanies = new ArrayList<>();
        insuranceCompanies.add(InsuranceCompanies.ALLSTATE);
        insuranceCompanies.add(InsuranceCompanies.EMPIRE);

        Hospital redCross = new Hospital("Red Cross",
                new Address("267 E 25 str", "Brooklyn", "NY", 22883),
                doctors,
                rooms,
                insuranceCompanies);

        System.out.println(redCross.toString());

        System.out.println("===================Doctors======================");

        for (Doctor doctor : doctors) {
            doctor.printDoctors();
        }

        System.out.println("===================Rooms======================");

        for (int key : rooms.keySet()) {
            System.out.println(key + " " + rooms.get(key));
        }
    }
}
//Create class Hospital
//Fields
//- private String hospitalName;
//    - privare Address address;
//        (Class Address
//        - private String streetAddress;
//        - private String town;
//        - private String state;
//        - private int zip;
//   - private List<Doctor> doctors;
//        (Class Doctor
//        - private String name;
//        - private String lastName;
//   - private Position position;
//        (Enum Title is a enum with 5 members - for example Position.PHYSICIAN);
//   - private HashMap<Integer,String> rooms; (list of rooms and their names - for example room 22 - Gastroenterology rooms.put(22,"Gastroenterology") )
//   - private ArrayList<InsuranseCompamies> acceptedInsuranses; list of accepted insurance.
//        (Enum InsuranseCompamies - enum of Insuranses,  for example InsuranseCompamies.AETNA, InsuranseCompamies.UnitedHealthcare)
//        Methods:
//        - Printout hospital with ALL fields
//        - Printout Doctors and their titles; public void printDoctors();
//        - Printout rooms

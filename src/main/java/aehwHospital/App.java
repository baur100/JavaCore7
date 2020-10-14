package aehwHospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Address hAddress = new Address("123 Main Street", "San Francisco", "CA", 94111);

        List<Doctor> hDoctors = new ArrayList<>();
        Doctor doctor1 = new Doctor("John", "Doe", Position.CARDIOLOGIST);
        Doctor doctor2 = new Doctor("Jack", "Black", Position.NEUROLOGIST);
        hDoctors.add(doctor1);
        hDoctors.add(doctor2);

        HashMap<Integer,String> hRooms = new HashMap<>();
        hRooms.put(10,"Cardiology");
        hRooms.put(12, "Neurology");
        hRooms.put(15, "Emergency");

        ArrayList<InsuranceCompanies> hInsCompanies = new ArrayList<>();
        hInsCompanies.add(InsuranceCompanies.KAISER);
        hInsCompanies.add(InsuranceCompanies.ANTHEM);
        hInsCompanies.add(InsuranceCompanies.UNITED_HELTHCARE);

        Hospital h1 = new Hospital("New Hospital", hAddress, hDoctors,hRooms, hInsCompanies);

        System.out.println(h1.toString());

        System.out.println("==========================");

        h1.printDoctors();

        System.out.println("==========================");

        for(Map.Entry<Integer, String> zz : hRooms.entrySet()){
            System.out.println(zz.getValue() + " is in room #" + zz.getKey());
        }

    }
}

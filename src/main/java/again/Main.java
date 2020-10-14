package again;

import MyHomeworkForToday.InsuranceCompanies;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Address address  = new Address ("505 W Broad Street", "Boise","ID",83702);

        HashMap <Integer, String> rooms = new HashMap<>();
        rooms.put(1, "cardiology");
        rooms.put(2, "surgery");
        rooms.put(3, "Delivery Room");



        Doctors doctor1 = new Doctors( "Brent", "Smith",Position.ANESTHESIOLOGIST);
        Doctors d1 = new Doctors("Brent","Smith", Position.ONCOLOGIST);
        Doctors d2 = new Doctors("Mary","Smith" , Position.ONCOLOGIST);

        List <Doctors> doctors = new ArrayList<>();
        doctors.add(d1);
        doctors.add(d2);
        doctors.add(doctor1);


        List<Position> positions = new ArrayList<>();
        positions.add(Position.PEDIATRICIAN);
        positions.add(Position.ONCOLOGIST);
        positions.add(Position.ANESTHESIOLOGIST);
        positions.add(Position.CARDIOLOGIST);



        List<InsuranceCompanies> acceptedInsurances = new ArrayList<>();


        acceptedInsurances.add(InsuranceCompanies.MEDICARE);
       acceptedInsurances.add(InsuranceCompanies.MEDICAL);



       Hospital Kaiser = new Hospital ("Kaiser", address, doctors, positions,  rooms, acceptedInsurances);


      Kaiser.printHospital();




    }
}

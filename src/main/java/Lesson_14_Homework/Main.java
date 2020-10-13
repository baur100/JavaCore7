package Lesson_14_Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Address address = new Address("1010 North Street", "Dallas", "TX", 75023);

        HashMap<Integer,String> rooms = new HashMap<>();
        rooms.put(1, "cardiology");
        rooms.put(2, "chiropractic");
        rooms.put(3, "gynecologist");
        rooms.put(4, "surgery");
        rooms.put(5, "urology");


        List<InsuranseCompamies> acceptedInsuranses = new ArrayList<InsuranseCompamies>();
        acceptedInsuranses.add(InsuranseCompamies.MEDICARE);
        acceptedInsuranses.add(InsuranseCompamies.UNITHEHEALTHCARE);
        acceptedInsuranses.add(InsuranseCompamies.AETHA);

        List<Position> positions = new ArrayList<>();
        positions.add(Position.CARDIOLOGIST);
        positions.add(Position.CHIROPRACTOR);
        positions.add(Position.GYNECOLOGIST);
        positions.add(Position.SURGEON);
        positions.add(Position.UROLOGIST);

        Doctor doctor1 = new Doctor("Kim", "Balt", Position.CARDIOLOGIST);
        Doctor doctor2 = new Doctor("Adam", "Hall", Position.CHIROPRACTOR);
        Doctor doctor3 = new Doctor("Anna", "Hull", Position.GYNECOLOGIST);
        Doctor doctor4 = new Doctor("Mila", "Full", Position.SURGEON);
        Doctor doctor5 = new Doctor("Jack", "Hash", Position.UROLOGIST);

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);
        doctors.add(doctor5);

        Hospital hospital = new Hospital("St. Marie", address, acceptedInsuranses, positions, doctors, rooms);
        hospital.printHospital();

    }
}

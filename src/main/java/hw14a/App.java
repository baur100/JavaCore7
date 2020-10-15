package hw14a;


import java.util.*;

public class App {
    public static void main(String[] args) {
        Address hospAddress = new Address("123 Main St", "Mentor", "Ohio", 44060);
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Joy", "Ertel", Position.PHYSICIAN));
        doctors.add(new Doctor("James", "Senft", Position.PHYSICIAN));
        doctors.add(new Doctor("Kathy", "Broski", Position.NURSE));
        doctors.add(new Doctor("John", "Madden", Position.THERAPIST));
        doctors.add(new Doctor("Theresa", "Park", Position.TECHNICIANS));
        List<InsuranceCompany> insurance = new ArrayList<>();
        insurance.add(InsuranceCompany.KAISER_PERMANENTE);
        insurance.add(InsuranceCompany.AETNA);
        insurance.add(InsuranceCompany.MEDICAL_MUTUAL);

        System.out.println(doctors);
//        doctors.printEmployeeInfo(Arrays.toString(4));
//
//        doctors.printDoctorInfo();


        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(201, "Office");
        rooms.put(101, "Physical Therapy");
        rooms.put(121, "Pediatrics");
        rooms.put(226, "OB/GYN");
        rooms.put(136, "Labratory");
        System.out.println(rooms);


        Hospital universityHosp = new Hospital("UniversityHospital", hospAddress, doctors, rooms, insurance);
        System.out.println(universityHosp.toString());




    }
}

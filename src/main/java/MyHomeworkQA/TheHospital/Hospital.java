package MyHomeworkQA.TheHospital;

import java.util.*;

public class Hospital {

    private String hospitalName;
    private Address address;
    private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    private HashMap<Integer, String> rooms = new HashMap<Integer, String>();
    private ArrayList<InsuranceCompany> acceptedInsurance = new ArrayList<InsuranceCompany>();

    public Hospital(String name, Address addr)
    {
        this.hospitalName = name;
        this.address = addr;

        // Add rooms to hospital
        rooms.put(101, "Operating Room 1");
        rooms.put(102, "Operating Room 2");
        rooms.put(204, "Oncology Ward");
        rooms.put(228, "Pediatric Wing");
        rooms.put(411, "Emergency Room 1");
        rooms.put(474, "Pharmacy");

        // Add doctors to hospital
        doctors.add(new Doctor("Doug", "Wilson", Position.PEDIATRICIAN));
        doctors.add(new Doctor("Rhea", "Lazlo", Position.SURGEON));
        doctors.add(new Doctor("Lesley", "Wade", Position.PHYSICIAN));

        // Add insurance to hospital
        acceptedInsurance.add(InsuranceCompany.AETNA);
        acceptedInsurance.add(InsuranceCompany.BLUECROSS);
        acceptedInsurance.add(InsuranceCompany.KAISER);
        acceptedInsurance.add(InsuranceCompany.HUMANA);
        acceptedInsurance.add(InsuranceCompany.ANTHEM);
    }

    public ArrayList<Doctor> getDoctors() {
        return this.doctors;
    }

    public ArrayList<InsuranceCompany> getInsurance() {
        return this.acceptedInsurance;
    }

    public void printHospitalInfo() {
        System.out.println("Hospital: "+hospitalName);
        System.out.println("Address: "+address.printInfo()+"\n");
        printDoctors();
        printRooms();
        printInsurances();
    }

    public void printRooms() {
        System.out.println("ROOMS");
        for (Integer i : rooms.keySet()) {
            System.out.println("Room No: "+i+" - "+rooms.get(i));
        }
        System.out.println();
    }

    public void printDoctors() {
        System.out.println("DOCTORS");
        for (Doctor doc : doctors) {
            System.out.println(doc.printInfo());
        }
        System.out.println();
    }

    public void printInsurances() {
        System.out.println("INSURANCE ACCEPTED");
        for (InsuranceCompany ic : acceptedInsurance) {
            System.out.println(ic);
        }
        System.out.println();
    }

    public void addDoctor(Doctor doc) {
        this.doctors.add(doc);
    }

    public void addInsurance(InsuranceCompany inc) {
        this.acceptedInsurance.add(inc);
    }

    public void addRoom(Integer roomNum, String roomName) {
        this.rooms.put(roomNum, roomName);
    }

    public static void main(String[] args) {
        Hospital vets = new Hospital("Veterans Memorial Hospital",
                new Address("1901 Kuykendahl Street", "Spring", "Texas", 77034));

        vets.printHospitalInfo();
        vets.printDoctors();
        vets.printRooms();
    }
}

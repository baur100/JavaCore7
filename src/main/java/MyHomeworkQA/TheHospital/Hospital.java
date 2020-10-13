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

}

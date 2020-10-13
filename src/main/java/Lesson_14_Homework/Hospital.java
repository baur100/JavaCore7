package Lesson_14_Homework;

import java.util.HashMap;
import java.util.List;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<InsuranseCompamies> insuranseCompamiesList;
    private List<Position> positions;
    private List<Doctor> doctors;
    private HashMap<Integer, String> rooms;

    public Hospital() {
    }

    public Hospital(String hospitalName, Address address, List<InsuranseCompamies> insuranseCompamiesList, List<Position> positions, List<Doctor> doctors, HashMap<Integer, String> rooms) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.insuranseCompamiesList = insuranseCompamiesList;
        this.positions = positions;
        this.doctors = doctors;
        this.rooms = rooms;
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

    public List<InsuranseCompamies> getInsuranseCompamiesList() {
        return insuranseCompamiesList;
    }

    public void setInsuranseCompamiesList(List<InsuranseCompamies> insuranseCompamiesList) {
        this.insuranseCompamiesList = insuranseCompamiesList;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
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

    public void printHospital() {
        System.out.println(hospitalName + address);

        for (Doctor d : doctors) {
            System.out.println(d.toString());
        }
        for (InsuranseCompamies i : insuranseCompamiesList) {
            System.out.println("Insuranse Compamies" + i);
        }
        for (Position p : positions) {
            System.out.println("Positions" + p);
        }
        for (Integer x : rooms.keySet()) {
            System.out.println(x + " " + rooms.get(x));
        }
    }
}
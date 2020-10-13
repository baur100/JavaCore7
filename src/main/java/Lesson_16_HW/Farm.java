package Lesson_16_HW;

import Lesson_14_Homework.Doctor;
import Lesson_14_Homework.InsuranseCompamies;
import Lesson_14_Homework.Position;

import java.awt.*;
import java.util.HashMap;
import java.util.List;

public class Farm {
    private String name;
    private Address address;
    private HashMap<Cattle, Integer> cattleIntegerHashMap;
    private List<AgreeCultural> agreeCultural;
    private String nameOfCulture;
    private int fieldsNumber;

    public Farm() {
    }

    public Farm(String name, Address address, HashMap<Cattle, Integer> cattleIntegerHashMap, List<AgreeCultural> agreeCultural, String nameOfCulture, int fieldsNumber) {
        this.name = name;
        this.address = address;
        this.cattleIntegerHashMap = cattleIntegerHashMap;
        this.agreeCultural = agreeCultural;
        this.nameOfCulture = nameOfCulture;
        this.fieldsNumber = fieldsNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public HashMap<Cattle, Integer> getCattleIntegerHashMap() {
        return cattleIntegerHashMap;
    }

    public void setCattleIntegerHashMap(HashMap<Cattle, Integer> cattleIntegerHashMap) {
        this.cattleIntegerHashMap = cattleIntegerHashMap;
    }

    public List<AgreeCultural> getAgreeCultural() {
        return agreeCultural;
    }

    public void setAgreeCultural(List<AgreeCultural> agreeCultural) {
        this.agreeCultural = agreeCultural;
    }

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public void setNameOfCulture(String nameOfCulture) {
        this.nameOfCulture = nameOfCulture;
    }

    public int getFieldsNumber() {
        return fieldsNumber;
    }

    public void setFieldsNumber(int fieldsNumber) {
        this.fieldsNumber = fieldsNumber;
    }
    public String printInfo() {
        return "Farm{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", cattleIntegerHashMap=" + cattleIntegerHashMap +
                ", agreeCultural=" + agreeCultural +
                ", nameOfCulture='" + nameOfCulture + '\'' +
                ", fieldsNumber=" + fieldsNumber +
                '}';
    }
}




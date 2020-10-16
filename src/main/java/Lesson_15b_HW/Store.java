package Lesson_15b_HW;

import java.util.ArrayList;

public class Store {
    private String name;
    private String type;
    private Address address;
    private BoysToys boysToys;
    ArrayList<GirlsToys> girlsToysArrayList;

    public Store(String name, String type, Address address, BoysToys boysToys, ArrayList<GirlsToys> girlsToysArrayList) {
        this.name = name;
        this.type = type;
        this.address = address;
        this.boysToys = boysToys;
        this.girlsToysArrayList = girlsToysArrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BoysToys getBoysToys() {
        return boysToys;
    }

    public void setBoysToys(BoysToys boysToys) {
        this.boysToys = boysToys;
    }

    public ArrayList<GirlsToys> getGirlsToysArrayList() {
        return girlsToysArrayList;
    }

    public void setGirlsToysArrayList(ArrayList<GirlsToys> girlsToysArrayList) {
        this.girlsToysArrayList = girlsToysArrayList;
    }
}

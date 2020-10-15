package hw16farm;

import java.util.List;
import java.util.Map;

public class Farm {
    private String name;
    private Address address;
    private Map<Cattle, Integer> cattle;
    private List<AgreeCultural> agreeCultural;

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<AgreeCultural> agreeCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;
    }

    public Farm(String baker, hw14a.Address farmAddress, Map<Cattle, Integer> cattle, List<AgreeCultural> agreeCultural) {
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

    public Map<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(Map<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public void printInfo()
    {

        System.out.println(" Farm name" + name + address + cattle + agreeCultural);

    }
//    public printInfo(Farm) {
//        return;
//
//    }

    @Override
    public String toString() {
        return "Farm{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", cattle=" + cattle +
                ", agreeCultural=" + agreeCultural +
                '}';
    }
}

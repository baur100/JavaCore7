package hw15;


import java.util.List;
import java.util.Map;

public class  Farm {
    private String name;
    private Address address;
    private Map<Cattle, Integer> cattle;
    private List<AgreeCulture1> agreeCulture1;


    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<AgreeCulture1> agreeCulture1) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCulture1 = agreeCulture1;

    }

    @Override
    public String toString() {
        return "Farm{" +
                "name='" + name + '\'' +
                " address=" + address +
                " \nCattle=" + cattle +
                " \nAgreeCulture=" + agreeCulture1 +
                '}';
    }
}
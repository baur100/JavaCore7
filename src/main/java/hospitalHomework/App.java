package hospitalHomework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Address hospitalAddress = new Address("123 Elm street","Horror town","NJ",78945);
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Gregory", "House", Title.PODIATRIC));
        doctors.add(new Doctor("Joan", "Sullivan",Title.OBGYN));
        List<InsuranceCompany> acceptedInsurances = new ArrayList<>();
        acceptedInsurances.add(InsuranceCompany.UNITED_HEALTHCARE);
        acceptedInsurances.add(InsuranceCompany.BLUE_CROSS);

        Map<Integer,String> rooms = new HashMap<>();
        rooms.put(213,"Observation");
        rooms.put(154,"Surgery");

        Hospital mountSinai = new Hospital("Mount Sinai",hospitalAddress,doctors,rooms,acceptedInsurances);
        System.out.println(mountSinai);

       
    }
}

package homework.myhospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppHospital {
    public static void main (String[] args) {
        Map<Integer, String> rooms = new HashMap<>();
        rooms.put(1, "operating room");
        rooms.put(2, "waiting room");
        rooms.put(3, "OBGYN room");


        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Rita", "Sidorova", Position.OBGYN ));
        doctors.add(new Doctor("Ivan", "Petrov", Position.DERMATOLOGIST));


        List<InsuranceCompanies> insurances = new ArrayList<>();
        insurances.add(InsuranceCompanies.KAISER);
        insurances.add(InsuranceCompanies.AETNA);
        insurances.add(InsuranceCompanies.CIGNA);

        Hospital kaiser = new Hospital(
                "Kaiser",
                new Address("10 Main St", "San Jose", "CA", 94415),
                doctors,
                rooms,
                insurances
        );
        kaiser.printout();
        kaiser.printDoctors();
        kaiser.printRooms();
    }

}

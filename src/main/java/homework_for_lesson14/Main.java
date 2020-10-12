package homework_for_lesson14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor ("Gregory","House",Position.SURGEON));
        doctors.add(new Doctor("Lisa","Kaddi",Position.THERAPIST));
        doctors.add(new Doctor("James","Wilson",Position.RESUSCITATOR));
        Doctor crisTaub = new Doctor("Cris","Taub",Position.ANESTHETIST);
        doctors.add(crisTaub);
        doctors.add(new Doctor("Ellison","Cameron",Position.ORTHOPEDIST));

        ArrayList<InsuranceCompanies> acceptedInsurances= new ArrayList<>();
        acceptedInsurances.add(new InsuranceCompanies(Insurance.FIDELIS));
        acceptedInsurances.add((new InsuranceCompanies(Insurance.SHIELD)));

        HashMap<Integer,String> rooms = new HashMap<>();
        rooms.put(101,"Observation");
        rooms.put(112,"Emergency room");
        rooms.put(107,"Surgical room");
        rooms.put(218,"MRI room");
        rooms.put(220,"Physiotherapy");


        Address address = new Address ("314 Oak road","Boston","MA",52715);
        Hospital hospital = new Hospital("Mount Sinai",address,doctors,rooms,acceptedInsurances);

        System.out.println(hospital);

        System.out.println("-------------------------------------------------------------------------------------------------------------");

        System.out.println(doctors);

        System.out.println("--------------------------------------------------------------------------------------------------------------");

        for(Map.Entry<Integer,String>pair:rooms.entrySet()){
            System.out.println(pair.getKey()+ " "+pair.getValue());
        }
    }
}

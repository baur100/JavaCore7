package Lesson_14_Homework;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Address address = new Address("1010 North Street", "Dallas", "TX", 75023);
        Hospital SaintMarie = new Hospital();

        System.out.println("Hospital" + " " + "SaintMarie" + " " + "is located at" + " " + address.getStreetAddress());

        HashMap<Integer,String> rooms = new HashMap<>();
        rooms.put(1, "cardiology");
        rooms.put(2, "chiropractic");
        rooms.put(3, "gynecologist");
        rooms.put(4, "surgery");
        rooms.put(5, "urology");

        System.out.println(rooms);


        ArrayList<InsuranseCompamies> acceptedInsuranses = new ArrayList<InsuranseCompamies>();
        InsuranseCompamies[] arr = new InsuranseCompamies[5];
        arr[0] = InsuranseCompamies.AETHA;
        acceptedInsuranses.add(InsuranseCompamies.MEDICARE);
        acceptedInsuranses.add(InsuranseCompamies.UNITHEHEALTHCARE);
        acceptedInsuranses.add(InsuranseCompamies.AETHA);
        System.out.println(arr[0]);
        System.out.println(arr.length);
        System.out.println(acceptedInsuranses.size());

        Doctor doctor1 = new Doctor("Kim", "Balt", Position.CARDIOLOGIST);
        Doctor doctor2 = new Doctor("Adam", "Hall", Position.CHIROPRACTOR);
        Doctor doctor3 = new Doctor("Anna", "Hull", Position.GYNECOLOGIST);
        Doctor doctor4 = new Doctor("Mila", "Full", Position.SURGEON);
        Doctor doctor5 = new Doctor("Jack", "Hash", Position.UROLOGIST);
        System.out.println(doctor1.getName() + " " + doctor1.getLastName() +
               " " + doctor1.getPosition());
        System.out.println(doctor2.getName() + " " + doctor2.getLastName() +
                " " + doctor2.getPosition());
        System.out.println(doctor3.getName() + " " + doctor3.getLastName() +
                " " + doctor3.getPosition());
        System.out.println(doctor4.getName() + " " + doctor4.getLastName() +
                " " + doctor4.getPosition());
        System.out.println(doctor5.getName() + " " + doctor5.getLastName() +
                " " + doctor5.getPosition());


    }
}

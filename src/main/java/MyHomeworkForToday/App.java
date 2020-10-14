package MyHomeworkForToday;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {


    public static void main(String[] args) {


        Doctors brent = new Doctors("Brent", "Smith", Position.CARDIOLOGIST);
        Doctors Marry = new Doctors("Marry", "Smith", Position.ANESTHESIOLOGIST);
        Doctors Ali = new Doctors("Ali", "Oman", Position.ONCOLOGIST);


        List<Doctors> doctors = new ArrayList<>();
        doctors.add(brent);
        doctors.add(Marry);
        doctors.add(Ali);


        Address hospitalAddress = new Address("505 w Broad street", "Boise", "ID", 83702);

        Map<String, String> rooms = null;



        rooms = new HashMap<>();


        rooms.put("133", "ER");
        rooms.put("134", "Dispensary");
        rooms.put("135", "Delivery room");


        List <Position>  positions = new ArrayList<>();

        positions.add(Position.ANESTHESIOLOGIST);
        positions.add(Position.CARDIOLOGIST);
        positions.add(Position.ONCOLOGIST);
        positions.add(Position.PEDIATRICIAN);


    }



            }



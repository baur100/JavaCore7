package HW_hospital;




import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
Address hospitaladdress = new Address("123 Elm st","El Segundo","CA",9999);
        List<Doctors> doctors = new ArrayList<>();
        doctors.add(new Doctors("Evan","Van",Positions.ALLERGIST ));
        doctors.add(new Doctors("Eva","Bloom",Positions.CARDIOLOGIST));
        doctors.add(new Doctors("Rick","Bond",Positions.SYRGEON));
        doctors.add(new Doctors("Paul","Richmond",Positions.GASTROENTEROLOGIST));
        List<InsuraceCo> insuraceCos = new ArrayList<>();
        insuraceCos.add(InsuraceCo.LACARE);
        insuraceCos.add(InsuraceCo.BLUESHIELD);
        insuraceCos.add(InsuraceCo.KAISER);
        insuraceCos.add(InsuraceCo.ANTHEM);


        Map<Integer,String> rooms = new HashMap<>();
        rooms.put(1,"Allergy");
        rooms.put(2,"Surgery");
        rooms.put(3,"Cardio");
        rooms.put(4,"Gastro");


  Hospital CesarSinai = new Hospital("CesarSinai",hospitaladdress,doctors,rooms,insuraceCos);
        System.out.println(CesarSinai.toString());
        System.out.println(doctors);
        System.out.println("Rooms"+rooms);
    }
}

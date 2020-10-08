package homework11;

import java.sql.SQLOutput;

public class Hw11 {
    public static void main(String[] args) {
        Room myRoom = new Room(20, "blue", 2);
        Room hisRoom = new Room(24, "green", 2);
        System.out.println(myRoom.getDescription());
        System.out.println(hisRoom.getDescription());

        Bathroom one = new Bathroom(8, "blue", 1, 2, "tub");
        Bathroom two = new Bathroom(6, "white", 1, 1, "shower");
        System.out.println(one.getDescription());
        System.out.println(two.getDescription());

        Bedroom masterBedroom = new Bedroom(30, "Purple", 3, 4);
        Bedroom guestBedroom = new Bedroom(18, "pink", 2, 2);
        System.out.println(masterBedroom.getDescription());
        System.out.println(guestBedroom.getDescription());


        DressingRoom myDressingRoom = new DressingRoom(10, "white", 0, 15);
        DressingRoom kidsDressingRoom = new DressingRoom(12, "pink", 1, 14);
        System.out.println(myDressingRoom.getDescription());
        System.out.println(kidsDressingRoom.getDescription());
    }
}

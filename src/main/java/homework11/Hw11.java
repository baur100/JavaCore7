package homework11;

public class Hw11 {
    public static void main(String[] args) {
        Room myRoom = new Room(20, "blue", 2);
        Room hisRoom = new Room(24, "green", 2);

        Bathroom one = new Bathroom(8, "blue", 1, 2, "tub");
        Bathroom two = new Bathroom(6, "white", 1, 1, "shower");

        Bedroom masterBedroom = new Bedroom(30, "Purple", 3, 4);
        Bedroom guestBedroom = new Bedroom(18, "pink", 2, 2);

        DressingRoom myDressingRoom = new DressingRoom(10, "white", 0, 15);
        DressingRoom kidsDressingRoom = new DressingRoom(12, "pink", 1, 14);
    }
}

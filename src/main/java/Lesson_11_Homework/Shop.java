package Lesson_11_Homework;

public class Shop {
    public static void main(String[] args) {
        String[] phoneBinary = {"IX", "X"};
        Phone phone = new Phone("iPhone", "Apple", "X", phoneBinary);

        String[] laptopBinary = {"First", "Second"};
        Laptop laptop = new Laptop("Laptop", "Apple", "XX", laptopBinary);

        Headset headset = new Headset("headset", "Samsung", "Beens");
        String[] playerSize = {"Mid", "Large"};
        Player player = new Player("Player", "Apple", "Sweet", playerSize);

        headset.printHeadset();
        laptop.printLaptop();
        phone.printHPhone();
        player.printPlayer();
    }

}

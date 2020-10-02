package AEHWLesson9;

public class House {
    public String state;
    public String city;
    public int price;

    public void priceByState() {
        if (state == "CA") {
            if (price > 1000000) {
                System.out.println("I love California :(");
            } else System.out.println("You are lucky!");
        }
    }
}


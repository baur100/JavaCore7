package Lesson9Homework;

public class House {
    public String type;
    public String city;
    public int price;
    public int year;

    public void printHouse() {
        System.out.println(" House is a " + type + " in the city of  " + city + " bought it for " + price + " Dollars, the year built was " + year);
    }
}
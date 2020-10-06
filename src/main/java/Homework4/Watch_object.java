package Homework4;

import javax.xml.namespace.QName;

public class Watch_object {
    public static void main(String[] args) {

        Watch watch = new Watch();
        watch.setName("AppleWatch5");
        watch.setBrand("Apple");
        watch.setColor("Gold");
        watch.setPrice(700);

        Watch myWatch = new Watch();

        String name = watch.getName();
        String brand = watch.getBrand();
        String color = watch.getColor();
        int price = watch.getPrice();

        Watch newWatch = new Watch();
        String newWatchName = newWatch.getName();
        newWatch.setName("AppleWatch6");


        System.out.println("New" + " " + name + " " +
                "from" + " " + brand + " " + "in" + " " +
                color + " " + "color" + " " + "is only" +
                " " + price);
        }
}

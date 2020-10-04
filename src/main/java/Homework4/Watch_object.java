package Homework4;

public class Watch_object {
    public static void main(String[] args) {

        Watch watch = new Watch();
        watch.setName("AppleWatch5");
        watch.setBrand("Apple");
        watch.setColor("Gold");
        watch.setPrice(700);

        String name = watch.getName();
        String brand = watch.getBrand();
        String color = watch.getColor();
        int price = watch.getPrice();


        System.out.println("New" + " " + name + " " +
                "from" + " " + brand + " " + "in" + " " +
                color + " " + "color" + " " + "is only" +
                " " + price);
        }
}

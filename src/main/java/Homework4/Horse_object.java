package Homework4;

public class Horse_object {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.setName("Izabella");
        horse.setColor("black");
        horse.setAge(5);

        String name = horse.getName();
        String color = horse.getColor();
        int age = horse.getAge();

        System.out.println("Hello! My name is" + " " + name);
        System.out.println("I am" + " " + age + " " +
                "year old" + " " + color + " " + "horse");
    }
}

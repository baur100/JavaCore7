package HW10;
//  1. Create 4 classes with fields (at least 3 fields) and methods (at least 1 method)
//   each class has at least 2 constructors (default and full)
//   create printClass()/ printInfo() method to print out all fields
//   fields are private each field has getter and setter
//   2. In the App class create main() and create 2 instanses of each class;
//   one instance created used default constructor - fill up fields using setter
//   second object created using full constructor print object info using print-out method.
public class App {
    public static void main(String[] args) {

        Client elena = new Client();
        elena.setFirstName("Alenka");
        elena.setLastName("Petrova");
        elena.setdob(2000);

        System.out.println(elena.getdob());
        System.out.println(elena.getLastName());
        System.out.println(elena.getFirstName());

        Cat murka = new Cat();
        murka.setName("Murka");
        murka.setBreed("Siams");
        murka.setSize(25);
        murka.setAge(3);

        System.out.println(murka.getName());
        System.out.println(murka.getBreed());
        System.out.println(murka.getSize());
        System.out.println(murka.getAge());

        Dog baron = new Dog();
        baron.setName("Baron");
        baron.setBreed("Rotveiler");
        baron.setColor("Black");
        baron.setAge(9);

        System.out.println(baron.getName());
        System.out.println(baron.getBreed());
        System.out.println(baron.getColor());
        System.out.println(baron.getAge());

    }
}

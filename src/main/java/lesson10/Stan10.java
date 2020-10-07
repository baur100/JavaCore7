package lesson10;

public class Stan10 {
    public static void main(String[] args) throws Exception {
//        Pirate object
        Pirate silver = new Pirate();
        silver.setName("Silver");
        silver.setAge(65);
        silver.setLegCount(1);

        String name = silver.getName();
        System.out.println(name);
        int age = silver.getAge();
        System.out.println(age);
        int legCount = silver.getLegcount();
        System.out.println(legCount);

//        Ship object
        Ship poseidon = new Ship();
        poseidon.setName("Poseidon");
        poseidon.setType("PirateShip");
        poseidon.setYear(1777);

        poseidon.sail();

//        Car object
        Car myCar = new Car("Mersedes", "S500", 2018);


    }
}

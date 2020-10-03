package aelesson12b;

public class App {
    public static void main(String[] args) {

        //Create object of Person class and assign to it object Student or Teacher

        // Pilar 3 of OOP - polymorphism

        Person peter = new Student("Peter", "Morris", "Math");
        Person mrAllen = new Teacher("Jane", "Aleen", "Biology");

        Person[] university = {peter, mrAllen};

        Cat cat1 = new Cat();
        cat1.sound();

        Dog dog1 = new Dog();
        dog1.sound();

        Aminal an = new Cat();
        an.sound();

        Aminal[] animals = new Aminal[4];

        animals[0] = new Cat();
        animals[1] = an;
        animals[2] = dog1;
        animals[3] = new Dog();

        for(Aminal animal : animals){
            animal.sound();
        }



    }
}

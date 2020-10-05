package lesson12b;

public class App {
    public static void main(String[] args) {

        Person peter = new Student("Peter","Torson","Math");
        Person msAllen = new Teacher("Jane","Allen","Biology");

        Person[] university = {peter, msAllen};

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

//        dog1.sound();
//        cat1.sound();

        Animal an = new Cat();
//        an.sound();
        Animal[] animals = new Animal[4];

        animals[0] = new Cat();
        animals[1] = an;
        animals[2] = dog1;
        animals[3] = new Dog();

        for (Animal animal : animals){
            animal.sound();
        }

    }
}

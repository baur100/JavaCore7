package lesson8;

import java.util.Arrays;

public class Stan8 {
    public static void main(String[] args) {

//        Cat objects
        Cat tomas = new Cat();
        tomas.name = "Tomas";
        tomas.age = 5;
        tomas.weight = 3;
        tomas.color = "Red";

        tomas.play();
        String infoAboutCat = tomas.getCatInfo();
        System.out.println(infoAboutCat);


        Cat fluffy = new Cat();
        fluffy.name = "Fluffy";
        fluffy.color = "Black";

        String[] arr = {fluffy.name, fluffy.color};
        System.out.println(Arrays.toString(arr));
        System.out.println(fluffy.color);
        fluffy.sleep();


//        Dog objects
        Dog barbos = new Dog();
        barbos.name = "Barbos";
        barbos.color = "Grey";
        barbos.legCount = 4;

        barbos.bark();
        barbos.sayHi();

        Dog juchka = new Dog();
        juchka.name = "Juchka";
        juchka.gender = "female";

        juchka.bark();
        juchka.sayHi();

        System.out.println(juchka.gender);
        System.out.println(juchka.name + " saying " + juchka.bark());
        
//        Planet object
        Planet venus = new Planet();
        venus.name = "Venus";
        venus.temperature = 200;
        venus.radius = 2500;

        double xx = venus.equatorLength();
        System.out.println(xx);
        
        
        
    }
}

package aelesson14;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Jane", "Miller", 1990));

        Person davidShore = new Person("David", "Shore", 1985);
        people.add(davidShore);

        for(Person person: people){
            System.out.println(person.getName() + " " + person.getLastName());
        }


        //Lambda operator
        people.forEach(x -> System.out.println(x.getName() + " " + x.getLastName()));


        List<Colors> snickersColor = new ArrayList<>();
        snickersColor.add(Colors.BLUE);
        snickersColor.add(Colors.WHITE);
        Snickers nike = new Snickers(snickersColor);

    }
}

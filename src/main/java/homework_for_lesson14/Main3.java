package homework_for_lesson14;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Person> men = new ArrayList<>();
        men.add(new Person("Ivan", 17, 3548));
        men.add(new Person("Peter", 14, 2137));
        Person david = new Person("David", 21, 4769);
        Person nick = new Person("Nick", 18, 5544);
        men.add(david);
        men.add(nick);

        //for (Person person : men) {
        //    System.out.println(person.getName() + " " + person.getAge());


            men.forEach(x -> System.out.println(x.getName() + " " +x.getAge() + " " + x.getId()));


        }
    }



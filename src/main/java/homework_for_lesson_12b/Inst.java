package homework_for_lesson_12b;

import java.util.Arrays;

public class Inst {
    public static void main(String[] args) {
        Read human = new Human("Ann","novels");
        Read dog  = new Dog("Charlie");

        Read [] readers = {human,dog};
        for( Read v: readers){
            v.read();

        }
    }
}

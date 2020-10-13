package lesson16;

public class App1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        try {
            System.out.println("Code before exception");
            p1.setAge(-12);
            System.out.println("Code after exception will not work");
        } catch (IllegalArgumentException error){
//            System.out.println("Error is caught!!! Looks like entered age was wrong");
            p1.setAge(0);
        }

    }
}

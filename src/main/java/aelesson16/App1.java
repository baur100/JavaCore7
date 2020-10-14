package aelesson16;

public class App1 {
    public static void main(String[] args) {
        Person p1 = new Person();

        //Catch block for exceptions
        try {
            System.out.println("Code before exception");
            p1.setAge(-12);
            System.out.println("Code after exception will not work");
        } catch (IllegalArgumentException error){
            System.out.println("Error is caught!!! Looks like entered age was wrong");
            //Way to handle the problem. For example replacing negative age with 0
            p1.setAge(0);
        }

    }
}

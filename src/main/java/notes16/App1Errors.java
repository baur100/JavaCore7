package notes16;

public class App1Errors {
    public static void main(String[] args) {
        Person p1 = new Person();
        try {
            System.out.println("Code before exception");
            p1.setAge(12); //give negative to see exception
            System.out.println("Code after exception");
        }catch (IllegalArgumentException error){
            System.out.println("Error is caught!!! Age inserted is negative");
        }

    }
}

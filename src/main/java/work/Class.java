package work;

public class Class {
    public static void main(String[] args) {
        Classmates zarina = new Classmates();
        zarina.name = "Sharakhmetova";
        zarina.age = 27;

        Classmates irina = new Classmates();
        irina.name = "Karimova";
        zarina.age = 27;

       zarina.Hi();
       irina.Hi();
    }
}
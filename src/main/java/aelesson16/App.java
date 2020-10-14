package aelesson16;

public class App {
    public static void main(String[] args) {

        //For non-static method we have to create instance of the object.
        // Non-Static methods belong to object
        Helper helper = new Helper("Weird name");



        //For static method there is no need to create an instance of the class to run this method
        //Static method belongs to class, not the instance of the class(object)
        //Helper helper = new Helper(); - will not work
        Helper.printRandomNumber();


    }
}

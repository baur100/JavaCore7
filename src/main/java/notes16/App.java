package notes16;

public class App {
    public static void main(String[] args) {
        //Helper helper = new Helper();
        //static methods cannot be seeing
        // you don't need to create instanse of the class OR CREATE AN OBJ to invoke it
        //aka no need for line 4
        Helper.randomNumberGeneratorTwo();

        //now create an object of this class it cna invole set and get but not invoke static
        Helper helper = new Helper("Anna");
        //static belongs to class not object or instance of the class
        // aka why could call line 9 but not with obj of line 12
        //cannto combined static methods or fields with non static
        //non static needs always an object to be invoked
        //use static less
    }


}

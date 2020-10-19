package MyHomeworkQA.HwLifeSim;

public class App {

    public static void main(String[] args) {

        /*Lion leo = new Lion();
        leo.sound();
        leo.eat();
        System.out.println("-----------------------");
        Hawk harry = new Hawk();
        System.out.println(harry.fly());
        harry.eat();
        System.out.println("-----------------------");
        Crayfish carl = new Crayfish();
        carl.eat();
        carl.reproduce();
        carl.iLive();
        System.out.println("-----------------------");
        Beetle betty = new Beetle();
        betty.iLive();
        betty.sound();
        System.out.println("-----------------------");*/
        KillerWhale willy = new KillerWhale();
        willy.lookAtMe();
        willy.eat();
        willy.sound();
        System.out.println("-----------------------");
        Cow mabel = new Cow();
        mabel.lookAtMe();
        mabel.eat();
        mabel.sound();
        mabel.iWork();
        System.out.println("-----------------------");
        Frog fred = new Frog();
        fred.eat();
        fred.iLive();
        fred.die();
    }
}

package MyHomeworkQA.HwLifeSim;



public class Lion extends Carnivores {


    public Lion() {}

    public void lookAtMe() {
        System.out.println("I am the King of the Jungle. Look at my mane, bro!");
    }

    public void sound() {
        System.out.println("RRROOOOAAAARRRR!!!");
    }

    public void eat() {
        super.eat();
    }
}

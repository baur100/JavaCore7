package MyHomeworkQA.HwLifeSim;



public class Wolf extends Carnivores {

    public Wolf() {}

    public void lookAtMe() {
        System.out.println("I am in the forest, looking for Red Riding Hood.");
    }

    public void sound() {
        System.out.println("AAAAWWWOOOOOOOOOOO!!!");
    }

    public void eat() {
        super.eat();
    }
}

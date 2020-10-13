package lesson12HW;

public class Lion implements Animal {

    @Override
    public void animalSound1() {
        System.out.println("ROAR!!! When I want to scare other animals or Lions");
    }

    @Override
    public void animalEat() {
        System.out.println("MUNCH MUNCH! on zebra all day ");
    }

    @Override
    public void animalSleep() {
        System.out.println("I like Snoring loudly Zzzzzzzzz");
    }

    @Override
    public void animalSound2() {
        System.out.println("Grunting is what I do since I like to show other Lions who is in charge");
    }

    public void printEveryAction(){

        System.out.println(" Some things to know about me since I am a Lion :  ");
    }
}

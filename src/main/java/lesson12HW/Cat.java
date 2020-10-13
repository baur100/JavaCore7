package lesson12HW;

public class Cat implements Animal {


    @Override
    public void animalSound1() {
        System.out.println(" Sometimes I like to ....Meow");
    }

    @Override
    public void animalEat() {
        System.out.println(" Sometimes I like to Lick..when I eat");
    }

    @Override
    public void animalSleep() {
        System.out.println("Sometimes I snore loudly Zzzzzzz when I sleep. ");
    }

    @Override
    public void animalSound2() {
        System.out.println("Sometimes I Prrrrrrrrr...When I am attached to my owner");

    }


    public void PrintEveryAction () {
        System.out.println(" Some things to know about me since I am a cat :  ");
    }
}
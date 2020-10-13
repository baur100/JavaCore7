package lesson12HW;

public class Dog implements Animal {

    @Override
    public void animalSound1() {
        System.out.println("Bark!!!....When I am defending my owner");
    }

    @Override
    public void animalEat() {
        System.out.println("Chew...Chew.. When i am chewing on a bone");
    }

    @Override
    public void animalSleep() {
        System.out.println("Zzzzzzzzz... When I feel sleep i snore sometimes.");
    }

    @Override
    public void animalSound2() {
        System.out.println("Whining... when I feel hurt by another being");
    }

    public void printEveryAction(){

        System.out.println(" Some things to know about me since I am a dog :  ");

    }


}

package hwk20;

public abstract class Primates implements Mammals {
    String namePriamate;

    public void Mammals(String namePriamate){
        this.namePriamate = namePriamate;
    }

    public void primates(){
        System.out.println("I am a primate");
    }
}

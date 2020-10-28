package hwk20;

public abstract class Seals implements Mammals {
    String nameSeals;
    public void Seals(String nameSeals){
        this.nameSeals = nameSeals;
    }

    public void primates(){
        System.out.println("I am a seal");
    }
}

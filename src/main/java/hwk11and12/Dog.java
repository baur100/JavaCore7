package hwk11and12;

public class Dog {
    protected String size;
    protected double weight;
    protected String race;

    public Dog (String size, double weight, String race){
        this.size = size;
        this.weight = weight;
        this.race = race;
    }

    public String getSize(){
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public String getRace(){
        return race;
    }

    public void setSize(String size){
        this.size = size;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setRace(String race){
        this.race = race;
    }
}

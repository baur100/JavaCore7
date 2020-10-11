package hwk11and12;

public class Aussie extends Dog{
    private String hairColor;

    public Aussie(String size, double weight, String race, String hairColor){
        super(size,weight, race);
        this.hairColor= hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Aussie{" +
                "size='" + size + '\'' +
                ", weight=" + weight +
                ", race='" + race + '\'' +
                '}';
    }
}

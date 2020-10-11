package hwk11and12;

public class Chihuahua extends Dog{
    private String furColor;

    public Chihuahua(String size, double weight, String race, String furColor){
        super(size,weight, race);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public String toString() {
        return "Chihuahua{" +
                "size='" + size + '\'' +
                ", weight=" + weight +
                ", race='" + race + '\'' +
                '}';
    }
}

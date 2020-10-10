package hwk11;

public class Husky extends Dog{
    private String doubleCoatedHairColor;

    public Husky(String size, double weight, String race, String doubleCoatedHairColor ){
        super(size, weight, race);
        this.doubleCoatedHairColor = doubleCoatedHairColor;
    }

    public String getDoubleCoatedHairColor() {
        return doubleCoatedHairColor;
    }

    public void setDoubleCoatedHairColor(String doubleCoatedHairColor) {
        this.doubleCoatedHairColor = doubleCoatedHairColor;
    }

    @Override
    public String toString() {
        return "Husky{" +
                "size='" + size + '\'' +
                ", weight=" + weight +
                ", race='" + race + '\'' +
                '}';
    }
}

package lesson9;

public class Fruit {
    private String fruitName;
    private String fruitColor;
    private int weight;

    public Fruit() {
    }

    public Fruit(String fruitName, String fruitColor, int weight){
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
        this.weight = weight;
    }

    public String getFruitName() {
        return fruitName;
    }
    public void setFruitName(String fruitName){
        this.fruitName = fruitName;
    }
    public  String getFruitColor() {
        return fruitColor;
    }

    public void setFruitColor(String fruitColor){
        this.fruitColor = fruitColor;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void printFruitInfo() {
        System.out.println("Name of the fruit: " + fruitName +
                '\'' + "Color of the fruit : " + fruitColor +
                '\'' + " Weight of the fruit: " + weight + " kg" +
                 '\'');
    }

}

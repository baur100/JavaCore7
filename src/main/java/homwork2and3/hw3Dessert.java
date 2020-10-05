package homwork2and3;

public class hw3Dessert {
    public String flavor;
    public int quantity;
    public String layersFilling;
    public int numberOfLayers;
    public String isItOnStock;

    public void fillingOptions(){
        System.out.println("I have "+ quantity + " with filling "+ " and "+numberOfLayers+ " layers");
    }
    public String checkStock (){
        return isItOnStock + " "+ flavor +" in stock!";
    }
}

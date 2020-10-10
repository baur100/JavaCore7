package hwk11;

public class IceCream implements Dessert{
    private String iceCream;
    private String ingredient;

    public IceCream(String iceCream, String[] ingredients){
        this.iceCream = iceCream;
        this.ingredient = ingredient;
    }
    @Override
    public void getDessert() {
        System.out.println("My dessert is: "+ iceCream + ", made with follwoing ingrdients: "+ ingredients);;
    }
}

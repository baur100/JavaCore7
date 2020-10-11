package hwk11;

import java.util.Arrays;

public class IceCream implements Dessert{
    private String iceCream;
    private String[] ingredients;

    public IceCream(String iceCream, String[] ingredients){
        this.iceCream = iceCream;
        this.ingredients = ingredients;
    }
    @Override
    public void getDessert() {
        System.out.println("My dessert is: "+ iceCream + ", made with follwoing ingrdients: "+ Arrays.toString(ingredients));;
    }
}

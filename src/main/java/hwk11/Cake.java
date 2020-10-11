package hwk11;

import java.util.Arrays;

public class Cake implements Dessert{
    private String cake;
    private String layers;
    private String[] fillings;

    public Cake (String cake,  String layers, String[] fillings){
        this.cake = cake;
        this.layers = layers;
        this.fillings = fillings;
    }

    public void getDessert(){
        System.out.println("My dessert is: "+ cake + " with layers made of " +layers
    + " " + Arrays.toString(fillings)+ " fillings!");
    }
}

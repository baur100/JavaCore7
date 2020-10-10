package hwk11;

public class Cake implements Dessert{
    private String cake;
    private String layers;
    private String filling;

    public Cake (String cake,  String layers, String[] fillings){
        this.cake = cake;
        this.layers = layers;
        this.filling = filling;
    }

    public void getDessert(){
        System.out.println("My dessert is: "+ cake + " with layers made of " +layers
    + " " + filling+ " fillings!");
    }
}

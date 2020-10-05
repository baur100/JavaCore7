package homwork2and3;

public class hw3Makeup {
    String name;
    String[] currentMakeup;
    String brand;
    String color;

    public void favorites (){
        System.out.println(name+ " favorite brand is "+ brand+ " and my favorite color is "+ color);
    }
    public String[] currentlyHaves(){
        return currentMakeup;
    }
}

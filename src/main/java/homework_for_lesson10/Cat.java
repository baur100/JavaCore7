package homework_for_lesson10;

public class Cat {
    private String name;
    private String color;
    private int age;
    private int weight;

    public Cat(){}

    public Cat ( String name,String color, int age,int weight){
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public String getName(){
    return name;}
    public void setName(String name){this.name = name;}
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
    public int getAge() { return age;}
    public void setAge(int age) { this.age = age;}
    public int getWeight(){ return weight;}
    public void setWeight(int weight){this.weight = weight;}

    public void printCatInfo(){
    System.out.println("Cat info:"+ "\nname = "+ name+ "\ncolor = "+color+
           "\nage = "+ age + "\nweight = " + weight );
    }
}






package homework_for_lesson10;

public class Toys {
    private String name;
    private int id;
    private int price;


    public Toys() {}

    public Toys(String name,int id, int price){
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public int getPrice() {return price;}

    public void setPrice(int price) {this.price = price;}

    public void printToysInfo() {
        System.out.println("Toys info:" + "\nname = " + name + "\nid = " + id +
                "\nprice = " + price);
    }
}




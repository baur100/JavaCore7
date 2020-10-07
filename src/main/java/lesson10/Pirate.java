package lesson10;

public class Pirate {
    private String name;
    private int age;
    private int legcount;

//    Setters
    public void setName(String n) {
        name = n;
    }
    public void setAge(int age) throws Exception {
        if (age > 120 || age < 0) {
            throw new Exception("Wrong age");
        }
        this.age = age;
    }
    public void setLegCount(int legs) {
        this.legcount = legs;
    }
//      Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getLegcount() {
        return legcount;
    }

}

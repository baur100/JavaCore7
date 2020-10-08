package Lesson10Homework;

public class Planets {

    private String name;
    private int ClosestToSun;
    private String BiggerOrSmallerThanEarth;


    public Planets ( String name, int ClosestToSun , String BiggerOrSmallerThanEarth) { //full constructor
        this.name = name;
        this.ClosestToSun = ClosestToSun;
        this.BiggerOrSmallerThanEarth = BiggerOrSmallerThanEarth;
    }


    public Planets () {    //default constructor always empty
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setClosestToSun(int ClosestToSun) {
        this.ClosestToSun = ClosestToSun;
    }
    public int getClosestToSun() {
        return ClosestToSun;
    }

    public void setBiggerOrSmallerThanEarth(String biggerOrSmallerThanEarth) {
        this.BiggerOrSmallerThanEarth = biggerOrSmallerThanEarth;
    }

    public String getBiggerOrSmallerThanEarth() {
        return BiggerOrSmallerThanEarth;
    }


    public void printPlanets(){
        System.out.println("name : " + name + "\n Order number closest to the Sun: "+ ClosestToSun + "\n Bigger or Smaller than earth :" +BiggerOrSmallerThanEarth);
    }
}

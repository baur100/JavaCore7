package Homework_for_lesson9;

public class Country {

    public String name;
    public int hours;
    public String city;
    public String attractions;

    public void travell(){
        System.out.println("Next year we will visit"+" "+name+
                " "+ ",our travelling will take"+" "+hours+" "+"hours by plane."+
                " "+"We will stay at"+" "+city+",and would like to go to"+" "+
                attractions+". ");
    }
}

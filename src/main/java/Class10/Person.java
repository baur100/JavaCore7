package Class10;

public class Person {
    private String name;
    private String lastname;
    private int year;

    public void setName(String n){
        name = n;

    }
    public String getName(){
        return name;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setYear(int year) throws Exception {
        if(year>2020 || year<1900){
            throw new Exception("Wrong Age");
        }
        this.year = year;
    }
//    public int getYear(){
//        return year;
//    }
}

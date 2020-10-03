package AElesson10;

public class House {

    private int year;
    private int bedrooms;
    private int bathrooms;
    private String address;

    //public House(int year, int beds, int bath);

    //Default constructor; should be defined if there are other constructors in the class. If there are no other constructors in the class,
    // it will use the default one
    public House(){}

    // We can create many constructors, but they should use different signature

    public void setYear(int year) {
        this.year = year;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}

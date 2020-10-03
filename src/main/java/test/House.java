package test;

public class House {
    private int year;
    private int bedrooms;
    private int bathrooms;
    private String address;

    public House(int year, int beds, int baths, String address){
        this.year = year;
        bedrooms = beds;
        bathrooms = baths;
        this.address = address;
    }

    public void printHouseInfo(){
        System.out.println("House info: year = "+ year +"\nnumber of bedrooms = "
                + bedrooms
                + "\nnumber of bathrooms = "+this.bathrooms + "\naddress: "+address);
    }
}

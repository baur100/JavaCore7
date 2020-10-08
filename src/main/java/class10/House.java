package class10;

public class House {
    private int year;
    private int bedrooms;
    private int bathrooms;
    private String address;

    public House (int year, int beds, int baths, String address){
        this.year = year;
        bedrooms = beds;
        bathrooms = baths;
        this.address = address;
    }
    public House(){}

    public House(int bedrooms, int bathrooms, String address){
        this.address = address;
        this.bathrooms = bathrooms;
        this.bedrooms = bedrooms;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }


    public void printHouseInfo(){
        System.out.println("House info: year = "+year+"\nnumber of bedrooms = "+bedrooms+"\nnumber of bathrooms = "+this.bathrooms +"\naddress: "+address);
    }
}

package hwk4;

public class Road {
    private String name;
    private int referenceNumber;
    private String state;

    public Road() {}

    public Road (String name, int referenceNumber, String state){
    this.name = name;
    this.referenceNumber= referenceNumber;
    this.state = state;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(int referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void printRoadInfo(){
        System.out.println("You are currently in road: " + name + " " + referenceNumber+ " in "+ state + " state");
    }
}

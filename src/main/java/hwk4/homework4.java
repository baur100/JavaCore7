package hwk4;

public class homework4 {
    public static void main(String[] args) {
//        1. Create 4 classes with fields (at least 3 fields) and methods (at least 1 method)
//        each class has at least 2 constructors (default and full)
//        create printClass()/ printInfo() method to print out all fields
//        fields are private
//        each field has getter and setter √

            //done!

//        2. In the App class create main() and create 2 instanses of each class;
//        one instance created used default constructor - fill up fields using setter
//        second object created using full constructor
//        print object info using print-out method
            //fist class
            Car myCar = new Car();
            myCar.setColor("red");
            myCar.setModel("Corrolla");
            myCar.setYear(2010);

            Car mySecondCar = new Car("blue", "Passat", 2001 );

        myCar.printCarInfo();
        mySecondCar.printCarInfo();

        //second class
        Road lessFavRoad = new Road();
        lessFavRoad.setName("Interstate");
        lessFavRoad.setState("CA");
        lessFavRoad.setReferenceNumber(405);

        Road otherBadRoad = new Road("Interstate",10, "CA" );

        lessFavRoad.printRoadInfo();
        otherBadRoad.printRoadInfo();

        //third class
        Signs stopSign = new Signs();
        stopSign.setColor("yellow");
        stopSign.setDirection("Yield upcoming traffic");
        stopSign.setDrawing("blank lettering saying Yield");

        Signs yieldSign = new Signs("red", "Stop at the line" , "white letter saying stop");

        stopSign.printSignInfo();
        yieldSign.printSignInfo();

        //fourth class
        Trips nextTrip = new Trips();
        nextTrip.setScenery("Lake Tahoe");
        nextTrip.setSeason("Winter");
        nextTrip.setState("NV");

        Trips anotherTrip = new Trips("The Rocky Mountains", "CO", "Fall");

        nextTrip.printTripInfo();
        anotherTrip.printTripInfo();



    }
}

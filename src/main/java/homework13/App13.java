package homework13;

public class App13 {
    public static void main (String[] args) {
        Address toAddress = new Address("10 Main Street", "Alhambra", "CA", 94555);
        Address fromAddress = new Address("22 Elm Street", "Fremont", "CA", 94412);
        Weight weight = new Weight(12, WeightUnitOfMeasure.KG );
        Dimensions dimensions = new Dimensions(
                new Length(12, LengthUnitOfMeasure.CM),
                new Length(6, LengthUnitOfMeasure.CM),
                new Length(1, LengthUnitOfMeasure.M)
        );
        Parcel myParcel = new Parcel(weight, dimensions, "Ivan Petrov", "Masha Ivanova", toAddress, fromAddress);

        System.out.println(myParcel);
    }



}

package homework9;

public class HW93 {
    public static void main(String[] args) {
        Furniture bed = new Furniture();
        bed.name = "bad";
        bed.store = "Costco";
        bed.color = "mahogony";
        bed.theCountryOfManufacture = "Italy";
        bed.price = 899;

        Furniture desk = new Furniture();
        desk.name = "desk";
        desk.store = "IKEA";
        desk.color = "white";
        desk.theCountryOfManufacture = "China";
        desk.price = 150;

        bed.ad();
        desk.ad();

        String badItem = bed.item();
        System.out.println(badItem);

        String deskItem = desk.item();
        System.out.println(deskItem);
    }
}

package homework9;

public class HW93 {
    public static void main(String[] args) {
        Furniture bad = new Furniture();
        bad.name = "bad";
        bad.store = "Costco";
        bad.color = "mahogony";
        bad.theCountryOfManufacture = "Italy";
        bad.price = 899;

        Furniture desk = new Furniture();
        desk.name = "desk";
        desk.store = "IKEA";
        desk.color = "white";
        desk.theCountryOfManufacture = "China";
        desk.price = 150;

        bad.ad();
        desk.ad();

        String badItem = bad.item();
        System.out.println(badItem);

        String deskItem = desk.item();
        System.out.println(deskItem);
    }
}

package lesson12;

public class Stan12 {
    public static void main(String[] args) {
        MacBookAir book1 = new MacBookAir("13", "intel i5", "medium size", false);
        MacBookAir book2 = new MacBookAir("13", "intel i3", "medium, size", true);

        MacBookPro bookPro1 = new MacBookPro("15", "intel i7", "large size", true);
        MacBookPro bookPro2 = new MacBookPro("13", "intel i5", "medium size", true);

//        book1.macOsCompatibleApps();
//        bookPro1.macOsCompatibleApps();

        Laptop book3 = new MacBookAir("13", "intel i3", "size", true);
        Laptop book4 = new MacBookAir("12", "intel i3", "small size", true);

        MacOS book5 = new MacBookAir("13","intel i3", "medium size", false);

        book5.macOsCompatibleApps();
    }

}

package HW14;

import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        List<String> gadgets = new ArrayList<>();
        gadgets.add("Phone");
        gadgets.add("Tablet");
        gadgets.add("laptop");
        gadgets.add("watch");

        List<Name> names =new ArrayList<>();
        names.add(Name.IPHONE12);
        names.add(Name.IPADPRO7);
        names.add(Name.MACBOOKPRO2020);
        names.add(Name.IWATCH6);

        List<Double> price = new ArrayList<>();
        price.add(0, 999.00);
        price.add(1, 599.00);
        price.add(2, 1599.00);
        price.add(3, 399.00);

        NewAppleProducts products = new NewAppleProducts(gadgets,names,price);

        System.out.println(products.toString());

    }
}

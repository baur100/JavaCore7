package aehwlesson14;

import java.util.ArrayList;

public class App1 {
    public static void main(String[] args) {
        ArrayList<String> carBrands = new ArrayList<>();

        carBrands.add("BMW");
        carBrands.add("Mercedes");
        carBrands.add("Tesla");
        carBrands.add(0, "Lexus");

        System.out.println(carBrands);


        ArrayList<String> newCarBrands = new ArrayList<>();
        newCarBrands.add("Acura");
        newCarBrands.add("Honda");
        newCarBrands.add("Toyota");

        carBrands.addAll(0,newCarBrands);

        System.out.println(carBrands);

        boolean aa = carBrands.contains("KIA");
        System.out.println(aa);

        boolean aaa = carBrands.containsAll(newCarBrands);
        System.out.println(aaa);

        newCarBrands.set(0, "KIA");
        System.out.println(newCarBrands);

        carBrands.removeAll(newCarBrands);
        System.out.println(carBrands);

    }
}

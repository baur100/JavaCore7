package lesson13HW;

import java.util.Arrays;

public class App {

    public static void main (String [] args){

        LocalCurrency myCurrency = new LocalCurrency(Countries.USA, CapitalCity.values());
        myCurrency.setCapitalCity(CapitalCity.values());
        myCurrency.PrintEverything();
        myCurrency.setCountries(Countries.USA);

    }
}
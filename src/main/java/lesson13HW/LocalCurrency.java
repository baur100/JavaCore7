package lesson13HW;

import java.util.Arrays;

import static lesson13HW.Countries.*;

public class LocalCurrency {
    private Countries countries;
    private CapitalCity[] capitalCity;

    public LocalCurrency(Countries countries, CapitalCity[] capitalCity) {
        this.countries = countries;
        this.capitalCity = capitalCity;
    }


    public CapitalCity[] getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(CapitalCity[] capitalCity) {
        this.capitalCity = capitalCity;
    }

    public void setCountries(Countries countries) {
        this.countries = countries;

    }

    public Countries getCountries() {
        return countries;
    }


    @Override
        public String toString() {
            return "LocalCurrency{" +
                    "countries=" + countries +
                    ", capitalCity=" + Arrays.toString(capitalCity) +
                    '}';

    }

    public void PrintEverything (){
        System.out.println(toString());

    }

    public void PrintCountries(){
        System.out.println(countries);

    }

}






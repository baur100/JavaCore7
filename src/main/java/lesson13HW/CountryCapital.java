package lesson13HW;

import java.util.Arrays;

import static java.lang.Enum.valueOf;
import static lesson13HW.Countries.Canada;

public class CountryCapital {
    private Countries countries;
    private CapitalCity[] capitalCity;


    public CountryCapital(Countries countries, CapitalCity[] capitalCity) {
        this.countries = countries;
        this.capitalCity = capitalCity;
    }

    public CountryCapital(Countries canada) {
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
        return "country is " + countries;

    }


    public void printToString() {
        System.out.println(toString());
        for (CapitalCity v : CapitalCity.values()){
            if (v == (CapitalCity.Santiago)) {
                System.out.println(countries.Chile);
            } else if (v == (CapitalCity.Toronto)) {
                System.out.println(countries.Canada);
            } else if (v == (CapitalCity.Tokyo)) {
                System.out.println(countries.Japan);
            } else if (v == (CapitalCity.Shanghai)) {
                System.out.println(countries.China);
            } else if (v == (CapitalCity.Quito)) {
                System.out.println(Countries.Ecuador);
            } else {
                System.out.println("Try a different country");
            }
        }
    }
}






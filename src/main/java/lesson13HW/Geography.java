package lesson13HW;

import java.util.Arrays;

public class Geography {
    private Continents continents;
    private Countries countries;
    private CapitalCity[] capitalCity;


  public Geography(Continents continents , Countries countries, CapitalCity[] capitalCity){
      this.continents = continents;
      this.countries = countries;
      this.capitalCity = capitalCity;

  }


         public void setContinents (Continents continents) {
            this.continents = continents;
         }
         public Continents getContinents() {
            return continents;
         }

         public void setCountries(Countries countries) {
            this.countries = countries;
         }
         public Countries getCountries() {
            return countries;
         }
         public void setCapitalCity(CapitalCity[] capitalCity){
            this.capitalCity = capitalCity;
         }
         public CapitalCity[] getCapitalCity() {
            return capitalCity;
         }

    @Override
    public String toString() {
        return "Geography{" +
                "continents=" + continents +
                ", countries=" + countries +
                ", capitalCity=" + Arrays.toString(capitalCity) +
                '}';
    }
}


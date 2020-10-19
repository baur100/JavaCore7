package lesson13;

public class Stan13 {
    public static void main(String[] args) {
        UsaAndEurope countriesAndStates = new UsaAndEurope(WesternEurope.FRANCE, WestUsaStates.CALIFORNIA);
        countriesAndStates.print();

         WesternEurope[] arrayEnums = WesternEurope.values();

         for (WesternEurope country : arrayEnums) {
             System.out.println(country + " at index " +country.ordinal());
         }

         WestUsaStates[] arrayEnums2 = WestUsaStates.values();

         for (WestUsaStates state : arrayEnums2) {
             System.out.println(state + " at index " + state.ordinal());
         }
    }
}

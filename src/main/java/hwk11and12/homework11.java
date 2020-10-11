package hwk11and12;

public class homework11 {
    public static void main(String[] args) {
        //Create an interface and 2 classes which implements it
            //Interface created= dessert
            //2classes= Cake & IceCream
        //Create 2 objects of each class
        //Assign one object to interface type

        //First class
        String[] cakeFillings = {"Strawberries", "Rash Berries", "Blue Berries", "Marmelade"};
        String[] bestCakeFillings = {"Strawberries", "Creme"};

        Dessert myNewCake = new Cake("chocolate","two", cakeFillings);
        Dessert myBestCake = new Cake("vanilla","three", bestCakeFillings);

        myNewCake.getDessert();
        myBestCake.getDessert();

        //second class
        String[] sorbetIngredients = {"Fresh Strawberries", "Mango Slices", "Passion Fruit Juice"};
        String[] gellatoIngredients = {"Creme", "Chocolate", "Dark Chocolate Chips"};

        Dessert fruitySorbet = new IceCream("Fruity Island Sorbet", sorbetIngredients);
        Dessert cremeChocolateGellato = new IceCream("Chocolate Gellato", gellatoIngredients);
        fruitySorbet.getDessert();
        cremeChocolateGellato.getDessert();
    }
}


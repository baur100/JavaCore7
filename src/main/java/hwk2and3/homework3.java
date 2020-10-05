package hwk2and3;

import java.util.Arrays;

public class homework3 {
    public static void main(String[] args) {
//        1. Create 4 classes with fields and methods √
//        2. In the App class create main() and create 2 instances of each class, fill all fields
//        invoke methods
        //first class w/ instances
        hw3Candles firstCandle = new hw3Candles();
        firstCandle.size = "big";
        firstCandle.color = "orange";
        firstCandle.amountOfCandles= 10;
        firstCandle.name = "Like a Sunset";

        hw3Candles secondCandle = new hw3Candles();
        secondCandle.size = "small";
        secondCandle.name = "Ocean Vibes";
        secondCandle.amountOfCandles = 1;
        secondCandle.color = "aqua";

        firstCandle.candleStock();
        secondCandle.candleSizeDecore();

        //second class w/ instances
        hw3Dessert chocolateCake = new hw3Dessert();
        chocolateCake.flavor = "chocolate";
        chocolateCake.layersFilling = "strawberries";
        chocolateCake.numberOfLayers = 2;
        chocolateCake.quantity = 1;

        hw3Dessert vanillaCake = new hw3Dessert();
        vanillaCake.numberOfLayers =10;
        vanillaCake.quantity = 0;
        vanillaCake.isItOnStock = "no";
        vanillaCake.layersFilling = "banana";
        vanillaCake.flavor = "vanilla";

        System.out.println("I have " + chocolateCake.quantity +" "+ chocolateCake.flavor + " cake");
        //do we have this cake
        System.out.println(vanillaCake.checkStock());

        //third class
        hw3Movies DrSleep = new hw3Movies();
        DrSleep.genera = "horror";
        DrSleep.name = "Dr. Sleep";

        hw3Movies mamaMia = new hw3Movies();
        mamaMia.name = "MAMA MIA";
        mamaMia.genera = "Romance";

        DrSleep.whatMovieIsShowing();
        mamaMia.whatMovieIsShowing();

        //fourth class
        hw3Makeup mel = new hw3Makeup();
        mel.name = "Melissa";
        mel.color = "pink";
        mel.brand = "Urban Decay";
        mel.currentMakeup = new String[]{"liquid fundation", "blush", "mascara"};

        mel.favorites();
        System.out.println(mel.name+ " currently has: " + Arrays.toString(mel.currentMakeup));


    }
}

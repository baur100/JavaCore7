package homwork2and3;

import java.security.PublicKey;

public class hw3Candles {
    public String name;
    public String color;
    public String size;
    public int amountOfCandles;

    public void candleStock(){
        System.out.println("I have "+ amountOfCandles+ " left of "+ name);
    }

    public void candleSizeDecore(){
        System.out.println("I have "+ amountOfCandles+ " " + size + " color " +color);
    }
}

package L4;

public class App3 {
    public static void main(String[] args) {
        weatherForecast("Seattle");
        weatherForecast("LA");
        weatherForecast("NYC");
        weatherForecast("Washington");
    }

    public static void weatherForecast(String city) {
        if (city.length() > 5) {
            System.out.println("Tomorrow in " + city + " will be awful weather");
        } else {
            System.out.println("Tomorrow in " + city + " will be very good and pleasant weather");
        }
    }
}
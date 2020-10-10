package homework_for_lesson13;

public class TourSchedule {
    private String country;
    private String city;
    private String repertoire;
    private int days;
    private Months month;

    public TourSchedule(String country, String city, String repertoire, int days, Months month) {
        this.country = country;
        this.city = city;
        this.repertoire = repertoire;
        this.days = days;
        this.month = month;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRepertoire() {
        return repertoire;
    }

    public void setRepertoire(String repertoire) {
        this.repertoire = repertoire;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Months getMonth() {
        return month;
    }

    public void setMonth(Months month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "TourSchedule{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", repertoire='" + repertoire + '\'' +
                ", days=" + days +
                ", month=" + month +
                '}';
    }
}
package aehwlesson13;

public class Today {
    private WeekDay day;

    public Today(WeekDay day) {
        this.day = day;
    }

    public WeekDay getDay() {
        return day;
    }

    public void weekend(){
        if (day == WeekDay.SATURDAY || day == WeekDay.SUNDAY ){
            System.out.println("It's a weekend!");
        }else System.out.println("It's not a weekend yet");
    }

}

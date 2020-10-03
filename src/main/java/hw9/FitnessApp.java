package hw9;

public class FitnessApp {
    public static void main(String[] args) {
        Fitness barbellPress = new Fitness();
        barbellPress.exercise = "Barbel press";
        barbellPress.sets = 4;
        barbellPress.weight = 100;
        barbellPress.reps = 10;

        barbellPress.start();
    }
}

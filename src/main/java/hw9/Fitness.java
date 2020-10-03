package hw9;

public class Fitness {
    public String exercise;
    public int sets;
    public double weight;
    public int reps;

    public void start() {
        System.out.println("Starting exercise: " + exercise);
        double total = sets * reps * weight;
        for (int i = 1; i <= sets; i++) {
            System.out.println(i + ". Set");
            System.out.println("\t" + reps + "X" + weight + " lb");
        }
        System.out.println("Total: " + total + " lb");
    }
}

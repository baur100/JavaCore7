package techInterview;

public class ReminderApp {
    public static void main(String[] args) {
        int a = 27;
        int b = 3;
        int reminder = reminderLoop(a, b);
        System.out.println(reminder);
    }
    public static int reminder(int a, int b) {
        int c = a / b;
        return a - b * c;
    }
    public static int reminderLoop(int a, int b) {
        while (a >= b) {
            a -= b;
        }
        return a;
    }
}

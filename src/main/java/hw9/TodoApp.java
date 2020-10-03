package hw9;

public class TodoApp {
    public static void main(String[] args) {
        Todo list1 = new Todo();
        list1.title = "Buy milk";

        list1.done();
        list1.wip();
        System.out.println(list1.status);
    }
}

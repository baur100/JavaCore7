package hw9;

public class Todo {
    public String title;
    public String status = "to do";

    public void wip() {
        if (status == "done") {
            return;
        }
        status = "Work in progress";
    }
    public void done() {
        status = "done";
    }
}

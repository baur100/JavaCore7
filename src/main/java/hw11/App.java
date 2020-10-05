package hw11;

public class App {
//        1. Create a super class and 3 child classes
//        create 2 object of each class (including superclass - don't make it abstract)
    public static void main(String[] args) {
        Person judy = new Person("Judy", "Donie", 'F', "10/05/2020");
        Person tony = new Person("Tony", "Starck", 'M', "12/12/1965");

        Shareholder zack = new Shareholder(
                "Zack",
                "Peterson",
                'M',
                "10/29/1992",
                01, 50);
        Shareholder lucy = new Shareholder(
                "Lucy",
                "Ivan",
                'F',
                "02/05/1989",
                02, 50);

        Employee manager = new Employee(
                "Mark",
                "Lorem",
                'M',
                "09/20/1991",
                001, "Manager");
        Employee accountant = new Employee(
                "Maria",
                "Drake",
                'F',
                "05/29/1995",
                002, "Accountant");

        Customer c0001 = new Customer("Joe", "Truby", 'M', "02/18/1987", 00001);
        Customer c0002 = new Customer("Chandler", "Bing", 'M', "04/02/1982", 00002);
    }
}

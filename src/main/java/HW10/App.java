package HW10;

public class App {
    public static void main(String[] args) throws Exception {

        Employee julia = new Employee();
        julia.setName("Julia");
        julia.setLastName("Simmons");
        julia.setYear(1995);

         julia.printEmployeeInfo();

        Employee myEmployee = new Employee(1998, "Julia", "Simmons");
        myEmployee.printEmployeeInfo();

        Books mylibrary = new Books();
        mylibrary.setBook("The Hunger Games");
        mylibrary.setAuthor("Suzanne Collins");
        mylibrary.setYearpub(2010);

        mylibrary.printBooksInfo();

        Books mylibrary2 = new Books(1998, "A Tale of Two Cities", "Charles Dickens");
        mylibrary2.printBooksInfo();

        Dept mydept = new Dept();
        mydept.setDept("Movies");
        mydept.setNoofpeople(3);
        mydept.setShare("shared");

        mydept.printDeptInfo();

        Dept mydept2 = new Dept(5, "Books", "not shared");
        mydept2.printDeptInfo();

        Movies mymovies = new Movies();
        mymovies.setMovie("Marvel's The Avengers");
        mymovies.setYearcreated(2012);
        mymovies.setDirector("Joss Whedon");

        mymovies.printMovieInfo();

        Movies mymovie2 = new Movies(2002, "Spider-man", "Sam Raimi");
        mymovie2.printMovieInfo();

       }

}
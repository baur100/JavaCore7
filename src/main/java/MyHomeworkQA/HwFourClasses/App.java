package MyHomeworkQA.HwFourClasses;

public class App {
    /*2. In the App class create main() and create 2 instances of each class, fill all fields
    invoke methods*/
    public static void main(String[] args) {
        FlatRect small = new FlatRect();
        small.height = 4;
        small.width = 3;
        System.out.println("Perimeter of small = " + small.getPerimeter());
        System.out.println("Area of small = " + small.getArea());
        System.out.println("-----------------------------------");
        FlatRect large = new FlatRect();
        large.width = 10;
        large.height = 16;
        System.out.println("Perimeter of large = " + large.getPerimeter());
        System.out.println("Area of large = " + large.getArea());
        System.out.println("-----------------------------------");
        Scout maj = new Scout();
        maj.rank = "Major";
        maj.sign = 'S';
        maj.weapon = "C14 Timberwolf";
        System.out.println(maj.displayScoutInfo());
        maj.setWeapon("FN Ballista");
        System.out.println(maj.displayScoutInfo());
        System.out.println("-----------------------------------");
        Scout prv = new Scout();
        prv.rank = "Cadet";
        prv.sign = 'P';
        prv.weapon = "Howa M1500";
        prv.setWeapon("Frying pan and spatula");
        System.out.println(prv.displayScoutInfo());
        System.out.println("-----------------------------------");
        Book mockbird = new Book();
        mockbird.title = "To Kill a Mockingbird";
        mockbird.author = "Harper Lee";
        System.out.println(mockbird.getTitleAndAuthor()+" was published in "+mockbird.getYearPublished());
        mockbird.yearPublished = 1960;
        System.out.println(mockbird.getTitleAndAuthor()+" was published in "+mockbird.getYearPublished());
        System.out.println("-----------------------------------");
        Book lordring = new Book();
        lordring.yearPublished = 1954;
        lordring.author = "J.R.R. Tolkien";
        lordring.title = "The Fellowship of the Ring";
        System.out.println(lordring.getTitleAndAuthor()+" was published in "+lordring.getYearPublished());
        System.out.println("-----------------------------------");
        FlatRound xx = new FlatRound();
        xx.radius = 6.7;
        xx.calcCircumference();
        xx.calcArea();
        System.out.println("-----------------------------------");
        FlatRound zz = new FlatRound();
        zz.radius = 0.95;
        zz.calcArea();
        zz.calcCircumference();
        System.out.println("Diameter = "+zz.getDiameter());
    }
}

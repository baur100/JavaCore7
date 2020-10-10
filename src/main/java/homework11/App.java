package homework11;

public class App {
    public static void main(String[] args){
        //Developer subclass
        Developer johnWalker = new Developer("John", "Walker", "male", 2018, 45, 67.5);
        Developer aliceWonderful = new Developer("Alice", "Wonderful", "female", 2017, 50, 75);
        //Salesperson subclass
        Salesperson rexLuther = new Salesperson("Rex", "Luther", "male", 2016, 2000, 5000);
        Salesperson livTaylor = new Salesperson( "Liv", "Taylor", "female", 2019, 1500, 5500);
        //Manager subclass
        Manager joshRedman = new Manager("Josh", "Redman", "male", 2014, 60000, 10000);
        Manager bethKing = new Manager("Beth", "King", "female", 2010, 90000, 20000);

        String johnInfo = johnWalker.getDeveloperInfo();
        System.out.println(johnInfo);
        String aliceInfo = aliceWonderful.getDeveloperInfo();
        System.out.println(aliceInfo);
        String rexInfo = rexLuther.getSalespersonInfo();
        System.out.println(rexInfo);
        String livInfo = livTaylor.getSalespersonInfo();
        System.out.println(livInfo);
        String joshInfo = joshRedman.getManagerInfo();
        System.out.println(joshInfo);
        String bethInfo = bethKing.getManagerInfo();
        System.out.println(bethInfo);
    }


}

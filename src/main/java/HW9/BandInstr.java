package HW9;

public class BandInstr {
    public String firstname;
    public String instrument;
    public int grade;
    public String lastname;

    public void instrument(){
        System.out.println("I am "+firstname+" "+lastname+" " + "I play "+instrument+ " in grade "+grade);

    }
    public void lastname(){

        System.out.println(lastname + " play's a "+instrument);
    }
}

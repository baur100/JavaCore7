package homework9;

public class Coach {
    public String firstName;
    public String lastName;
    public String gender;
    public String sport;
    public String location;
    public int pricePerHour;

    public String coachInfo() {
        return firstName+" "+lastName+" "+gender+" "+sport+" "+location+" "+pricePerHour;
    }

    public void aboutMe() {
        System.out.println("My name is "+firstName+ " " +lastName+ ". " + "I am a " + sport + " coach.");
    }

    public static String classDescription() {
        return "Coach info";
    }
}




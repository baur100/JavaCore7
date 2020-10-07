package homework10;

public class Coach {
    private String firstName;
    private String lastName;
    private String gender;
    private String sport;

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getSport(){
        return sport;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
    public Coach (){}

    public Coach (String firstName, String lastName, String gender, String sport) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.sport = sport;
    }
    public void aboutMe() {
        System.out.println("My name is "+firstName+ " " +lastName+ ". " + "I am a " + sport + " coach.");
    }
}

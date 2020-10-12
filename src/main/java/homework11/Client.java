package homework11;

public class Client extends Countries {

    protected int clientId;
    protected String firstName;
    protected String lastName;





    public Client(String language, String religion, int clientId, String firstName, String lastName) {
        super(language, religion);

        this.firstName = firstName;
        this.clientId = clientId;
        this.lastName = lastName;

    }

    public  void greeting() {
        System.out.println("Welcome back" + " " + firstName + " " +  lastName);
    }

}





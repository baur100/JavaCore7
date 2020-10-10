package homework11;

public class Client extends Countries {
    protected int clientId;
    protected   String firstName;
    protected String lastName;

    public Client(String name, int population, String language, String religion, int clientId, String firstName, String lastName) {
        super(name, population, language, religion);

        this.firstName = firstName;
        this.clientId = clientId;
        this.lastName = lastName;
    }
}





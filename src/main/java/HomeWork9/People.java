package HomeWork9;

// Encapsulation: all properties are invisible from outside.

public class People {
    private String name;
    private String lastName;
    private int year;

    public void setName(String n)
    {
        this.name = n;
    }
    public String getName()
    {
        return name;
    }
    public String setLastName(String lastName)
    {
        this.lastName = lastName;
        {
            String getLastName;
            {
                return this.lastName;
            }
        }
    }

}

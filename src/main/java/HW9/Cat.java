package HW9;

public class Cat {
    public String hairiness;
    public String breed;
    public int age;

    public void certainty() {
        System.out.println(breed + " i like this breed !!!");
    }

    public void availability() {
        System.out.println(hairiness + " this cat has more hairiness !!!");

    }

    //for example only
    public String getPersonInfo() {
        return //"my cat is " + breed + " " + age + " " + hairiness;
                "\n\tBreed -> " +
                        breed + "\n\tYear -> " + age + "\n\tEye Hairiness -> " + hairiness;
    }
}

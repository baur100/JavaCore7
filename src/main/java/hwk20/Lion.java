package hwk20;

public class Lion implements Life, extends Carnivores{
    private String lion;

    public Lion(String lion) {
        this.lion = lion;
    }
    public void canBreath(){
        System.out.println("I can breath!!!!");
    }

    public void carnivores(){
            System.out.println("I eat meat");
    }

    @Override
    public void mammals() {

    }


    @Override
    public void animal() {

    }

    @Override
    public void nameVertebrates() {

    }
}

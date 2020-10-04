package MyHomeworkQA.lesson10hw;



public class Journal {

    private boolean secret;
    private String text;
    private String owner;

    public Journal(){}

    public Journal(boolean secret, String post, String owner){
        this.secret = secret;
        this.text = post;
        this.owner = owner;
    }

    public void printJournal(){
        if (!secret){
            System.out.println("Text:\n"+getText()+"\n-----------------\n"+getOwner());
        }
    }

    public boolean isSecret() {
        return secret;
    }

    public void setSecret(boolean secret) {
        this.secret = secret;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}

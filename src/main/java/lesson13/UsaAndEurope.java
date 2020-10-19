package lesson13;

public class UsaAndEurope {
    private WesternEurope europe;
    private WestUsaStates states;

    public UsaAndEurope(WesternEurope europe, WestUsaStates states) {
        this.europe = europe;
        this.states = states;
    }

    public WesternEurope getEurope() {
        return europe;
    }

    public WestUsaStates getStates() {
        return states;
    }

    public void print() {
        System.out.println( "UsaAndEurope{" +
                "europe=" + europe +
                ", states=" + states +
                '}');
    }
}


package lesson13;

public class ArrayEnums {
    private final WestUsaStates[] pacificStates;

    public ArrayEnums(WestUsaStates[] pacificStates) {
        this.pacificStates = pacificStates;
    }

    public WestUsaStates[] getPacificStates() {
        return pacificStates;
    }

    public void iterStates(){
        System.out.println(getPacificStates());
    }
}

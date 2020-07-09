public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("now start state");
        context.setState(this);
    }

    public String toString() {
        return "start state";
    }
}

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("now stop state");
        context.setState(this);
    }

    public String toString() {
        return "stop state";
    }
}

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public List<Observer> getObservers() {
        return observers;
    }

    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer ob) {
        observers.add(ob);
    }

    public void notifyAllObservers() {
        for(Observer ob : observers) {
            ob.update();
        }
    }
}

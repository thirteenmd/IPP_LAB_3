package Observer;

import java.util.ArrayList;
import java.util.List;

public class Rulaj {
    private List<Observer> observers = new ArrayList<>();
    private int meters;

    public int getMeters() {
        return meters;
    }

    public void setMeters(int meters) {
        this.meters = meters;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

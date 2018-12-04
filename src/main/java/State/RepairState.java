package State;

public class RepairState implements State{

    public void doAction(ContextCarState contextCarState) {
        System.out.println("Vehicle is in Repair State");
        contextCarState.setState(this);
    }

    public String toString(){
        return "Repair State";
    }
}

package State;

public class TestingState implements State{

    public void doAction(ContextCarState contextCarState) {
        System.out.println("Vehicle is in Testing State");
        contextCarState.setState(this);
    }

    public String toString(){
        return "Testing State";
    }
}

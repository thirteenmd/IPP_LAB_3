package State;

public class ContextCarState {
    private State state;

    public ContextCarState(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
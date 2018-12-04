package Template;

public abstract class Race {
    public abstract void initialize();
    public abstract void startRace();
    public abstract void endRace();

    //template method
    public final void play(){

        //initialize the race
        initialize();

        //start race
        startRace();

        //end race
        endRace();
    }
}

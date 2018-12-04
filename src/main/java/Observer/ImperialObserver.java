package Observer;

public class ImperialObserver extends Observer {
    public ImperialObserver(Rulaj rulaj) {
        this.mRulaj = rulaj;
        this.mRulaj.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Miles - " +  mRulaj.getMeters() / 1600 );

    }
}

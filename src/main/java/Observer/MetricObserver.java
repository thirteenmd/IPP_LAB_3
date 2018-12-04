package Observer;

public class MetricObserver extends Observer {
    public MetricObserver(Rulaj rulaj) {
        this.mRulaj = rulaj;
        this.mRulaj.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "KM - " +  mRulaj.getMeters() / 1000 );

    }
}

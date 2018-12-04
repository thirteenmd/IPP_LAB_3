import Memento.BrandAnalitic;
import Models.CarImpl;
import Models.MotoImpl;
import Models.Vehicle;
import NullObject.AbstractTransport;
import NullObject.TransportFactory;
import Observer.ImperialObserver;
import Observer.MetricObserver;
import Observer.Rulaj;
import State.ContextCarState;
import State.RepairState;
import State.TestingState;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void checkMemento() {
        BrandAnalitic brandAnalitic = new BrandAnalitic();

        Vehicle car = new CarImpl("BMW", "X6");
        Vehicle moto= new MotoImpl("Suzuki", "Bandit");

        brandAnalitic.add(car.saveBrandToMemento());
        brandAnalitic.add(moto.saveBrandToMemento());

        System.out.println(brandAnalitic.get(0).getName());
        System.out.println(brandAnalitic.get(1).getName());
    }

    @Test
    void checkNullObject() throws Exception {
        AbstractTransport transport1 = TransportFactory.getTransport("BMW", "x3");
        AbstractTransport transport2 = TransportFactory.getTransport("Opel", "Corsa");
        AbstractTransport transport3 = TransportFactory.getTransport("Audi", "A7");

        System.out.println(transport1.getName() + " " + transport1.getModel());
        System.out.println(transport2.getName() + " " + transport2.getModel());
        System.out.println(transport3.getName() + " " + transport3.getModel());

    }

    @Test
    void chechTemplate() {
        MotoImpl moto = new MotoImpl("Honda", "CBR");
        moto.play();
    }

    @Test
    void checkState() {
        ContextCarState contextCarState = new ContextCarState();

        RepairState repairState = new RepairState();
        repairState.doAction(contextCarState);

        System.out.println(contextCarState.getState().toString());

        TestingState testingState = new TestingState();
        testingState.doAction(contextCarState);

        System.out.println(contextCarState.getState().toString());
    }

    @Test
    void checkObserver() {
        Rulaj rulaj = new Rulaj();
        rulaj.setMeters(200000);

        new MetricObserver(rulaj);
        new ImperialObserver(rulaj);

        rulaj.setMeters(rulaj.getMeters() + 20000);


        rulaj.setMeters(rulaj.getMeters() + 50000);
    }
}
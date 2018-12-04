package NullObject;

public class NullCarTransport extends AbstractTransport {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not available name";
    }

    @Override
    public String getModel() {
        return "Not available model";
    }
}

package NullObject;

import Models.CarImpl;

public class RealCarTransport extends AbstractTransport{
    CarImpl mCar;
    public RealCarTransport(String name, String model) {
        mCar = new CarImpl(name, model);
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return mCar.getName();
    }

    @Override
    public String getModel() {
        return mCar.getModel();
    }
}

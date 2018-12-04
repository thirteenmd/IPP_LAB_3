package Models;

import Memento.BrandMemento;

public class CarImpl implements Car {
    private String name;
    private String model;

    public CarImpl(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "VehiclePresentationImpl{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
    public BrandMemento saveBrandToMemento(){
        return new BrandMemento(name);
    }
    public String getNameFromBrandMemento(BrandMemento brandMemento){
        return brandMemento.getName();
    }

    public void drive() {
        System.out.println(toString() + " the car is driven");
    }
}

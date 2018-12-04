package Models;

import Memento.BrandMemento;
import Template.Race;

public class MotoImpl extends Race implements Moto {
    private String name;
    private String model;

    public MotoImpl(String name, String model) {
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
        return "MotoImpl{" +
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
        System.out.println(toString() + " the moto is driven");
    }

    @Override
    public void initialize() {
        System.out.println("Race is Initialized, ready to go!");
    }

    @Override
    public void startRace() {
        System.out.println("Start!");
        this.drive();

    }

    @Override
    public void endRace() {
        System.out.println("Finish !!!!!!! ");

    }
}

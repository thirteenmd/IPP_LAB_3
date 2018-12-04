package Models;

import Memento.BrandMemento;

public interface Vehicle {
    public void drive();
    public BrandMemento saveBrandToMemento();
    public String getNameFromBrandMemento(BrandMemento brandMemento);
}

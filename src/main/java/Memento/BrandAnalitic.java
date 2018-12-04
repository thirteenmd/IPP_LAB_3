package Memento;

import java.util.ArrayList;
import java.util.List;

public class BrandAnalitic {
    private List<BrandMemento> mBrandMementos = new ArrayList<>();

    public void add(BrandMemento brandMemento){
        mBrandMementos.add(brandMemento);
    }

    public BrandMemento get(int index){
        return mBrandMementos.get(index);
    }
}

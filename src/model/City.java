package model;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    List<Store> stores;

    public City(String name, List<Store> stores) {
        this.name = name;
        this.stores = stores;
    }

    public City() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", stores=" + stores +
                '}';
    }
}

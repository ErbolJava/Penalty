package model;

import enums.Brand;
import enums.StoreType;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String name;
    private Long id;
    private Brand brand;
    private StoreType storeType;
    private City location;
    private List<Product> products;

    public Store() {

    }

    public Store(String name, Long id, Brand brand, StoreType storeType, City location, List<Product> products) {
        this.name = name;
        this.id = id;
        this.brand = brand;
        this.storeType = storeType;
        this.location = location;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public StoreType getStoreType() {
        return storeType;
    }

    public void setStoreType(StoreType storeType) {
        this.storeType = storeType;
    }

    public City getLocation() {
        return location;
    }

    public void setLocation(City location) {
        this.location = location;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", brand=" + brand +
                ", storeType=" + storeType +
                ", location=" + location +
                ", products=" + products +
                '}';
    }
}

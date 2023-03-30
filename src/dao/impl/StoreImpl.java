package dao.impl;

import dao.StoreInt;
import enums.Brand;
import model.City;
import model.Product;
import model.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StoreImpl implements StoreInt {
List <Store>stores = new ArrayList<>();
List<Product>products = new ArrayList<>();
City city = new City();
    @Override
    public Store addT(Product t, String storeName) {
        Store store = new Store();
        products.add(t);
        store.setProducts(products);
        store.setName(storeName);
        stores.add(store);
        city.setStores(stores);
        return store;
    }

    @Override
    public Store findById(int id) {
        boolean loop = false;
        for (Store s: city.getStores()) {
            if (s.getId() == id) {
                System.out.println(s);
                loop = true;
            }
        }
        if (!loop){
            for (Store s: city.getStores()) {
                if (s.getId() == id) {
                    System.out.println(s);
                }
            }
            }
            return null;
    }

    @Override
    public List<?> removeByBrand(Brand brand) {
        stores.removeIf(store -> store.getBrand().equals(brand));
        return null;
    }

    @Override
    public List<Store> filterByBrand(List<Store> stores, Brand brand) {
stores.stream().filter(store -> store.getBrand().toString().startsWith("A")).forEach(System.out::println);
        return stores;
    }

    @Override
    public List<?> getAllProduct(String name) {
        for (Product p:products) {
            System.out.println(p);
        }
        return null;
    }
}

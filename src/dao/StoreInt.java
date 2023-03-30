package dao;

import enums.Brand;
import model.Product;
import model.Store;

import java.util.List;

public interface StoreInt {
    Store addT(Product t, String storeName);
    Store findById(int id);
    List<?> removeByBrand(Brand brand);
    List<Store> filterByBrand(List<Store> stores, Brand brand) ;
    List<?> getAllProduct(String name);
}

package service.implm;

import dao.impl.StoreImpl;
import enums.Brand;
import model.Product;
import model.Store;
import service.StoreService;

import java.util.List;

public class StoreImplm implements StoreService {
     StoreImpl store = new StoreImpl();
    @Override
    public Store addT(Product t, String storeName) {
        return null;
    }

    @Override
    public Store findById(int id) {
        return null;
    }

    @Override
    public List<?> removeByBrand(Brand brand) {
        return store.removeByBrand(brand);
    }

    @Override
    public List<Store> filterByBrand(List<Store> stores, Brand brand) {
        return null;
    }

    @Override
    public List<?> getAllProduct(String name) {
        return null;
    }
}

package dao.impl;

import dao.CityInt;
import enums.Brand;
import enums.StoreType;
import service.T;

import java.util.List;

public class CityImpl implements CityInt {

    @Override
    public List<?> getAllStoresByBrand(Brand brand) {
        return null;
    }

    @Override
    public List<T> similarStoreTypes(StoreType type, String cityName) {
        return null;
    }

    @Override
    public List<?> quantityProduct(int x, String ascDesc, String storeName) {
        return null;
    }
}

package service.implm;

import enums.Brand;
import enums.StoreType;
import service.CityService;
import service.T;

import java.util.List;

public class CityImplm implements CityService {
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

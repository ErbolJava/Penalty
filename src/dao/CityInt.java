package dao;

import enums.Brand;
import enums.StoreType;
import service.T;

import java.util.List;

public interface CityInt {
    List<?> getAllStoresByBrand(Brand brand);
    //Бир шаардын ичиндеги тиби бир магазиндерди чыгаруу
    List<T> similarStoreTypes(StoreType type, String cityName);
    //Конкретный магазиндин ичинен товарлардын саны x ке берилген сандан жогору же андан кичине
    // болгон товарларды осуу же кемуу тартибинде чыгаруу
    List<?> quantityProduct(int x, String ascDesc,String storeName);
}

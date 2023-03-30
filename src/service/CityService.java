package service;

import enums.Brand;
import enums.StoreType;

import java.util.List;

public interface CityService {
    //Шаардагы конкретный бренддин товарлары сатылган магазиндерди чыгаруу
    List<?> getAllStoresByBrand(Brand brand);
    //Бир шаардын ичиндеги тиби бир магазиндерди чыгаруу
    List<T> similarStoreTypes(StoreType type, String cityName);
    //Конкретный магазиндин ичинен товарлардын саны x ке берилген сандан жогору же андан кичин
// е болгон товарларды осуу же кемуу тартибинде чыгаруу
    List<?> quantityProduct(int x, String ascDesc,String storeName);
}

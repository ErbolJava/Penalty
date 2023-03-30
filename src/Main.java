import enums.Brand;
import enums.StoreType;
import model.City;
import model.Product;
import model.Store;
import service.implm.StoreImplm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        City city = new City();
        city.setName("Bishkek");
        List<Product> products = new ArrayList<>();
        Product product1 = new Product(12L, "apple", Brand.DORDOI_FOOD, 12, 30);
        List<Store> stores = new ArrayList<>();

        StoreImplm storeImplm = new StoreImplm();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    1 - to add/create store | 2 - find store by id | 3 - get all products
                    4 - filter by brand | 5 - remove by brand""");
            switch (scanner.nextInt()) {
                case 1:
                    Store store = new Store();
                    System.out.print("Enter name: ");
                    String a = new Scanner(System.in).next();
                    storeImplm.addT(product1, a);
                    store.setProducts(products);
                    store.setName(a);
                    store.getProducts().add(product1);
                    stores.add(store);
                    city.setStores(stores);
                    store.setId((long) (stores.size() + 1));
                    System.out.println(city);
                    break;
                case 2:
                    boolean loop = false;
                    System.out.print("Enter id: ");
                    int enterId = new Scanner(System.in).nextInt();
                    storeImplm.findById(enterId);
                    for (Store s : city.getStores()) {
                        if (s.getId() == enterId) {
                            System.out.println(s);
                            loop = true;
                        }
                    }
                    if (!loop) {
                        for (Store s : city.getStores()) {
                            if (s.getId() == enterId) {
                                System.out.println(s);
                            }
                        }
                    }
                    break;
                case 3:
                    storeImplm.getAllProduct("lasdg");
                    for (Product p : products) {
                        System.out.println(p);
                    }
                case 4:
                    stores.stream().filter(story -> story.getBrand().toString().startsWith("A")).forEach(System.out::println);
                    storeImplm.filterByBrand(stores, Brand.valueOf(Arrays.toString(Brand.values())));
                case 5 :
                    System.out.print("Name or brand: ");
                    String enterNameOfBrand = new Scanner(System.in).next();
                    storeImplm.removeByBrand(Brand.valueOf(enterNameOfBrand));
                        stores.removeIf(storrr -> storrr.getBrand().toString().equals(enterNameOfBrand));
                        }

                    }
            }
        }
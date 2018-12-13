package BusinessLogic;

import java.util.ArrayList;

public class Phones {

    private static ArrayList<Phone> phones;

    public static ArrayList<Phone> get(){
        return phones;
    }

    public static void initData(){
        phones = new ArrayList<>();

        Phone phone = null;

        // Huawei phones
        phone = new Phone("Huawei", "Huawei P20", 499,5.8f, 9,7, 207377, 3400, 102);
        add(phone);

        phone = new Phone("Huawei", "Huawei P20 Pro", 690,6.1f, 8,7, 209099, 4000, 109);
        add(phone);

        // iPhone phones
        phone = new Phone("Apple", "iPhone 8", 653,4.7f, 9,7, 226791, 1821, 92);
        add(phone);

        phone = new Phone("Apple", "iPhone 8 Plus", 841,5.5f, 9,7, 234229, -1, 94);
        add(phone);

        // LG phones
        phone = new Phone("LG", "LG G7 ThinQ", 453,6.1f, 5,7, 256086, 3000, 83);
        add(phone);

        phone = new Phone("LG", "LG V30", 399,6.0f, 6,6, 173781, 3300, 82);
        add(phone);

        // Nokia phones
        phone = new Phone("Nokia", "Nokia 7 Plus", 313,6.0f, 7,6, 140190, 3800, -1);
        add(phone);

        phone = new Phone("Nokia", "Nokia 8", 299,5.3f, 9,4, 208828, 3090, 68);
        add(phone);

        // Samsung phones
        phone = new Phone("Samsung", "Samsung S8", 419,5.8f, 7,8, 196958, 3000, 95);
        add(phone);

        phone = new Phone("Samsung", "Samsung S8 Plus", 497,6.2f, 6,8, 196923, 3500, 96);
        add(phone);

        // Sony phones
        phone = new Phone("Sony", "Sony Xperia XZ2", 550,5.7f, 8,6, 266913, 3180, 90);
        add(phone);

        phone = new Phone("Sony", "Sony Xperia XZ2 Compact", 448,5.0f, 8,6, 268088, 2870, 86);
        add(phone);
    }

    public static void add(Phone phone){
        phones.add(phone);
    }

    public static ArrayList<Phone> getByBrand(String brand){
        ArrayList<Phone> brandPhones = new ArrayList<>();

        for (Phone phone : get()) {
            if(phone.getBrand() == brand)
                brandPhones.add(phone);
        }

        if(brandPhones.size() > 0)
            return brandPhones;

        return null;
    }
}

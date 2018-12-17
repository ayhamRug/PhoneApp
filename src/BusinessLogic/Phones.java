package BusinessLogic;

import java.util.ArrayList;

public class Phones {

    // Websites advised to use for scores (by the experts):
    // https://www.dxomark.com/category/mobile-reviews/ - for camera scores
    // https://www.gsmarena.com/battery-test.php3 - for battery score
    // http://www.antutu.com/en/ranking/rank1.htm - for performance score

    // Regarding the ageSuitabilityScore and designScore, we asked our experts to provide us
    // with a score from 1 to 10 and we made an average and approximated them to the closest integer.

    private ArrayList<Phone> phones = new ArrayList<Phone>();

    public Phones() {
        Phone phone = null;

        // Huawei phones
        phone = new Phone(Phone.PhoneBrandSelector.Huawei, "Huawei P20", 499,5.8f, 9,7,
                208795, 77, 102, false, true,false);
        phones.add(phone);
        phone = new Phone(Phone.PhoneBrandSelector.Huawei, "Huawei P20 Pro", 690,6.1f, 8,7,
                209863, 89, 109, false, true, true);
        phones.add(phone);

        // iPhone phones
        phone = new Phone(Phone.PhoneBrandSelector.Apple, "iPhone 8", 653,4.7f, 9,7,
                226791, 66, 92,false, false, true);
        phones.add(phone);
        phone = new Phone(Phone.PhoneBrandSelector.Apple, "iPhone 8 Plus", 841,5.5f, 9,7,
                234229, 81, 94,false, false ,true);
        phones.add(phone);

        // LG phones
        phone = new Phone(Phone.PhoneBrandSelector.LG, "LG G7 ThinQ", 453,6.1f, 5,7,
                256086, 77, 83, true, true, true);
        phones.add(phone);
        phone = new Phone(Phone.PhoneBrandSelector.LG, "LG V30", 399,6.0f, 6,6,
                173781, 93, 82,true, true, true);
        phones.add(phone);

        // Nokia phones
        phone = new Phone(Phone.PhoneBrandSelector.Nokia, "Nokia 7 Plus", 313,6.0f, 7,6,
                140190, 87, 62,true, true, false);
        phones.add(phone);
        phone = new Phone(Phone.PhoneBrandSelector.Nokia, "Nokia 8", 299,5.3f, 9,4,
                208828, 78, 68, true,true, false);
        phones.add(phone);

        // Samsung phones
        phone = new Phone(Phone.PhoneBrandSelector.Samsung, "Samsung S8", 419,5.8f, 7,8,
                196958, 84, 95, true, true, true);
        phones.add(phone);
        phone = new Phone(Phone.PhoneBrandSelector.Samsung, "Samsung S8 Plus", 497,6.2f, 6,8,
                196923, 88, 96, true, true, true);
        phones.add(phone);
        phone = new Phone(Phone.PhoneBrandSelector.Samsung, "Samsung S9", 490, 5.8f, 7,8,
                262421,78, 95,true,true,true);
        phones.add(phone);

        // Sony phones
        phone = new Phone(Phone.PhoneBrandSelector.Sony, "Sony Xperia XZ2", 550,5.7f, 8,6,
                266913, 88, 90, true, true, true);
        phones.add(phone);
        phone = new Phone(Phone.PhoneBrandSelector.Sony, "Sony Xperia XZ2 Compact", 448,5.0f, 8,6,
                268088, 88, 86, true, true, true);
        phones.add(phone);
    }

    public ArrayList<Phone> getPhones() {
        return phones;
    }
}

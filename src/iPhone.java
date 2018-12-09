import java.util.ArrayList;

public class iPhone {


    //Making array of phones to store the attribute of each phone
    ArrayList<String[]> iphonePhones = new ArrayList<String[]>();

    public iPhone(){
                             //Name                     Price       Age suitability score       Screen      DesignScore     PerformanceScore    BatteryScore    CameraScore
        String[] phone1 = {"Apple iPhone 8",            "653",      "9",                        "4.7",      "7",            "226791",           "1821",         "92"};
        String[] phone2 = {"Apple iPhone 8 Plus",       "841",      "8",                        "5.5",      "7",            "234229",           "NA",         "94"};

        iphonePhones.add(phone1);
        iphonePhones.add(phone2);


    }

    public ArrayList<String[]> getArray(){
        return iphonePhones;
    }
}

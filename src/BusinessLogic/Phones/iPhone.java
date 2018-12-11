package BusinessLogic.Phones;

public class iPhone extends Phone{

    public iPhone(){
                             //Name                     Price       Age suitability score       Screen      DesignScore     PerformanceScore    BatteryScore    CameraScore
        String[] phone1 = {"Apple iPhone 8",            "653",      "9",                        "4.7",      "7",            "226791",           "1821",         "92"};
        String[] phone2 = {"Apple iPhone 8 Plus",       "841",      "8",                        "5.5",      "7",            "234229",           "NA",         "94"};

        phones.add(phone1);
        phones.add(phone2);
    }
}

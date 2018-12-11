package BusinessLogic.Phones;

public class Sony extends Phone{

    public Sony(){
                             //Name                     Price       Age suitability score       Screen      DesignScore     PerformanceScore    BatteryScore    CameraScore
        String[] phone1 = {"Sony Xperia XZ2",           "550",      "8",                        "5.7",      "6",            "266913",           "3180",         "90"};
        String[] phone2 = {"Sony Xperia XZ2 Compact",   "448",      "8",                        "5.0",      "6",            "268088",           "2870",         "86"};

        phones.add(phone1);
        phones.add(phone2);
    }
}

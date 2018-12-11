package BusinessLogic.Phones;

import java.util.ArrayList;

public class Samsung extends Phone{

    public Samsung(){
                            //Name              Price       Age suitability score       Screen      DesignScore     PerformanceScore    BatteryScore    CameraScore
        String[] phone1 = {"Samsung S8",        "419",      "7",                        "5.8",      "8",            "196958",           "3000",         "95"};
        String[] phone2 = {"Samsung S8 Plus",   "497",      "6",                        "6.2",      "8",            "196923",           "3500",         "96"};

        phones.add(phone1);
        phones.add(phone2);
    }
}

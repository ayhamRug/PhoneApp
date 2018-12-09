import java.util.ArrayList;

public class Samsung {

    //Making array of phones to store the attribute of each phone
    ArrayList<String[]> samsungPhones = new ArrayList<String[]>();

    public Samsung(){
                            //Name              Price       Age suitability score       Screen      DesignScore     PerformanceScore    BatteryScore    CameraScore
        String[] phone1 = {"Samsung S8",        "419",      "7",                        "5.8",      "8",            "196958",           "3000",         "95"};
        String[] phone2 = {"Samsung S8 Plus",   "497",      "6",                        "6.2",      "8",            "196923",           "3500",         "96"};

        samsungPhones.add(phone1);
        samsungPhones.add(phone2);


    }


    public ArrayList<String[]> getArray(){
        return samsungPhones;
    }
}

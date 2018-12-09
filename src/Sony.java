import java.util.ArrayList;

public class Sony {

    //Making array of phones to store the attribute of each phone
    ArrayList<String[]> sonyPhones = new ArrayList<String[]>();

    public Sony(){
                             //Name                     Price       Age suitability score       Screen      DesignScore     PerformanceScore    BatteryScore    CameraScore
        String[] phone1 = {"Sony Xperia XZ2",           "550",      "8",                        "5.7",      "6",            "266913",           "3180",         "90"};
        String[] phone2 = {"Sony Xperia XZ2 Compact",   "448",      "8",                        "5.0",      "6",            "268088",           "2870",         "86"};

        sonyPhones.add(phone1);
        sonyPhones.add(phone2);


    }

    public ArrayList<String[]> getArray(){
        return sonyPhones;
    }
}

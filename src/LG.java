import java.util.ArrayList;

public class LG {

    //Making array of phones to store the attribute of each phone
    ArrayList<String[]> lgPhones = new ArrayList<String[]>();

    public LG(){
                            //Name              Price       Age suitability score       Screen      DesignScore     PerformanceScore    BatteryScore    CameraScore
        String[] phone1 = {"LG G7 ThinQ",       "453",      "5",                        "6.1",      "7",            "256086",           "3000",         "83"};
        String[] phone2 = {"LG V30",            "399",      "6",                        "6.0",      "6",            "173781",           "3300",         "82"};

        lgPhones.add(phone1);
        lgPhones.add(phone2);


    }



    public ArrayList<String[]> getArray(){
        return lgPhones;
    }
}

import java.util.ArrayList;

public class Nokia {

    //Making array of phones to store the attribute of each phone
    ArrayList<String[]> nokiaPhones = new ArrayList<String[]>();

    public Nokia(){
                            //Name              Price       Age suitability score       Screen      DesignScore     PerformanceScore    BatteryScore    CameraScore
        String[] phone1 = {"Nokia 7 Plus",      "313",      "7",                        "6.0",      "6",            "140190",           "3800",         "NA"};
        String[] phone2 = {"Nokia 8",           "299",      "9",                        "5.3",      "4",            "208828",           "3090",         "68"};

        nokiaPhones.add(phone1);
        nokiaPhones.add(phone2);


    }



    public ArrayList<String[]> getArray(){
        return nokiaPhones;
    }
}

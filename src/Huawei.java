import java.util.ArrayList;

public class Huawei {

    //Making array of phones to store the attribute of each phone
    ArrayList<String[]> huaweiPhones = new ArrayList<String[]>();

    public Huawei(){
                            //Name              Price       Age suitability score       Screen      DesignScore     PerformanceScore    BatteryScore    CameraScore
        String[] phone1 = {"Huawei P20",        "499",      "9",                        "5.8",      "7",            "207377",           "3400",         "102"};
        String[] phone2 = {"Huawei P20 Pro",    "690",      "8",                        "6.1",      "7",            "209099",           "4000",         "109"};

        huaweiPhones.add(phone1);
        huaweiPhones.add(phone2);


    }


    public ArrayList<String[]> getArray(){
        return huaweiPhones;
    }

}

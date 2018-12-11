package BusinessLogic.Phones;

import java.util.ArrayList;

// TODO: in future instead o many specific phone classes it would be better to have one Phone class with the properties (commented out) below
// the class would correspond to a database table
//
public class Phone {

//    private String brand;
//    private String model;
//    private float price;
//    private float screenSize;       // in inches
//
//    private short designScore;      // from 1 to 10
//    private short performanceScore; // from 1 to 10
//    private short batteryScore;     // from 1 to 10
//    private short cameraScore;      // from 1 to 10

    //Making array of phones to store the attribute of each phone
    protected ArrayList<String[]> phones = new ArrayList<String[]>();

    public ArrayList<String[]> getPhones(){
        return phones;
    }
}

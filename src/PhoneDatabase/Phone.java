package PhoneDatabase;

public class Phone {

    public enum PhoneBrandSelector {
        Huawei,
        Apple,
        LG,
        Nokia,
        Samsung,
        Sony,
        Any
    }

    private PhoneBrandSelector brand;
    private String model;
    private float price;
    private float screenSize; // in inches

    private int ageSuitabilityScore;
    private int designScore;
    private int performanceScore;
    private int batteryScore;
    private int cameraScore;
    private boolean expandableStorage;

    public Phone(PhoneBrandSelector brand, String model, float price, float screenSize, int ageSuitabilityScore, int designScore, int performanceScore, int batteryScore, int cameraScore, boolean expandableStorage){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
        this.ageSuitabilityScore = ageSuitabilityScore;
        this.designScore = designScore;
        this.performanceScore = performanceScore;
        this.batteryScore = batteryScore;
        this.cameraScore = cameraScore;
        this.expandableStorage = expandableStorage;
    }

    // getters
    //

    public PhoneBrandSelector getBrand(){
        return brand;
    }

    public float getPrice(){
        return price;
    }

    public String getModel(){
        return model;
    }
}

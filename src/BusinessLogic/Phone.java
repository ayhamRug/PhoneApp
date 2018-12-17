package BusinessLogic;

public class Phone {

    public enum PhoneBrandSelector {
        Any,
        Huawei,
        Apple,
        LG,
        Nokia,
        Samsung,
        Sony
    }

    public enum ExpandableStorage {

        ANY("Not Important"),
        YES("Yes"),
        NO("No");

        private final String toString;

        private ExpandableStorage(String toString) {
            this.toString = toString;
        }

        public String toString(){
            return toString;
        }
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
    private boolean dualSim;
    private boolean waterproof;

    public Phone(PhoneBrandSelector brand, String model, float price, float screenSize, int ageSuitabilityScore,
                 int designScore, int performanceScore, int batteryScore, int cameraScore, boolean expandableStorage,
                 boolean dualSim, boolean waterproof){
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
        this.dualSim = dualSim;
        this.waterproof = waterproof;
    }

    // getters
    //

    public float getScreenSize() {
        return screenSize;
    }

    public boolean isDualSim() {
        return dualSim;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public int getAgeSuitabilityScore() {
        return ageSuitabilityScore;
    }

    public int getDesignScore() {
        return designScore;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    public int getBatteryScore() {
        return batteryScore;
    }

    public int getCameraScore() {
        return cameraScore;
    }

    public boolean isExpandableStorage() {
        return expandableStorage;
    }

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

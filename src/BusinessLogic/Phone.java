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

    public enum FingerprintLocation {
        Front,
        Back,
        Side,
        Rear,
        UnderDisplay
    }

    public enum ConnectorType {
        TypeC,
        Lightning
    }

    private PhoneBrandSelector brand;
    private FingerprintLocation fingerprintLocation;
    private ConnectorType connectorType;

    private String name;
    private String image;

    private float price;
    private float displaySize; // in inches

    private int ageSuitabilityScore;
    private int designScore;
    private int performanceScore;
    private int batteryScore;
    private int cameraScore;
    private int numberOfCameras;

    private boolean hasExpandableStorage;
    private boolean isDualSim;
    private boolean isWaterProof;
    private boolean isTouchScreen;
    private boolean hasKeyboard;
    private boolean hasMultipleCameras;
    private boolean hasFingerprint;
    private boolean hasHeadphoneJack;
    private boolean hasPen;
    private boolean hasFaceRecognition;

    // getters
    //

    public PhoneBrandSelector getBrand(){
        return brand;
    }

    public FingerprintLocation getFingerprintLocation() { return fingerprintLocation; }

    public ConnectorType getConnectorType() {
        return connectorType;
    }

    public int getNumberOfCameras() { return numberOfCameras; }

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

    public boolean hasExpandableStorage() {
        return hasExpandableStorage;
    }

    public float getDisplaySize() {
        return displaySize;
    }

    public float getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public String getImage(){
        return image;
    }

    public boolean hasFingerprint() { return hasFingerprint; }

    public boolean isDualSim() {
        return isDualSim;
    }

    public boolean isWaterProof() {
        return isWaterProof;
    }

    public boolean isTouchScreen() { return isTouchScreen; }

    public boolean hasKeyboard() { return hasKeyboard; }

    public boolean hasMultipleCameras() { return hasMultipleCameras; }

    public boolean hasHeadphoneJack() { return hasHeadphoneJack; }

    public boolean hasPen() { return hasPen; }

    public boolean hasFaceRecognition() { return hasFaceRecognition; }
}

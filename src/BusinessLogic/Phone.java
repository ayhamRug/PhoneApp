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
    private int numberOfCameras;

    private boolean touchscreen;
    private boolean dualSim;
    private boolean expandableStorage;
    private boolean keyboard;
    private boolean waterproof;
    private boolean multipleCameras;
    private boolean fingerprint;
    private boolean headphoneJack;
    private boolean pen;
    private boolean faceRecognition;

    public PhoneBrandSelector getBrand() {
        return brand;
    }

    public FingerprintLocation getFingerprintLocation() {
        return fingerprintLocation;
    }

    public ConnectorType getConnectorType() {
        return connectorType;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public float getPrice() {
        return price;
    }

    public float getDisplaySize() {
        return displaySize;
    }

    public int getNumberOfCameras() {
        return numberOfCameras;
    }

    public boolean isTouchscreen() {
        return touchscreen;
    }

    public boolean isDualSim() {
        return dualSim;
    }

    public boolean isExpandableStorage() {
        return expandableStorage;
    }

    public boolean isKeyboard() {
        return keyboard;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public boolean isMultipleCameras() {
        return multipleCameras;
    }

    public boolean isFingerprint() {
        return fingerprint;
    }

    public boolean isHeadphoneJack() {
        return headphoneJack;
    }

    public boolean isPen() {
        return pen;
    }

    public boolean isFaceRecognition() {
        return faceRecognition;
    }
}

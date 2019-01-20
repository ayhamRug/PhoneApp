package BusinessLogic;

// Defining a phone's specifications (just the ones we need for this system)

public class Phone {

    private String brand;
    private String fingerprintLocation;
    private String connectorType;

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

    public String getFingerprintLocation() {
        return fingerprintLocation;
    }

    public String getBrand() {
        return brand;
    }

    public String getConnectorType() {
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

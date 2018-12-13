package BusinessLogic;

public class Phone {

    private String brand;
    private String model;
    private float price;
    private float screenSize; // in inches

    private int ageSuitabilityScore;
    private int designScore;
    private int performanceScore;
    private int batteryScore;
    private int cameraScore;

    public Phone(String brand, String model, float price, float screenSize, int ageSuitabilityScore, int designScore, int performanceScore, int batteryScore, int cameraScore){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
        this.ageSuitabilityScore = ageSuitabilityScore;
        this.designScore = designScore;
        this.performanceScore = performanceScore;
        this.batteryScore = batteryScore;
        this.cameraScore = cameraScore;
    }

    // getters
    //

    public String getBrand(){
        return brand;
    }

    public float getPrice(){
        return price;
    }

    public String getModel(){
        return model;
    }
}

package carrental.kauliacarrentalspringdatabase.Model;

public class Cars {
    private int id;
    private int carTypeId; // Prøv int her?
    private String brand;
    private String model;
    private String fuelType;
    private String registrationNumber;
    private int registrationYear;
    private int registrationMonth;
    private int odometer;


    public Cars(int carTypeId, String brand, String model, String fuelType, String registrationNumber, int registrationYear, int registrationMonth, int odometer) {
        this.carTypeId = carTypeId; //initialize the CarType
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.registrationNumber = registrationNumber;
        this.registrationYear = registrationYear;
        this.registrationMonth = registrationMonth;
        this.odometer = odometer;
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public int getCarTypeId() {
        return carTypeId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getRegistrationYear() {
        return registrationYear;
    }

    public int getRegistrationMonth() {
        return registrationMonth;
    }

    public int getOdometer() {
        return odometer;
    }

    // SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setCarTypeId(int carTypeId) {
        this.carTypeId = carTypeId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setRegistrationYear(int registrationYear) {
        this.registrationYear = registrationYear;
    }

    public void setRegistrationMonth(int registrationMonth) {
        this.registrationMonth = registrationMonth;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
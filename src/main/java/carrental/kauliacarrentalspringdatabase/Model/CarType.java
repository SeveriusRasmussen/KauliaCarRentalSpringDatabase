package carrental.kauliacarrentalspringdatabase.Model;


public class CarType {
    // Attributes
    private int id; // ID managed by the Database
    private String carType;
    private int ccm;
    private boolean autoOrManual; // True for automatic, false for manual
    private boolean cruiseControl;
    private boolean leatherSeats;
    private boolean airCondition;
    private int seats;
    private int horsePowers;

    // Constructor
    public CarType(String carType, int ccm, boolean autoOrManual, boolean cruiseControl, boolean leatherSeats, boolean airCondition, int seats, int horsePowers) {
        this.carType = carType;
        this.ccm = ccm;
        this.autoOrManual = autoOrManual;
        this.cruiseControl = cruiseControl;
        this.leatherSeats = leatherSeats;
        this.airCondition = airCondition;
        this.seats = seats;
        this.horsePowers = horsePowers;
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public String getCarType() {
        return carType;
    }

    public int getCcm() {
        return ccm;
    }

    public boolean isAutoOrManual() {
        return autoOrManual;
    }

    public boolean isCruiseControl() {
        return cruiseControl;
    }

    public boolean isLeatherSeats() {
        return leatherSeats;
    }

    public boolean isAirCondition() {
        return airCondition;
    }

    public int getSeats() {
        return seats;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setCcm(int ccm) {
        this.ccm = ccm;
    }

    public void setAutoOrManual(boolean autoOrManual) {
        this.autoOrManual = autoOrManual;
    }

    public void setCruiseControl(boolean cruiseControl) {
        this.cruiseControl = cruiseControl;
    }

    public void setLeatherSeats(boolean leatherSeats) {
        this.leatherSeats = leatherSeats;
    }

    public void setAirCondition(boolean airCondition) {
        this.airCondition = airCondition;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }
}

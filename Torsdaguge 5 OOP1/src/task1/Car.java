package task1;

public class Car {

    private final String make;
    private final String model;
    private final int year;
    private final String bodyStyle;
    private Driver driver;

    public Car(String make, String model, int year, String bodyStyle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
        this.driver = null;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Make: " + make + ". Model: " + model + " (" + year + "), BodyStyle: " + bodyStyle;
    }
}
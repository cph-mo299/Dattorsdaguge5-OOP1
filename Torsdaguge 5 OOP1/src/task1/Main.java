package task1;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver("Magnus", 19);
        Car car = new Car("Audi", "A5", 2015, "SUV");
        car.setDriver(driver);
        System.out.println(car + car.getDriver().toString());

        Car car2 = new Car("Jeep", "Ranger", 2018, "SUV");
        car2.setDriver(driver);
        System.out.println(car2 + car2.getDriver().toString());
    }
}
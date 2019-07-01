package solution;

import java.util.Random;

public class Car2 {

    private static final Random r = new Random();

    private static String brand = "Korch";
    private static int maxSpeed = 80;
    private static int minSpeed = 0;
    private static int engineNumber = r.nextInt();
    private static String driverName = "mrSpeedy";

    static String getBrand() {
        return brand;
    }

    static int getMaxSpeed() {
        return maxSpeed;
    }

    static int getMinSpeed() {
        return minSpeed;
    }

    static int getEngineNumber() {
        return engineNumber;
    }

    static String getDriverName() {
        return driverName;
    }

    static void setBrand(String brand) {
        Car2.brand = brand;
    }

    static void setMaxSpeed(int maxSpeed) {
        Car2.maxSpeed = maxSpeed;
    }

    static void setMinSpeed(int minSpeed) {
        Car2.minSpeed = minSpeed;
    }

    static void setEngineNumber(int engineNumber) {
        Car2.engineNumber = engineNumber;
    }

    static void setDriverName(String driverName) {
        Car2.driverName = driverName;
    }

    @Override
    public String toString() {
        return String.format("{brand: %s, maxSpeed: %d, minSpeed: %d, engineNumber: %d, driverName: %s}",
                brand,
                maxSpeed,
                minSpeed,
                engineNumber,
                driverName);
    }
}

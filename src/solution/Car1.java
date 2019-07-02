package solution;

import java.util.Random;

public class Car1 {

    private String brand;
    private int maxSpeed;
    private int minSpeed;
    private int engineNumber;
    private String driverName;

    /*
        private  static String brand = "Car1";
        private  static int maxSpeed = 380;
        private  static int minSpeed = 0;
        private  static int engineNumber = r.nextInt();
        private  static String driverName = "Trololoshkin";
    */

    String getBrand() {
        return brand;
    }

    int getMaxSpeed() {
        return maxSpeed;
    }

    int getMinSpeed() {
        return minSpeed;
    }

    int getEngineNumber() {
        return engineNumber;
    }

    String getDriverName() {
        return driverName;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setMinSpeed(int minSpeed) {
        this.minSpeed = minSpeed;
    }

    public void setEngineNumber(int engineNumber) {
        //final Random r = new Random();
        //this.engineNumber = r.nextInt();
        this.engineNumber = engineNumber;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String toString() {
        return String.format("{brand: %s, maxSpeed: %d, minSpeed: %d, engineNumber: %d, driverName: %s}",
                this.brand,
                this.maxSpeed,
                this.minSpeed,
                this.engineNumber,
                this.driverName);
    }
}

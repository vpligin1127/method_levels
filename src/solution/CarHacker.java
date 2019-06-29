package solution;

public  class CarHacker {

    // BEGIN (write your solution here)
    private CarHacker(){}

    public static final CarHacker INSTANCE = new CarHacker();


    public void mixer(){

        String tmpBrand = Car1.getBrand();
        Car1.setBrand(Car2.getBrand());
        Car2.setBrand(tmpBrand);

        int tmpMaxSpeed = Car1.getMaxSpeed();
        Car1.setMaxSpeed(Car2.getMaxSpeed());
        Car2.setMaxSpeed(tmpMaxSpeed);

        int tmpMinSpeed = Car1.getMinSpeed();
        Car1.setMinSpeed(Car2.getMinSpeed());
        Car2.setMinSpeed(tmpMinSpeed);

        int tmpEngineNumber = Car1.getEngineNumber();
        Car1.setEngineNumber(Car2.getEngineNumber());
        Car2.setEngineNumber(tmpEngineNumber);

        String tmpDriverName = Car1.getDriverName();
        Car1.setDriverName(Car2.getDriverName());
        Car2.setDriverName(tmpDriverName);



    }

    // END
}

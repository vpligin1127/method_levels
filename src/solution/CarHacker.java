package solution;

public  class CarHacker {

    public Car1 car1 = new Car1();
    public Car2 car2 = new Car2();

    // BEGIN (write your solution here)
    public void mixer(){

        String tmpBrand = car1.getBrand();
        Car1.setBrand(Car2.getBrand(car2));
        car2.setBrand(tmpBrand);

        Integer tmpMaxSpeed = Car1.getMaxSpeed();
        car1.setMaxSpeed(car2.getMaxSpeed());
        car2.setMaxSpeed(tmpMaxSpeed);

        Integer tmpMinSpeed = Car1.getMinSpeed();
        car1.setMinSpeed(car2.getMinSpeed());
        car2.setMinSpeed(tmpMinSpeed);

        Integer tmpEngineNumber = Car1.getEngineNumber();
        car1.setEngineNumber(car2.getEngineNumber());
        car2.setEngineNumber(tmpEngineNumber);

        String tmpDriverName = Car1.getDriverName();
        car1.setDriverName(Car2.getDriverName(car2));
        Car2.setDriverName(car2, tmpDriverName);



    }

    // END
}

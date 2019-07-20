package solution;

public  class CarHacker {

    //public Car1 car1 = new Car1();
    //public Car2 car2 = new Car2();

    // BEGIN (write your solution here)
    public void mixer(Car1 car1, Car2 car2){

        String tmpBrand = car1.getBrand();
        car1.setBrand(car2.getBrand());
        car2.setBrand(tmpBrand);

        int tmpMaxSpeed = car1.getMaxSpeed();
        car1.setMaxSpeed(car2.getMaxSpeed());
        car2.setMaxSpeed(tmpMaxSpeed);

        int tmpMinSpeed = car1.getMinSpeed();
        car1.setMinSpeed(car2.getMinSpeed());
        car2.setMinSpeed(tmpMinSpeed);

        int tmpEngineNumber = car1.getEngineNumber();
        car1.setEngineNumber(car2.getEngineNumber());
        car2.setEngineNumber(tmpEngineNumber);

        String tmpDriverName = car1.getDriverName();
        car1.setDriverName(car2.getDriverName());
        car2.setDriverName(tmpDriverName);



    }

    // END
}

package beginer;

import solution.*;
import java.util.Random;

        public class Main {

            public static void main(String[] args) {
                final Random r = new Random();

                CarHacker carHacker = new CarHacker();
                Car1 car1 = new Car1();
                Car2 car2 = new Car2();

                car1.setBrand("Volvo");
                car1.setMaxSpeed(200);
                car1.setMinSpeed(0);
                car1.setEngineNumber(r.nextInt());
                car1.setDriverName("Driver1");

                car2.setBrand("BMW");
                car2.setMaxSpeed(250);
                car2.setMinSpeed(3);
                car2.setEngineNumber(r.nextInt());
                car2.setDriverName("Driver2");

                printBefore(car1, car2);


                String temp1 = car1.toString();
                String temp2 = car2.toString();

                carHacker.mixer(car1, car2);

                if (!temp1.equals(car2.toString()) || !temp2.equals(car1.toString()))
                    throw new RuntimeException("\n ###Errors in transfer of fields (variables). Verify that the variables are received and assigned correctly.\n###");


                printAfter(car1, car2);

            }
            private static void printBefore(Car1 car1, Car2 car2){
                System.out.println("####Before hack####\n"
                        + "car1"
                        + car1.toString()
                        +"\n"
                        + "car2"
                        + car2.toString());
            }

            private static void printAfter(Car1 car1, Car2 car2){
                System.out.println("####After hack####\n"
                        + "car1"
                        + car1.toString()
                        +"\n"
                        + "car2"
                        + car2.toString());
            }
        }


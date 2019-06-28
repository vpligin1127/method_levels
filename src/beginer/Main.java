package beginer;

import solution.*;

        public class Main {

            public static void main(String[] args) {
                CarHacker carHacker = new CarHacker();
                Car1 car1 = new Car1();
                Car2 car2 = new Car2();

                printBefore(car1, car2);


                String temp1 = car1.toString();
                String temp2 = car2.toString();

                carHacker.mixer();

                if (!temp1.equals(car2.toString()) || !temp2.equals(car1.toString()))
                    throw new RuntimeException("\n ###Errors in the transfer of fields (variables). Verify that the variables are received and assigned correctly.\n###");


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


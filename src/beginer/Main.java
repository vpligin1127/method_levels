package beginer;

import solution.CarHacker;

        public class Main {

            public static void main(String[] args) {
                CarHacker carHacker = new CarHacker();
                printBefore(carHacker);


                String temp1 = carHacker.car1.toString();
                String temp2 = carHacker.car2.toString();

                carHacker.mixer();

                if (!temp1.equals(carHacker.car2.toString()) || !temp2.equals(carHacker.car1.toString()))
                    throw new RuntimeException("\n ###Errors in the transfer of fields (variables). Verify that the variables are received and assigned correctly.\n###");


                printAfter(carHacker);

            }
            private static void printBefore(CarHacker carHacker){
                System.out.println("####Before hack####\n"
                        + "car1"
                        + carHacker.car1.toString()
                        +"\n"
                        + "car2"
                        + carHacker.car2.toString());
            }

            private static void printAfter(CarHacker carHacker){
                System.out.println("####After hack####\n"
                        + "car1"
                        + carHacker.car1.toString()
                        +"\n"
                        + "car2"
                        + carHacker.car2.toString());
            }
        }


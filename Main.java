import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> ListRentVehicle = new ArrayList<>();


        boolean x = true;

        do {
            System.out.println("Vehicle Rental System");
            System.out.println();
            System.out.println("1- Rent a Car");
            System.out.println("2- Rent a Bike");
            System.out.println("3- Rent a Truck");
            System.out.println("4- view Rented Vehicles");
            System.out.println("5- Exit");

            System.out.println("Enter your choice");
            Scanner choice = new Scanner(System.in);

            switch (choice.nextInt()) {
                case 1:
                  RentACar(ListRentVehicle);
                    System.out.println();

                    break;
                case 2:
                 RentABike(ListRentVehicle);
                    System.out.println();
                    break;
                case 3:
                    RentATruck(ListRentVehicle);
                    System.out.println("Truck");
                    System.out.println();
                    break;
                case 4:
                    for (Vehicle v : ListRentVehicle) {
                        v.dispalyDelails();
                        System.out.println("----------");

                    }

                    break;
                case 5:
                    x = false;
                    break;
            }


        } while (x);


    }

    public static void RentACar(ArrayList<Vehicle> ListRentVehicle) {
        Scanner carModel = new Scanner(System.in);
        Car c1 = new Car();
        System.out.println("Enter Car Model");
        String model = carModel.nextLine();
        c1.setModel(model);

        System.out.println("Enter Rental Days");
        int Days= carModel.nextInt();
        c1.setDays(Days);

        System.out.println();
        c1.dispalyDelails();

        ListRentVehicle.add(c1);



    }
    public static void RentABike(ArrayList<Vehicle> ListRentVehicle) {
        Scanner BikeModel = new Scanner(System.in);
        Bike bike = new Bike();

        System.out.println("Enter Bike Brand");
        String model = BikeModel.nextLine();
        bike .setBrand(model);

        System.out.println("Enter Rental Hours");
        int Hours= BikeModel.nextInt();
        bike .setHour(Hours);

        System.out.println();
        bike .dispalyDelails();

    ListRentVehicle.add(bike);


    }

    public static void RentATruck(ArrayList<Vehicle> ListRentVehicle) {
        Scanner sc = new Scanner(System.in);
        Truck truck = new Truck();

        System.out.println("Enter Truck Type");
        String type =  sc.nextLine();
        truck.setType(type);

        System.out.println("Enter Rental Weeks");
        int weeks= sc.nextInt();
        truck.setWeek(weeks);

        System.out.println();
        truck.dispalyDelails();

        ListRentVehicle.add(truck);

    }

}
package softwareApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Vehicle> vehicles = new ArrayList<>();

    public static void main(String[] args) {
        initializeVehicles();  // Initialize with predefined vehicles

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("====== Cars, Motorcycles and Trucks Rental Agency ======");
            System.out.println("Select an option:");
            System.out.println("1. Add a new Car");
            System.out.println("2. Add a new Motorcycle");
            System.out.println("3. Add a new Truck");
            System.out.println("4. Display all Vehicles");
            System.out.println("5. Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addCar(scanner);
                    break;
                case 2:
                    addMotorcycle(scanner);
                    break;
                case 3:
                    addTruck(scanner);
                    break;
                case 4:
                    displayAllVehicles();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void initializeVehicles() {
        Car elantra = new Car();
        elantra.setMake("Hyundai");
        elantra.setModel("Elantra SE");
        elantra.setYear(2023);
        elantra.setDoorNumbers(2);
        elantra.setFuelType("Gasoline");
        vehicles.add(elantra);

        Car xc90 = new Car();
        xc90.setMake("Volvo");
        xc90.setModel("XC90 Turbo");
        xc90.setYear(2018);
        xc90.setDoorNumbers(4);
        xc90.setFuelType("Hybrid");
        vehicles.add(xc90);

        Motorcycle sportster = new Motorcycle();
        sportster.setMake("Harley Davidson");
        sportster.setModel("Sportster S");
        sportster.setYear(2024);
        sportster.setWheelsNumbers(2);
        sportster.setMotorcycleType("Sport");
        vehicles.add(sportster);

        Truck sierra = new Truck();
        sierra.setMake("GMC");
        sierra.setModel("Sierra 2500 HD");
        sierra.setYear(2022);
        sierra.setCargoCapacity(1.0);
        sierra.setTransmissionType("Automatic");
        vehicles.add(sierra);
    }

    private static void addCar(Scanner scanner) {
        Car car = new Car();
        System.out.print("Enter make: ");
        car.setMake(scanner.nextLine());
        System.out.print("Enter model: ");
        car.setModel(scanner.nextLine());
        System.out.print("Enter year: ");
        car.setYear(scanner.nextInt());
        System.out.print("Enter number of doors: ");
        car.setDoorNumbers(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter fuel type: ");
        car.setFuelType(scanner.nextLine());

        vehicles.add(car);
        System.out.println("Car added successfully!");
    }

    private static void addMotorcycle(Scanner scanner) {
        Motorcycle motorcycle = new Motorcycle();
        System.out.print("Enter make: ");
        motorcycle.setMake(scanner.nextLine());
        System.out.print("Enter model: ");
        motorcycle.setModel(scanner.nextLine());
        System.out.print("Enter year: ");
        motorcycle.setYear(scanner.nextInt());
        System.out.print("Enter number of wheels: ");
        motorcycle.setWheelsNumbers(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter motorcycle type: ");
        motorcycle.setMotorcycleType(scanner.nextLine());

        vehicles.add(motorcycle);
        System.out.println("Motorcycle added successfully!");
    }

    private static void addTruck(Scanner scanner) {
        Truck truck = new Truck();
        System.out.print("Enter make: ");
        truck.setMake(scanner.nextLine());
        System.out.print("Enter model: ");
        truck.setModel(scanner.nextLine());
        System.out.print("Enter year: ");
        truck.setYear(scanner.nextInt());
        System.out.print("Enter cargo capacity (in tons): ");
        truck.setCargoCapacity(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Enter transmission type: ");
        truck.setTransmissionType(scanner.nextLine());

        vehicles.add(truck);
        System.out.println("Truck added successfully!");
    }

    private static void displayAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available.");
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println("Make: " + vehicle.getMake());
                System.out.println("Model: " + vehicle.getModel());
                System.out.println("Year: " + vehicle.getYear());

                if (vehicle instanceof Car) {
                    Car car = (Car) vehicle;
                    System.out.println("Number of Doors: " + car.getDoorNumbers());
                    System.out.println("Fuel Type: " + car.getFuelType());
                } else if (vehicle instanceof Motorcycle) {
                    Motorcycle motorcycle = (Motorcycle) vehicle;
                    System.out.println("Number of Wheels: " + motorcycle.getWheelsNumbers());
                    System.out.println("Motorcycle Type: " + motorcycle.getMotorcycleType());
                } else if (vehicle instanceof Truck) {
                    Truck truck = (Truck) vehicle;
                    System.out.println("Cargo Capacity: " + truck.getCargoCapacity() + " ton(s)");
                    System.out.println("Transmission Type: " + truck.getTransmissionType());
                }
                System.out.println();
            }
        }
    }
}

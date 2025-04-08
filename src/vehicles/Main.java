package vehicles;

import java.awt.Color;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    static List<Motorcycle> motorcycles = new ArrayList<>();
    static List<Car> cars = new ArrayList<>();
    static List<Truck> trucks = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        loadData();

        int choice;
        do {
            System.out.println("\n====== VEHICLE MANAGEMENT SYSTEM ======");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Delete Vehicle");
            System.out.println("3. Modify Vehicle");
            System.out.println("4. Search Vehicle");
            System.out.println("5. Print All");
            System.out.println("6. Exit and Save");
            System.out.print("Choose option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addVehicle();
                case 2 -> deleteVehicle();
                case 3 -> modifyVehicle();
                case 4 -> searchVehicle();
                case 5 -> printAll();
                case 6 -> saveData();
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }

    // ======================== ADD ===========================
    private static void addVehicle() {
        System.out.println("1. Motorcycle\n2. Car\n3. Truck");
        int type = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        System.out.print("Manufacture Company: ");
        String company = scanner.nextLine();

        System.out.print("Manufacture Date (yyyy-MM-dd): ");
        Date date = parseDate(scanner.nextLine());

        System.out.print("Model: ");
        String model = scanner.nextLine();

        Engine engine = buildEngine();

        System.out.print("Plate Number: ");
        int plate = scanner.nextInt();

        System.out.print("Gear Type (1. NORMAL, 2. AUTOMATIC): ");
        GearType gear = scanner.nextInt() == 1 ? GearType.NORMAL : GearType.AUTOMATIC;

        System.out.print("Body Serial Number: ");
        int serial = scanner.nextInt();

        switch (type) {
            case 1 -> {
                System.out.print("Tier Diameter: ");
                double tierDiameter = scanner.nextDouble();

                System.out.print("Length: ");
                double length = scanner.nextDouble();

                motorcycles.add(new Motorcycle(company, date, model, engine, plate, gear, serial, tierDiameter, length));
            }
            case 2 -> {
                System.out.print("Length: ");
                int length = scanner.nextInt();

                System.out.print("Width: ");
                int width = scanner.nextInt();

                Color color = Color.BLUE; // default color for now

                System.out.print("Chair Number: ");
                int chairs = scanner.nextInt();

                System.out.print("Is Furniture Leather? (true/false): ");
                boolean leather = scanner.nextBoolean();

                cars.add(new Car(company, date, model, engine, plate, gear, serial, length, width, color, chairs, leather));
            }
            case 3 -> {
                System.out.print("Length: ");
                int length = scanner.nextInt();

                System.out.print("Width: ");
                int width = scanner.nextInt();

                Color color = Color.GRAY; // default color

                System.out.print("Free Weight: ");
                double freeWeight = scanner.nextDouble();

                System.out.print("Full Weight: ");
                double fullWeight = scanner.nextDouble();

                trucks.add(new Truck(company, date, model, engine, plate, gear, serial, length, width, color, freeWeight, fullWeight));
            }
        }
    }

    private static Engine buildEngine() {
        scanner.nextLine();
        System.out.print("Engine Manufacture: ");
        String engMan = scanner.nextLine();

        System.out.print("Engine Date (yyyy-MM-dd): ");
        Date engDate = parseDate(scanner.nextLine());

        System.out.print("Engine Model: ");
        String engModel = scanner.nextLine();

        System.out.print("Capacity: ");
        int cap = scanner.nextInt();

        System.out.print("Cylinders: ");
        int cyl = scanner.nextInt();

        System.out.print("Fuel Type (1. DIESEL, 2. GASOLINE): ");
        FuelType fuel = scanner.nextInt() == 1 ? FuelType.DIESEL : FuelType.GASOLINE;

        return new Engine(engMan, engDate, engModel, cap, cyl, fuel);
    }

    // ======================== DELETE ===========================
    private static void deleteVehicle() {
        System.out.print("Enter Plate Number to Delete: ");
        int plate = scanner.nextInt();
        if (removeFromList(plate, motorcycles)) return;
        if (removeFromList(plate, cars)) return;
        if (removeFromList(plate, trucks)) return;
        System.out.println("Not found.");
    }

    private static <T extends Automobile> boolean removeFromList(int plate, List<T> list) {
        return list.removeIf(v -> v.getPlateNum() == plate);
    }

    // ======================== MODIFY ===========================
    private static void modifyVehicle() {
        System.out.print("Enter Plate Number to Modify: ");
        int plate = scanner.nextInt();

        for (Motorcycle m : motorcycles)
            if (m.getPlateNum() == plate) {
                System.out.print("New Body Serial Num: ");
                m.setBodySerialNum(scanner.nextInt());
                return;
            }

        for (Car c : cars)
            if (c.getPlateNum() == plate) {
                System.out.print("New Body Serial Num: ");
                c.setBodySerialNum(scanner.nextInt());
                return;
            }

        for (Truck t : trucks)
            if (t.getPlateNum() == plate) {
                System.out.print("New Body Serial Num: ");
                t.setBodySerialNum(scanner.nextInt());
                return;
            }

        System.out.println("Not found.");
    }

    // ======================== SEARCH ===========================
    private static void searchVehicle() {
        System.out.println("1. By Company\n2. By Date\n3. By Plate Number");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1 -> {
                System.out.print("Enter company name: ");
                String name = scanner.nextLine();
                searchAll(v -> v.getManufactureCompany().equalsIgnoreCase(name));
            }
            case 2 -> {
                System.out.print("Enter date (yyyy-MM-dd): ");
                Date d = parseDate(scanner.nextLine());
                searchAll(v -> v.getManufactureDate().equals(d));
            }
            case 3 -> {
                System.out.print("Enter plate number: ");
                int p = scanner.nextInt();
                searchAll(v -> v.getPlateNum() == p);
            }
        }
    }

    private static void searchAll(java.util.function.Predicate<Automobile> cond) {
        motorcycles.stream().filter(cond).forEach(System.out::println);
        cars.stream().filter(cond).forEach(System.out::println);
        trucks.stream().filter(cond).forEach(System.out::println);
    }

    // ======================== PRINT ===========================
    private static void printAll() {
        System.out.println("\n--- MOTORCYCLES ---");
        motorcycles.forEach(System.out::println);

        System.out.println("\n--- CARS ---");
        cars.forEach(System.out::println);

        System.out.println("\n--- TRUCKS ---");
        trucks.forEach(System.out::println);
    }

    // ======================== SAVE & LOAD ===========================
    private static void saveData() {
        saveList("motorcycles.dat", motorcycles);
        saveList("cars.dat", cars);
        saveList("trucks.dat", trucks);
        System.out.println("Data saved.");
    }

    private static void loadData() {
        motorcycles = loadList("motorcycles.dat");
        cars = loadList("cars.dat");
        trucks = loadList("trucks.dat");
    }

    private static <T> void saveList(String filename, List<T> list) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(list);
        } catch (Exception e) {
            System.out.println("Could not save " + filename);
        }
    }

    @SuppressWarnings("unchecked")
	private static <T> List<T> loadList(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (List<T>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    private static Date parseDate(String input) {
        try {
            return dateFormat.parse(input);
        } catch (Exception e) {
            return new Date();
        }
    }
}

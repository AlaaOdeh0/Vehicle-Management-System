## 🚗 Vehicle Management System

This is a Java OOP (Object-Oriented Programming) project built using Eclipse. It manages different types of vehicles including Cars, Trucks, and Motorcycles.

The application demonstrates:
  * Use of inheritance, encapsulation, and enum types
  * Serializable object storage and file handling
  * Console-based UI for managing vehicle records


## 📁 Project Structure
vehicles/
├── Car.java
├── Truck.java
├── Motorcycle.java
├── Vehicle.java
├── Automobile.java
├── Engine.java
├── FuelType.java
├── GearType.java
└── Main.java


## 💻 Features
  * Add, modify, delete vehicles
  * Search by:
    - Manufacture Company
    - Manufacture Date
    - Plate Number
  * View individual vehicle details
  * Save data to file on exit and load on start
  * Separate lists for Cars, Trucks, Motorcycles
  * Access and update body_serial_num from inherited classes


## 🛠 Technologies
  - Java 11+
  - Eclipse IDE
  - File I/O with serialization
  - Java Date, Scanner, and ArrayList


## ▶️ How to Run
  1. Open project in Eclipse
  2. Run Main.java
  3. Use the console menu:
   ====== VEHICLE MANAGEMENT SYSTEM ======
      1. Add Vehicle
      2. Delete Vehicle
      3. Modify Vehicle
      4. Search Vehicle
      5. Print All
      6. Exit and Save


## 📂 Data Storage
  * Vehicle data is saved to files using Java serialization:
    - cars.dat
    - trucks.dat
    - motorcycles.dat
  * Files are auto-loaded when the app starts


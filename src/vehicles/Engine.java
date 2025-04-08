package vehicles;
import java.io.Serializable;

import java.util.Date;

public class Engine implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String manufacture;
    private Date manufactureDate;
    private String model;
    private int capacity;
    private int cylinders;
    private FuelType fuelType;

    public Engine() {}

    public Engine(String manufacture, Date manufactureDate, String model, int capacity, int cylinders, FuelType fuelType) {
        this.manufacture = manufacture;
        this.manufactureDate = manufactureDate;
        this.model = model;
        this.capacity = capacity;
        this.cylinders = cylinders;
        this.fuelType = fuelType;
    }

    // Getters and setters
    public String getManufacture() { return manufacture; }
    public void setManufacture(String manufacture) { this.manufacture = manufacture; }

    public Date getManufactureDate() { return manufactureDate; }
    public void setManufactureDate(Date manufactureDate) { this.manufactureDate = manufactureDate; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public int getCylinders() { return cylinders; }
    public void setCylinders(int cylinders) { this.cylinders = cylinders; }

    public FuelType getFuelType() { return fuelType; }
    public void setFuelType(FuelType fuelType) { this.fuelType = fuelType; }

    @Override
    public String toString() {
        return "Engine [manufacture=" + manufacture + ", manufactureDate=" + manufactureDate + ", model=" + model +
                ", capacity=" + capacity + ", cylinders=" + cylinders + ", fuelType=" + fuelType + "]";
    }
}

package vehicles;
import java.io.Serializable;

import java.awt.Color;
import java.util.Date;

public class Truck extends Vehicle implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double freeWeight;
    private double fullWeight;

    public Truck() {}

    public Truck(String manufactureCompany, Date manufactureDate, String model, Engine engine,
                 int plateNum, GearType gearType, int bodySerialNum,
                 int length, int width, Color color,
                 double freeWeight, double fullWeight) {
        super(manufactureCompany, manufactureDate, model, engine, plateNum, gearType, bodySerialNum, length, width, color);
        this.freeWeight = freeWeight;
        this.fullWeight = fullWeight;
    }

    public double getFreeWeight() { return freeWeight; }
    public void setFreeWeight(double freeWeight) { this.freeWeight = freeWeight; }

    public double getFullWeight() { return fullWeight; }
    public void setFullWeight(double fullWeight) { this.fullWeight = fullWeight; }

    @Override
    public String toString() {
        return "Truck [" + super.toString() +
               ", freeWeight=" + freeWeight + ", fullWeight=" + fullWeight + "]";
    }
}

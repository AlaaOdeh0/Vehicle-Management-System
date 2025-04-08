package vehicles;
import java.io.Serializable;

public class Motorcycle extends Automobile implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double tierDiameter;
    private double length;

    public Motorcycle() {}

    public Motorcycle(String manufactureCompany, java.util.Date manufactureDate, String model, Engine engine,
                      int plateNum, GearType gearType, int bodySerialNum, double tierDiameter, double length) {
        super(manufactureCompany, manufactureDate, model, engine, plateNum, gearType, bodySerialNum);
        this.tierDiameter = tierDiameter;
        this.length = length;
    }

    public double getTierDiameter() { return tierDiameter; }
    public void setTierDiameter(double tierDiameter) { this.tierDiameter = tierDiameter; }

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    @Override
    public String toString() {
        return "Motorcycle [" + super.toString() +
               ", tierDiameter=" + tierDiameter + ", length=" + length + "]";
    }
}

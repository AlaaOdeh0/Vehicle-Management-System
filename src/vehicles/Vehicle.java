package vehicles;
import java.io.Serializable;

import java.awt.Color;

public class Vehicle extends Automobile implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int length;
    private int width;
    private Color color;

    public Vehicle() {}

    public Vehicle(String manufactureCompany, java.util.Date manufactureDate, String model, Engine engine,
                   int plateNum, GearType gearType, int bodySerialNum,
                   int length, int width, Color color) {
        super(manufactureCompany, manufactureDate, model, engine, plateNum, gearType, bodySerialNum);
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public int getLength() { return length; }
    public void setLength(int length) { this.length = length; }

    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }

    public Color getColor() { return color; }
    public void setColor(Color color) { this.color = color; }

    @Override
    public String toString() {
        return "Vehicle [" + super.toString() +
               ", length=" + length + ", width=" + width + ", color=" + color + "]";
    }
}

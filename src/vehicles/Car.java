package vehicles;
import java.io.Serializable;

import java.awt.Color;
import java.util.Date;

public class Car extends Vehicle implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int chairNum;
    private boolean isFurnitureLeather;

    public Car() {}

    public Car(String manufactureCompany, Date manufactureDate, String model, Engine engine,
               int plateNum, GearType gearType, int bodySerialNum,
               int length, int width, Color color,
               int chairNum, boolean isFurnitureLeather) {
        super(manufactureCompany, manufactureDate, model, engine, plateNum, gearType, bodySerialNum, length, width, color);
        this.chairNum = chairNum;
        this.isFurnitureLeather = isFurnitureLeather;
    }

    public int getChairNum() { return chairNum; }
    public void setChairNum(int chairNum) { this.chairNum = chairNum; }

    public boolean isFurnitureLeather() { return isFurnitureLeather; }
    public void setFurnitureLeather(boolean furnitureLeather) { isFurnitureLeather = furnitureLeather; }

    @Override
    public String toString() {
        return "Car [" + super.toString() +
               ", chairNum=" + chairNum + ", isFurnitureLeather=" + isFurnitureLeather + "]";
    }
}

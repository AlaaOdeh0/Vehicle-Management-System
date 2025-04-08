package vehicles;
import java.io.Serializable;

import java.util.Date;

public class Automobile implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String manufactureCompany;
    private Date manufactureDate;
    private String model;
    private Engine engine;
    private int plateNum;
    private GearType gearType;
    private int bodySerialNum;

    public Automobile() {}

    public Automobile(String manufactureCompany, Date manufactureDate, String model, Engine engine,
                      int plateNum, GearType gearType, int bodySerialNum) {
        this.manufactureCompany = manufactureCompany;
        this.manufactureDate = manufactureDate;
        this.model = model;
        this.engine = engine;
        this.plateNum = plateNum;
        this.gearType = gearType;
        this.bodySerialNum = bodySerialNum;
    }

    // Getters and Setters
    public String getManufactureCompany() { return manufactureCompany; }
    public void setManufactureCompany(String manufactureCompany) { this.manufactureCompany = manufactureCompany; }

    public Date getManufactureDate() { return manufactureDate; }
    public void setManufactureDate(Date manufactureDate) { this.manufactureDate = manufactureDate; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public Engine getEngine() { return engine; }
    public void setEngine(Engine engine) { this.engine = engine; }

    public int getPlateNum() { return plateNum; }
    public void setPlateNum(int plateNum) { this.plateNum = plateNum; }

    public GearType getGearType() { return gearType; }
    public void setGearType(GearType gearType) { this.gearType = gearType; }

    public int getBodySerialNum() { return bodySerialNum; }
    public void setBodySerialNum(int bodySerialNum) { this.bodySerialNum = bodySerialNum; }

    @Override
    public String toString() {
        return "Automobile [manufactureCompany=" + manufactureCompany + ", manufactureDate=" + manufactureDate +
                ", model=" + model + ", engine=" + engine + ", plateNum=" + plateNum +
                ", gearType=" + gearType + ", bodySerialNum=" + bodySerialNum + "]";
    }
}

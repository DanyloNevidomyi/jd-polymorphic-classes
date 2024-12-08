package learning.java;

public class CoolingAppliance extends Appliance {
    private double coolingCapacity; // Потужність охолодження в кВт

    public CoolingAppliance(double voltage, double power, double coolingCapacity) {
        super(voltage, power);
        this.coolingCapacity = coolingCapacity;
    }

    public double getCoolingCapacity() {
        return coolingCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Потужність охолодження: " + coolingCapacity + " кВт";
    }
}
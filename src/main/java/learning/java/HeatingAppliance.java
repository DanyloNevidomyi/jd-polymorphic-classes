package learning.java;

public class HeatingAppliance extends Appliance {
    private double heatingCapacity; // Потужність нагріву в кВт

    public HeatingAppliance(double voltage, double power, double heatingCapacity) {
        super(voltage, power);
        this.heatingCapacity = heatingCapacity;
    }

    public double getHeatingCapacity() {
        return heatingCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Потужність нагріву: " + heatingCapacity + " кВт";
    }
}
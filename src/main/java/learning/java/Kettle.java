package learning.java;

public class Kettle extends HeatingAppliance {
    private double volume; // Об'єм у літрах

    public Kettle(double voltage, double power, double heatingCapacity, double volume) {
        super(voltage, power, heatingCapacity);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Чайник [" + super.toString() + ", Об'єм: " + volume + " л]";
    }
}
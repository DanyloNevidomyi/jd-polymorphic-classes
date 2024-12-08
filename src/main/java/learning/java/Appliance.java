package learning.java;

public class Appliance {
    private double voltage; // Вольтаж
    private double power;   // Споживана потужність у Вт

    public Appliance(double voltage, double power) {
        this.voltage = voltage;
        this.power = power;
    }

    public double getVoltage() {
        return voltage;
    }

    public double getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Напруга: " + voltage + " В, Потужність: " + power + " Вт";
    }
}

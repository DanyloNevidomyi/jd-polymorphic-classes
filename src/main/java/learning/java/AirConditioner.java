package learning.java;

public class AirConditioner extends CoolingAppliance {
    private String mode; // Режим роботи (наприклад, "Холод" або "Тепло")

    public AirConditioner(double voltage, double power, double coolingCapacity, String mode) {
        super(voltage, power, coolingCapacity);
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }

    @Override
    public String toString() {
        return "Кондиціонер [" + super.toString() + ", Режим: " + mode + "]";
    }
}
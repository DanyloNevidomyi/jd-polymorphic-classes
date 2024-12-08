package learning.java;

public class Heater extends HeatingAppliance {
    private String type; // Тип обігрівача (наприклад, "Масляний", "Кварцовий")

    public Heater(double voltage, double power, double heatingCapacity, String type) {
        super(voltage, power, heatingCapacity);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Обігрівач [" + super.toString() + ", Тип: " + type + "]";
    }
}
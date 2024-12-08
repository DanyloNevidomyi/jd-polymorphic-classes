package learning.java;

public class ApplianceApp {
    public static void main(String[] args) {
        Appliance kettle = new Kettle(220, 1500, 1.5, 1.7);
        Appliance airConditioner = new AirConditioner(220, 2000, 2.5, "Холод");
        Appliance heater = new Heater(220, 2500, 2.0, "Масляний");

        System.out.println(kettle);
        System.out.println(airConditioner);
        System.out.println(heater);
    }
}

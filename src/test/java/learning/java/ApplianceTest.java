package learning.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplianceTest {
    @Test
    void testKettle() {
        Kettle kettle = new Kettle(220, 1500, 1.5, 1.7);
        assertEquals(220, kettle.getVoltage());
        assertEquals(1.7, kettle.getVolume());
    }

    @Test
    void testAirConditioner() {
        AirConditioner airConditioner = new AirConditioner(220, 2000, 2.5, "Холод");
        assertEquals("Холод", airConditioner.getMode());
    }

    @Test
    void testHeater() {
        Heater heater = new Heater(220, 2500, 2.0, "Масляний");
        assertEquals("Масляний", heater.getType());
    }
}
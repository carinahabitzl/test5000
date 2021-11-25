import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMITest {
    BMI bmi1;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        bmi1 = new BMI("Carina", "Habitzl", 164, 50, 'W');
    }

    @org.junit.jupiter.api.Test
    void calculateBMI() {
        assertEquals(18.59, bmi1.calculateBMI());
    }

    @org.junit.jupiter.api.Test
    void calculateBMICategory() {
        assertAll(
                ()->assertEquals(0, bmi1.calculateBMICategory()),
                ()->assertEquals(2, new BMI("Max", "Mustermann",
                        190, 300, 'M').calculateBMICategory())
        );
    }

    @Test
    void getBMICategoryName() {
    }
    @Test
    void testkon(){

    }
}
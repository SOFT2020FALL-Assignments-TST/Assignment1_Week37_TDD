package converter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConverterTest {
    @Test
    public void testConverterNotNull(){
        Converter c = new Converter();
        assertNotNull(c);
    }

    @Test
    public void testCelsiusToFahrenheit(){
        Converter c = new Converter();
        double actual = c.toFahrenheit(25);
        double expected = 77.0;
        assertEquals(expected, actual);
    }

    @Test
    public void testFahrenheitToCelsius(){
        Converter c = new Converter();
        double actual = c.toCelsius(77.0);
        double expected = 25.0;
        assertEquals(expected, actual);
    }
}

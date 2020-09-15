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
    public void testNumber1(){
        Converter c = new Converter();
        String actual = c.convertToNumeral(1);
        String expected = "I";
        assertEquals(expected, actual);
    }

    @Test
    public void testNumber4(){
        Converter c = new Converter();
        String actual = c.convertToNumeral(4);
        String expected = "IV";
        assertEquals(expected, actual);
    }

    @Test
    public void testNumber5(){
        Converter c = new Converter();
        String actual = c.convertToNumeral(5);
        String expected = "V";
        assertEquals(expected, actual);
    }

    @Test
    public void testNumber6(){
        Converter c = new Converter();
        String actual = c.convertToNumeral(6);
        String expected = "VI";
        assertEquals(expected, actual);
    }

    @Test
    public void testNumber10(){
        Converter c = new Converter();
        String actual = c.convertToNumeral(10);
        String expected = "X";
        assertEquals(expected, actual);
    }

    @Test
    public void testNumber50(){
        Converter c = new Converter();
        String actual = c.convertToNumeral(50);
        String expected = "L";
        assertEquals(expected, actual);
    }

    @Test
    public void testNumber100(){
        Converter c = new Converter();
        String actual = c.convertToNumeral(100);
        String expected = "C";
        assertEquals(expected, actual);
    }

    @Test
    public void testNumber500(){
        Converter c = new Converter();
        String actual = c.convertToNumeral(500);
        String expected = "D";
        assertEquals(expected, actual);
    }

    @Test
    public void testNumber1000(){
        Converter c = new Converter();
        String actual = c.convertToNumeral(1000);
        String expected = "M";
        assertEquals(expected, actual);
    }
}

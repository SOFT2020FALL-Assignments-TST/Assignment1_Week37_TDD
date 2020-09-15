package converter;

public class Converter {
    public double toFahrenheit(int i) {
        return (i * 1.8) + 32;
    }

    public double toCelsius(double v) {
        return (v - 32) / 1.8;
    }
}

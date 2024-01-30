package p3;

public class Temperature {
    private double value;
    private char scale;

    public Temperature() {
        this.value = 0.0;
        this.scale = 'C';
    }

    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.value = 0.0;
        this.scale = scale;
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public double getValue() {
        return this.value;
    }

    public char getScale() {
        return this.scale;
    }

    public double getCelsius() {
        if (scale == 'F') {
            return (this.value - 32) * 5 / 9;
        } else {
            return this.value;
        }
    }

    public double getFahrenheit() {
        if (scale == 'C') {
            return (this.value * 9 / 5) + 32;
        } else {
            return this.value;
        }
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public char getTemperatureScale() {
        return this.scale;
    }
}
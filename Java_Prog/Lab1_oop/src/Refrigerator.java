public class Refrigerator extends ElectricalDevice {

    private double _temperature;

    public Refrigerator(String name, double power, double temperature) {
        super(name, power); // Вызываем конструктор родительского класса
        this._temperature = temperature;
    }

    public double getTemperature() {
        return _temperature;
    }

    public void setTemperature(double temperature) {
        this._temperature = temperature;
    }
}

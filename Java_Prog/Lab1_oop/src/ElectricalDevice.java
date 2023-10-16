public class ElectricalDevice {
    // propertys for eny of devices
    private String _name;
    private double _power;
    private boolean _isOn;

    public ElectricalDevice(String name, double power) {

        this._name = name;
        this._power = power;
        this._isOn = false;// By defolt devices offed
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public double getPower() {
        return _power;
    }

    public void setPower(double power) {
        this._power = power;
    }

    public boolean isOn() {
        return _isOn;
    }

    // Turn on or turn of methods
    public void turnOn() {
        _isOn = true;
    }

    public void turnOff() {
        _isOn = false;
    }

    // get current power
    public double getCurrentPowerConsumption() {
        return _isOn ? _power : 0; // If the device is turned on, we return its power. If disabled, return 0.
    }

    @Override
    public String toString() {
        return "ElectricalDevice{" +
                "name='" + _name + '\'' +
                ", power=" + _power +
                ", isOn=" + _isOn +
                '}';
    }
}

public class TV extends ElectricalDevice {

    private double _volume;

    public TV(String name, double power, double volume) {
        super(name, power);
        this._volume = volume;
    }

    public double getVolume() {
        return _volume;
    }

    public void setVolume(double volume) {
        if (volume < 0) {
            this._volume = 0;
        } else if (volume > 100) {
            this._volume = 100;
        } else {
            this._volume = volume;
        }
    }
}
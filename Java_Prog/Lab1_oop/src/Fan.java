public class Fan extends ElectricalDevice {
    private boolean _rotation;
    private int _speed;

    public Fan(String name, double power, boolean rotation, int speed) {
        super(name, power);
        this._rotation = rotation;
        this._speed = speed;
    }

    public boolean getRotation() {
        return _rotation;
    }

    public void setRotation(boolean rotation) {
        this._rotation = rotation;
    }

    public int getSpeed() {
        return _speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 0) {
            this._speed = 0;
        } else if (speed > 4) {
            this._speed = 4;
        } else {
            this._speed = speed;
        }
    }
}

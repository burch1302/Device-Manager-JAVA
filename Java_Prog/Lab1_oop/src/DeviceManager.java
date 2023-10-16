import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DeviceManager {
    private ArrayList<ElectricalDevice> _devices;// device storage list

    public DeviceManager() {
        _devices = new ArrayList<>();
    }

    // Add device to list
    public void addDevice(ElectricalDevice device) {
        _devices.add(device);
    }

    // Remove device from list
    public void removeDevice(ElectricalDevice device) {
        boolean wasRemoved = _devices.remove(device);

        if (!wasRemoved) {
            throw new IllegalArgumentException("There is no such device on this list.");
        }
    }

    // Turn ON device
    public void turnOnDevice(ElectricalDevice device) {
        device.turnOn();
    }

    // Turn OFF device
    public void turnOffDevice(ElectricalDevice device) {
        device.turnOff();
    }

    // Calculation of total power consumption
    public double getTotalPowerConsumption() {
        double totalPower = 0;
        for (ElectricalDevice device : _devices) {
            if (device.isOn()) {
                totalPower += device.getPower();
            }
        }
        return totalPower;
    }

    // Sort by power
    public void sortDevicesByPower() {
        _devices.sort(Comparator.comparing(ElectricalDevice::getPower));
    }

    // Displaying a list of devices
    public void displayDevices() {
        for (ElectricalDevice device : _devices) {
            System.out.println(device);
        }
    }

    // search by params (тут я использую перегрузку)
    // Search by name
    public List<ElectricalDevice> search(String name) {
        return _devices.stream()
                .filter(device -> device.getName().contains(name))
                .collect(Collectors.toList());
    }

    // Search devices by power range
    public List<ElectricalDevice> search(double minPower, double maxPower) {
        return _devices.stream()
                .filter(device -> device.getPower() >= minPower && device.getPower() <= maxPower)
                .collect(Collectors.toList());
    }
}

import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        DeviceManager manager = new DeviceManager();

        ElectricalDevice refrigerator = new Refrigerator("Samsung Fridge", 200, -5);
        ElectricalDevice tv = new TV("Sony Bravia", 150, 50);
        ElectricalDevice fan = new Fan("Bajaj Fan", 50, true, 3);

        // ad devices to manager list ()
        manager.addDevice(refrigerator);
        manager.addDevice(tv);
        manager.addDevice(fan);

        // turn on devices
        manager.turnOnDevice(refrigerator);
        manager.turnOnDevice(tv);

        // total power consumption
        System.out.println("Total Power Consumption: " + manager.getTotalPowerConsumption() + "W");

        // search by power
        List<ElectricalDevice> devicesInRange = manager.search(100, 250);
        System.out.println("Devices in power range (100-250W):");
        for (ElectricalDevice device : devicesInRange) {
            System.out.println(device);
        }

        // Sorting by power
        manager.sortDevicesByPower();
        System.out.println("\nDevices sorted by power:");
        manager.displayDevices();
    }
}

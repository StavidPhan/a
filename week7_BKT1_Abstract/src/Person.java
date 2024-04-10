import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList;

    /**
     * Constructor 1.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        vehicleList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * add vehicle to list.
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * remove vehicle from list.
     */
    public void removeVehicle(String registrationNumber) {
        for (Vehicle vehicle : vehicleList) {
            if (Objects.equals(vehicle.getRegistrationNumber(), registrationNumber)) {
                vehicleList.remove(vehicle);
                break;
            }
        }
    }

    /**
     * getVehiclesInfo.
     */
    public String getVehiclesInfo() {
        StringBuilder vehicleInfo = new StringBuilder();
        vehicleInfo.append(String.format("%s has", name));

        if (vehicleList.isEmpty()) {
            vehicleInfo.append(" no vehicle!");
            return vehicleInfo.toString();
        }

        vehicleInfo.append(":").append("\n\n");
        for (Vehicle vehicle : vehicleList) {
            vehicleInfo.append(vehicle.getInfo()).append("\n");
        }

        return vehicleInfo.toString();
    }
}

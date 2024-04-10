public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * Constructor 1.
     */
    public MotorBike(String brand, String model,
                     String registrationNumber, Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * return information of MotorBike.
     */
    @Override
    public String getInfo() {
        return String.format("Motor Bike:\n\tBrand: %s\n\tModel: %s\n\tRegistration Number: %s"
                        + "\n\tHas Side Car: %b\n\tBelongs to %s - %s",
                brand, model, registrationNumber, hasSidecar, owner.getName(), owner.getAddress()
        );
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}

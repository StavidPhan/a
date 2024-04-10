public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Constructor 1.
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * return information of Car.
     */
    @Override
    public String getInfo() {
        return String.format("Car:\n\tBrand: %s\n\tModel: %s\n\tRegistration Number: %s"
                        + "\n\tNumber of Doors: %d\n\tBelongs to %s - %s",
                brand, model, registrationNumber, numberOfDoors, owner.getName(), owner.getAddress()
        );
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}

public class Car extends Vehicle {
    public Car(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 0.9; // Discount for Cars;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
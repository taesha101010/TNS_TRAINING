package RentVehicle;

public class Truck extends Vehicle {

    private static final double insurance = 500;

    public Truck(String id, String model, double dailyRate) {
        super(id, model, dailyRate);
    }

    @Override
    public double calculateRent(int days) {
        return dailyRate * days + insurance;
    }
}

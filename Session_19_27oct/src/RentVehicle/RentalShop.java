package RentVehicle;

import java.util.ArrayList;
import java.util.List;

public class RentalShop {

    private final List<Vehicle> fleet = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Rental rent(String vehicleId, Customer customer, int days) {
        Vehicle vehicle = null;

        for (Vehicle v : fleet) {
            if (v.getId().equals(vehicleId)) {
                vehicle = v;
                break;
            }
        }

        if (vehicle == null) {
            throw new IllegalArgumentException(
                    "RentVehicle.Vehicle " + vehicleId + " not found");
        }

        if (!vehicle.isAvailable()) {
            throw new IllegalArgumentException(
                    vehicle + " is already rented");
        }

        Rental rental = new Rental(vehicle, customer, days);
        vehicle.setAvailability(false);
        customer.addRental(rental);

        return rental;
    }

    public void giveBack(String vehicleId) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getId().equals(vehicleId)) {
                if (vehicle.isAvailable()) {
                    throw new IllegalArgumentException(
                            vehicle + " is not currently rented");
                }

                vehicle.setAvailability(true);
                return;
            }
        }

        throw new IllegalArgumentException(
                "RentVehicle.Vehicle " + vehicleId + " not found");
    }

    public void showAvailable() {
        System.out.println("Available vehicles:");

        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailable()) {
                System.out.println("  " + vehicle);
            }
        }
    }
}

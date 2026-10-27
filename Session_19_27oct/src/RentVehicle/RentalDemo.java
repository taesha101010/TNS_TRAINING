package RentVehicle;

public class RentalDemo {

    public static void main(String[] args) {

        RentalShop shop = new RentalShop();

        Car car = new Car("C1", "Swift", 1500);
        Bike bike = new Bike("B1", "Activa", 400);
        Truck truck = new Truck("T1", "Tata Ace", 2500);

        shop.addVehicle(car);
        shop.addVehicle(bike);
        shop.addVehicle(truck);

        Customer asha = new Customer("Asha");
        Customer ravi = new Customer("Ravi");

        try {
            System.out.println(shop.rent("B1", asha, 8));
            System.out.println(shop.rent("T1", ravi, 2));

            shop.rent("B1", ravi, 3);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        shop.giveBack("B1");

        shop.showAvailable();
    }
}

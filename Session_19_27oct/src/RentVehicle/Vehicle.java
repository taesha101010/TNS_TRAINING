package RentVehicle;

public abstract class Vehicle implements Rentable {
    private final String id;
    private final String model;
    protected final double dailyRate;
    private boolean available = true;

    public Vehicle(String id, String model, double dailyRate){
        this.id = id;
        this.model = model;
        this.dailyRate = dailyRate;


    }

    public String getId() {
    return id;
    }

    public String getModel(){
        return model;
    }

    public void setAvailability(boolean available){
        this.available = available;

    }


    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + model + " (" + id + ")";
    }

}

package RentVehicle;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final List<Rental> history = new ArrayList<>();

    public Customer(String name){
        this.name = name;

    }

    public List<Rental> getHistory(){
        return  history;

    }

    void addRental(Rental rental) {
        history.add(rental);
    }
    public String getName() {
        return name;
    }

}

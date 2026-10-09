class Car {
    String color;
    String brand;
    int speed;
    
    Car(String color, String brand, int speed){
        this.color = color;
        this.brand = brand;
        this.speed = speed;
    }
    
    public void displayInfo() {
         System.out.println("Brand: "+ brand + " Color: "+ color + " Speed: "+ speed);  
    }
    
    public void accelerate(int incr){
        speed += incr;
        System.out.println(brand + " accelerated. New speed is "+ speed);
    }
}

public class CarOops {
    public static void main(String[] args) {
        Car c1 = new Car("blue", "BMW", 360);
        c1.displayInfo();
        c1.accelerate(20);
        c1.displayInfo();
    }
}
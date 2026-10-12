// IN-A-REALTIONSHIP
// Implemented via: The extends keyword (or implements for interface).
//plain English test: "Is a Dog an Aniaml?" yes. Therefore ,Dog is A Animal.

//2.HAS-A-RELATIONSHIP
// Implemented via: The new keyword (or composition/Aggregation ).
//A Has-A-Relationship represemts contaiment or ownership.it means one class holds a reference.
//implemented via: Declaring an instance of one class inside another class.

//plain english test : "Does a car have an engine?" yes. therefore , car has a engine"

class Engine{
    void start(){
        System.out.println("Engine starting...");
    }
}

class Car{
    private Engine engine;
    Car(){
        this.engine = new Engine();
    }

    void drive(){
        engine.start();
        System.out.println("Car is moving...");
    }
}

//////////

class Address{
    String city;
    String state;
    int pincode;

    Address(String city, String state, int pincode){
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    void displayAddress(){
        System.out.println(city + ", "+ state + ", "+ pincode);
    }

}

class Student{
    String name;
    int rollNumber;
    Address address;


    Student(String name, int rollNumber, Address address){
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
    }

    void displayProfile(){
        System.out.println("Student: " + name + "\nRoll No. "+ rollNumber);
        System.out.println("Lives at: ");
        address.displayAddress();
    }
}
//////////
/// 
class Battery {
    int capacityMaH;
    Battery(int capacitymaH){
        this.capacityMaH = capacitymaH;
    }

    void drain(){
        System.out.println("Battery used. \ncapacity remaining: " +(capacityMaH - 100) + "M");
    }
}


class Camera {
    int pix;

    Camera(int pix) {
        this.pix = pix;
    }

    void takePhoto() {
        System.out.println("Click.... captured a photo with "
                + pix + " sensor");
    }
}

class Battery {
    void drain() {
        System.out.println("Battery is draining...");
    }
}

class Phone {
    String brand;
    Battery battery;
    Camera camera;

    Phone(String brand, Battery battery, Camera camera) {
        this.brand = brand;
        this.battery = battery;
        this.camera = camera;
    }

    void snapPicture() {
        System.out.println("[" + brand + "] is active");
        camera.takePhoto();
        battery.drain();
    }
}

//Static, final,abstract
//static college = "IIT";
//abstract calaculateAra();
class Stud {
    String name;
    static String collegeName = "IITBombay";
    Stud (String name){
        this.name = name;
    }
    void stuCol(){
        System.out.println(name + " Studies in "+ collegeName);
    }
}




//Static variable

class Bank{
    final void calculateInterest(){
        System.out.println("Base  Intrest calculation");

    }

}

class Branch extends Bank{
    void calculateIntrest(){
        System.out.println("Custom Intrest");
    }
}

//////////
/// 
/// 
